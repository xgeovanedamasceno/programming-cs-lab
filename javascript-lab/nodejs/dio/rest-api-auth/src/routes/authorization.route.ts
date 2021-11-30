import { NextFunction, Request, Response, Router } from "express";
import ForbiddenError from "../models/errors/forbidden.error.model";
import  JWT  from "jsonwebtoken";
import { StatusCodes } from "http-status-codes";
import basicAuthenticationMiddleware from "../middlewares/basic-authentication.middleware";
import jwtAuthenticationMiddleware from "../middlewares/jwt-authentication.middleware";

const authorizationRoute = Router();

authorizationRoute.post('/token', basicAuthenticationMiddleware, (req: Request, res: Response, next: NextFunction) => {
    try {      
        const user = req.user;

        if (!user) {
            throw new ForbiddenError('User not found!');
        }

        const jwtPayload = { username: user.username };
        const jwtOptions = { subject: user?.uuid };
        const secretKey = 'my_secret_key' ;

        const jwt = JWT.sign(jwtPayload, secretKey, jwtOptions);
        
        res.status(StatusCodes.OK).json({ token: jwt })
  

    } catch (error) {
        next(error);
    }

});

authorizationRoute.post('/token/validate', jwtAuthenticationMiddleware, (req: Request, res: Response, next: NextFunction) => {
    res.sendStatus(StatusCodes.OK);
});

export default authorizationRoute;

/* {
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiaWF0IjoxNjM4MjYwNzQzLCJzdWIiOiI3N2I1YzZmYS0wOTEwLTQ5OTgtOTM2OS1iZDg3MTllZDkzZWQifQ.2qvmPPAzbWZQz4-OYJ3OOh1jKsrRwG5HAoKfOYp2eLs"
} */