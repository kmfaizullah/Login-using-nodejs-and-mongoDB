const express = require('express')
const router = express.Router()//it will help to route
const Signup= require('./../models/signup') //calling signup js from model


router.get('/', async (req,res)=>{
    /*
      This is index page route.
      After calling this route index page will be rendered.
    */
   
    res.render('index')
   
})


router.get('/signup', async (req,res)=>{
    /*
      This route is for user signup.
      After calling this route signup page will be rendered.
    */
   
    res.render('signup')
   
})


router.post('/signupValue', async (req,res)=>{
      /*
      This a post functio for Signup data.
      It will take the user inserted data and will store it as signup object.
      signup object will have name, email,password and number fields.
      Then it will store the data to database and will redirect to login page.
      If any error occur it will redirect to sigup page again.
    */
    let signup = new Signup({
        name: req.body.name,
        email: req.body.email,
        password: req.body.password,
        number: req.body.number

    })

    try{

        signup = await signup.save()
        res.redirect('/')
    } catch(e){
        res.redirect('/Signup')
    }

})


router.post('/login', async (req,res)=>{
      /*
      This method is for user authentication.
      The user will login using email and password.
      This method will check the authenticity of user by reading database signup table values.
      If any error occur it will redirect error page.
      If login is successfull, it will redirect to successful page.
    */
   
    var email = req.body.email;
    var password = req.body.password;

    Signup.findOne({email : email, password : password}, function(err, user){
        if(err){
            res.redirect('/');
        }
        if(!user){
            res.render('error');
        }
        else{
            res.render('success')
        }

    })
   
})



module.exports = router //to read the route we need to export it