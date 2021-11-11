import express from 'express';
import statusRoute from './routes/status.route';
import usersRoute from './routes/users.route';

const app = express();

//Application Settings
app.use(express.json());
app.use(express.urlencoded({ extended: true }))

//Route Settings
app.use(usersRoute);
app.use(statusRoute);

// Server Init
app.listen(3000, () => {
    console.log("Running... Port: 3000");
});
