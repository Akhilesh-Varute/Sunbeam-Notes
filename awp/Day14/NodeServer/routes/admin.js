const express = require('express');
const app = express.Router();

app.get("/", (request, response)=>{
  response.send("GET for Admin Called.")
})
app.post("/", (request, response)=>{
  response.send("POST for Admin Called.")
})
app.put("/", (request, response)=>{
  response.send("PUT for Admin Called.")
})
app.delete("/", (request, response)=>{
  response.send("DELETE for Admin Called.")
})

module.exports = app;