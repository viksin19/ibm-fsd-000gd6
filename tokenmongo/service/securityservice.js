const mongo =require('mongodb').MongoClient
const jwt  = require('jsonwebtoken');
url = 'mongodb://localhost:27017'
class security {
 
    authorize(req,res,next){
      const _token = req.headers.token

      if(!_token){
        
        res.redirect('/user/unauthorize')
      }else{
          const _path = req.path;
          const tdetails = this.verifytoken(_token)
          console.log(tdetails,_path)
          if(tdetails){

          
          if(tdetails.access == _path){
              
              next();

          }else{
              res.redirect('/user/unauthorize');
          }
      }else {
        res.redirect('/user/unauthorize');
           }
    }
}

    verifytoken(_token){
        let validtoken = false;
        
        try{
            const isvalid = jwt.verify(_token,'secretkey');
            if(isvalid){
                validtoken = isvalid;
            }
        }catch{

            }
            return validtoken;
        }


     generatetoken(_user){
             const _token = jwt.sign(
                 _user,
                 'secretkey',
                 {
                 expiresIn : '120000ms'
                  })

             return _token;
        }

     savetoken(user,callback){

        const  id = user.id;
        delete user.id
 
        mongo.connect(url,(err,conn)=>{
              
            conn.db('userjwt').collection('security').update(
                {_id: id},
                {$set : user},
                {upsert : true},
                (err,response)=>{
                    callback(err,response)
                })
        })
      }  
    }

    module.exports.securityService = security



