const userService = require('../service/userservice').userService
const server = require('express').Router();
const userobj = new userService();
const securityService = require('../service/securityservice').securityService
const securityobj = new securityService()

server.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message: 'User Service is Running'
    })
})

server.post('/register',(req,res)=>{
    userobj.adduser(req.body,(err,rs)=>{
         if(err){
             res.status(400).json({
                 message : 'unable to add',
                 errrr: err
             })
         }else{
             res.status(200).json({
                 message: 'successfully added',
                 user: rs
             })
         }
    })
})

server.post('/login',(req,res)=>{

    if(req.body.email == undefined || req.body.password == undefined){
        res.status(403).json({
            message : 'Enter valid Credential'
        })
    }else{
           userobj.fetchuser(req.body.email,req.body.password,(err,response)=>{
               if(err){
                res.status(403).json({
                    message : 'Enter valid Credential'
                })
               }else{
                   if(response.length > 0 ){ 
                   const _token = securityobj.generatetoken({
                       email : response[0].email,
                       access : response[0].access
                   })
                    const _user = {
                        id : 1,
                        token : _token,
                        access: response[0].access,
                        email : response[0].email
                    }

                    securityobj.savetoken(_user,(err,data)=>{
                        if(err){
                            res.satus(401).json({
                               message: 'unable to save token' 
                            })
                        }else {
                            res.status(200).json({
                                message: 'token saved successfully',
                                token : _token
                            })
                        }
                    })
                   }else {
                       res.status(401).json({
                           message : 'Unable to generate token'
                       })
                   }

               }
       })
    }

})


server.get('/unauthorize',(rq,rs)=>{
    rs.status(403).json({
        message : 'Unauthorize Access'
    });
});

module.exports.userApi = server