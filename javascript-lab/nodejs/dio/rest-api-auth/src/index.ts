import express, {Request, Response, NextFunction} from 'express';

// app's instance
const app = express(); // lib to manage routes

// setting route and response data
app.get('/status', (req: Request, res: Response, next: NextFunction) => {
    res.status(200).send({ greettings: 'Hello There!' });
});

// setting door
app.listen(3000, () => {
    console.log('Hello Node! App running... Port 3000');
})