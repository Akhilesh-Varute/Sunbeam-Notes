const express = require('express');
const app = express.Router();

app.get("/", (request, response)=>{
  response.send("GET for Profile Called.")
})
app.post("/", (request, response)=>{
  response.send("POST for Profile Called.")
})
app.put("/", (request, response)=>{
  response.send("PUT for Profile Called.")
})
app.delete("/", (request, response)=>{
  response.send("DELETE for Profile Called.")
})


module.exports = app;