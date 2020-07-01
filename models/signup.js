const mongoose = require('mongoose')


/*creating Signup model schema.
  This schema will take four variables name, email, password and contact number.
  All the value will be required while filling from by user.
  it will be follwed while inserting data to mongo
  this will avoid unnecessary error.
*/
const signupSchema= new mongoose.Schema({
    name:{
        type: String,
        required:true
    },
    email: {
        type: String,
        required :true
    },
    password:{
        type:String,
        required: true
    },
    number:{
        type: String,
        required : true
    }

})

//to use this schema we need to export this module
module.exports = mongoose.model('Signup',signupSchema)//for inserting Signup value this schema will be required
