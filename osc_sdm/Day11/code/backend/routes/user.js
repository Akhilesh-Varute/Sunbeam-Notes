const express = require('express')
const router = express.Router()
const db = require('../db')
const utils = require('../utils')
const crypto = require('crypto-js')
const jwt = require('jsonwebtoken')
const config = require('../config')

router.post('/signup', (request, response) => {
  const { firstName, lastName, email, password } = request.body
  const sql = `
        insert into user (firstName, lastName, email, password) 
        values (?, ?, ?, ?)
    `
  const encryptedPassword = String(crypto.SHA256(password))
  db.pool.execute(
    sql,
    [firstName, lastName, email, encryptedPassword],
    (error, result) => {
      response.send(utils.createResult(error, result))
    }
  )
})

router.post('/signin', (request, response) => {
  const { email, password } = request.body
  const sql = `
          select * from user 
          where
            email = ? and password = ?
      `
  const encryptedPassword = String(crypto.SHA256(password))
  db.pool.execute(sql, [email, encryptedPassword], (error, result) => {
    if (result.length == 0) {
      // user does not exist
      response.send(utils.createError('user does not exist'))
    } else {
      // user exists
      const user = result[0]
      const payload = {
        id: user.id,
        name: `${user['firstName']} ${user['lastName']}`,
      }
      const token = jwt.sign(payload, config.secret)
      response.send(
        utils.createResult(error, {
          token,
        })
      )
    }
  })
})

module.exports = router
