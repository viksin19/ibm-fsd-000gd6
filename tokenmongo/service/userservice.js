const Mongo = require('mongodb').MongoClient
const bcrypt = require('bcrypt')
const url = 'mongodb://localhost:27017/'
class userService {

    // fetchuser
fetchuser(email,password,callback){

    //const hashpass = this.generateHash(password);
    Mongo.connect(url,(err,conn)=>{
          conn.db('userjwt').collection('user').find({email: email}).toArray((err,response)=>{
              callback(err,response);
          })
    })
}
//  add user
adduser(user,callback){
    
    Mongo.connect(url,(err,conn)=>{
        user.password = this.generateHash(user.password);
        
            conn.db('userjwt').collection('user').insert(user,(err,response)=>{
                callback(err,response)
            })
        
    })
}
generateHash(_pass){
    return bcrypt.hashSync(_pass,1)
}

}


module.exports.userService = userService