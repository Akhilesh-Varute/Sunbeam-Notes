const express = require('express');
const app = express();
const config  = require('config');
const PORT = config.get('port');

const appWithDetailsOfEmpsRoutes =  require('./routes/emps');
const appWithDetailsOfAdminRoutes =  require('./routes/admin');
const appWithDetailsOfProfileRoutes =  require('./routes/profile');
const appWithDetailsOfLoginRoutes =  require('./routes/auth');
const jwt = require('jsonwebtoken');

//console.log(global);

const cors = require('cors');
app.use(cors());
app.use(express.json());

app.use((request, response, next)=>
{
  if(!request.url.includes('login'))
  {
    //Since you have asked other than login..something that needs token
    console.log("Auth Header Received: "+ request.headers.authorization)

    if(request.headers.authorization!=undefined)
    {
      var splitContent =request.headers.authorization.split(' ');
      var token = splitContent[1];
      console.log("Token Received from Header after split: "+token); 
      
      var key =  config.get("jwtkey")      
      
      var decryptedToken = jwt.verify(token,key);

      if(decryptedToken.username == "mahesh" && decryptedToken.role=="manager")
      {
        next();
      }
      else
      {
         var responseText = {action : 'invalidtoken'};
         response.send(responseText);
      }
    }
    else
    {
        var responseText = {action : 'login'};
        response.send(responseText);
    }
  }
  else
  {
    next();
  }
})

app.use("/login", appWithDetailsOfLoginRoutes)
app.use("/emps", appWithDetailsOfEmpsRoutes)
app.use("/admin", appWithDetailsOfAdminRoutes)
app.use("/profile", appWithDetailsOfProfileRoutes)


app.listen(PORT, ()=>{console.log(`server started at port no ${PORT}`)})