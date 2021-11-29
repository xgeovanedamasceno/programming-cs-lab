import express, { urlencoded } from 'express';
import errorHandler from './middlewares/error.handler.middleware';
import statusRoute from './routes/status.route';
import usersRoute from './routes/users.route';

// app's instance
const app = express(); // lib to manage routes

// setting application 
app.use(express.json()); // middleware to interpret Header Content Type, if JSON convert to object
app.use(urlencoded({ extended: true})) // middleware to Header Content Type (?)

// setting routes 
app.use(usersRoute);
app.use(statusRoute);

// setting error handler
app.use(errorHandler);

// Init server
app.listen(3000, () => {
    console.log('Hello Node! App running... Port 3000');
});