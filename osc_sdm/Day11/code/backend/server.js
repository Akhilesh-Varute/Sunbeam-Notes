const express = require('express')
const cors = require('cors')
const morgan = require('morgan')

const app = express()
app.use(morgan('combined'))
app.use(cors())
app.use(express.json())
app.use(express.urlencoded({ extended: true }))

app.get('/', (request, response) => {
  response.send('welcome to my application')
})

const userRouter = require('./routes/user')
app.use('/user', userRouter)

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
