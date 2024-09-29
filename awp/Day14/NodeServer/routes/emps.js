const express = require('express');
const app = express.Router();
const config = require('config');


const mysql = require('mysql');

const connectionDetails  = {
                                host: config.get("server"),
                                database: config.get("database"),
                                user: config.get("uname"),
                                password: config.get("pwd")
                           }

app.get("/", (request, response)=>
{
  var statement = `select * from Emp`;
  var connection = mysql.createConnection(connectionDetails);
  connection.query(statement, (error, result)=>{
    if(error==null)
    {
        console.log("GET call received for /emps ");
        response.setHeader("Content-Type", "application/json");
        connection.end();
        response.write(JSON.stringify(result));
        response.end();  
    }
    else
    {
        console.log("GET call received for /emps ");
        response.setHeader("Content-Type", "application/json");
        connection.end();
        response.write(JSON.stringify(error));
        response.end();  
    }
  })
})

app.post("/", (request, response)=>
{
  
  var statement = `insert into Emp values(${request.body.No}, '${request.body.Name}', '${request.body.Address}')`;

  console.log(statement);

  var connection = mysql.createConnection(connectionDetails);
  connection.query(statement, (error, result)=>{
    if(error==null)
    {
        console.log("POST call received for /emps ");
        response.setHeader("Content-Type", "application/json");
        connection.end();
        response.write(JSON.stringify(result));
        response.end();  
    }
    else
    {
        console.log("POST call received for /emps ");
        response.setHeader("Content-Type", "application/json");
        connection.end();
        response.write(JSON.stringify(error));
        response.end();  
    }
  })
})


app.delete("/:No", (request, response)=>
{
  
  var statement = `delete from Emp where No = ${request.params.No}`;

  console.log(statement);

  var connection = mysql.createConnection(connectionDetails);
  connection.query(statement, (error, result)=>{
    if(error==null)
    {
        console.log("DELETE call received for /emps ");
        response.setHeader("Content-Type", "application/json");
        connection.end();
        response.write(JSON.stringify(result));
        response.end();  
    }
    else
    {
        console.log("DELETE call received for /emps ");
        response.setHeader("Content-Type", "application/json");
        connection.end();
        response.write(JSON.stringify(error));
        response.end();  
    }
  })
})

module.exports = app;