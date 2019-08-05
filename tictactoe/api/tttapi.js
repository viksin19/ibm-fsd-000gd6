const server = require('express').Router();
const tictactoeClass = require('../tttservice/tttservice').tictactoeClass
const tictacobj = new tictactoeClass()

server.get('/',(req,res)=>{
    res.status(200).json({
        message: 'TicTacToe Server is running'
    })
})
 
server.get('/resume',(req,res)=>{
    tictacobj.getState((state)=>{
        res.status(200).json({
            message: 'state is fetched',
            state: state
        })

    })
})


server.post('/save',(req,res)=>{
    tictacobj.saveState(req.body,(err,result)=>{
        if(err){
            res.status(400).json({
                message: 'unable to save state'
            })
            
        }else{
            res.status(200).json({
                message:'State saved successfully',
                result: result
            })
          
        }
    })
})

module.exports.userRoutes = server 
