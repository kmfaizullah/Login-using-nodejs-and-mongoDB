const express = require('express') // Importing express server.
const mongoose = require('mongoose')//calling library for connecting with db


mongoose.connect('mongodb://localhost/User',{ useNewUrlParser: true,useUnifiedTopology: true })//connecting MONGODB USER database
const app = express()//setting express server

//to access all parameters of from to model we need server to instruct
app.use(express.urlencoded({extended :false}))

//seeting router to get route in different page
//we did it to make code concise
const UserRouter = require('./routes/User_route')// setting relative path

//calling UserRouters
app.use('/',UserRouter)


//setting view engine for html pages
//we will write ejs code and view engine will convert it to html
app.set('view engine', 'ejs')

app.listen(5000)//Application will run in port: 5000