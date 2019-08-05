const express = require('express')
const parser = require('body-parser')
const cors = require('cors')
const userRoutes = require('./api/tttapi').userRoutes;
const server = new express()

server.use(parser.json())
server.use(cors())

server.use('/tictac',userRoutes)

server.get('/',(req,res)=>{
    res.status(200).json({
        message : 'Server is Running'
    })
})

server.listen(4444,()=>{
    console.log('Tic Tac Toe is Running')
})