const MongoClient = require('mongodb').MongoClient

class tictactoe {
 getState(callback){
    MongoClient.connect('mongodb://localhost:27017',(err,conn)=>{
       conn.db('tictactoedb').collection('tictac').find().toArray((err,state)=>{
           if(!err){
               callback(state);
           }
       })
    })

 }
 saveState(state,callback){
    MongoClient.connect('mongodb://localhost:27017',(err,conn)=>{
       conn.db('tictactoedb').collection('tictac').update({_id:1},{$set: state},{upsert: true},(err,state)=>{
           if(!err){
               callback(err,state);
           }
       })
    })

 }
}

module.exports.tictactoeClass = tictactoe;