const express = require('express')
const server =  express()
const parser = require('body-parser')
const cors = require('cors')
const userApi = require('./api/userapi').userApi;
const security = require('./service/securityservice').securityService
const securityobj = new security()
const productAPis = require('./api/productApi').server; 

server.use(parser.json())
server.use(cors())

server.get('/status',(req,res)=>{
   res.status(200).json({
       message : 'server is running'
   })
})
server.use('/user',userApi)
server.use('/products',(req,res,next)=>{

    securityobj.authorize(req,res,next)
   
})
server.use('/products',productAPis);
server.listen(4351,()=>{
    console.log('server is running at post 4351');
})




