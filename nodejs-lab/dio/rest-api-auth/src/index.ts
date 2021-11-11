import express, { Request, Response, NextFunction } from 'express'
import usersRoute from './routes/users.route';

const app = express();

//Application Settings
app.use(express.json());
app.use(express.urlencoded({ extended: true }))

//Route Settings
app.use(usersRoute);

app.get('/status', (req: Request, res: Response, next: NextFunction) => {
    res.status(200).send({ foo: 'Worked' });
});


// Server Init
app.listen(3000, () => {
    console.log("Running... Port: 3000");
});
