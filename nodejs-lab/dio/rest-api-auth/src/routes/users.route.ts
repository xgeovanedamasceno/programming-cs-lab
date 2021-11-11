import { NextFunction, Router, Request, Response } from "express";
import { StatusCodes } from "http-status-codes";

const usersRoute = Router();

usersRoute.get('/users', (req: Request, res: Response, next: NextFunction) => {
    const users = [{username: 'Paulo'}];
    res.status(StatusCodes.OK).send({ users })
});

usersRoute.get('/users/:uuid', (req: Request<{ uuid: string}>, res: Response, next: NextFunction) => {
    const uuid = req.params.uuid;
    
    res.status(StatusCodes.OK).send({ uuid })
});





export default usersRoute;