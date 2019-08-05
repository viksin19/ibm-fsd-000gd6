const client = require('mongodb').MongoClient;
const url = 'mongodb://localhost:27017'

class Service {
    // get all products
    fetchProducts(callback){
       
        client.connect(url,(err,connection)=>{
            connection
            .db('userjwt')
            .collection('product')
            .find()
            .toArray((error,response)=>{
                callback(error,response);
            });
        });
    } // end of fetch product
}

module.exports={
    ProductService : Service
}