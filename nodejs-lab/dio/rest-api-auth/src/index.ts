import express from 'express';
import errorHandler from './middlewares/error.-handler.middleware';
import statusRoute from './routes/status.route';
import usersRoute from './routes/users.route';

const app = express();

//Application Settings
app.use(express.json());
app.use(express.urlencoded({ extended: true }))

//Route Settings
app.use(usersRoute);
app.use(statusRoute);

//Setting Errors
app.use(errorHandler);

// Server Init
app.listen(3000, () => {
    console.log("Running... Port: 3000");
});
