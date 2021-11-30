import { NextFunction, Request, Response } from "express";
import ForbiddenError from "../models/errors/forbidden.error.model";
import JWT from 'jsonwebtoken'


async function jwtAuthenticationMiddleware(req: Request, res: Response, next: NextFunction) {
    try {

        const authorizationHeader = req.headers['authorization'];

        if (!authorizationHeader) throw new ForbiddenError('Credentials not found!');

        const [ authenticationType, token ] = authorizationHeader.split(' ');

        if (authenticationType !== 'Bearer' || !token) throw new ForbiddenError('Invalid Authentication');

        try {
            const tokenPayload = JWT.verify(token, 'my_secret_key');
    
            if (typeof tokenPayload !== 'object' || !tokenPayload.sub) throw new ForbiddenError('Invalid token');
    
            const user = {
                uuid: tokenPayload.sub,
                username: tokenPayload.username
            }

            req.user = user;
    
            next();
        } catch (error) {
            throw new ForbiddenError('Invalid Token');
        }
    } catch (error) {
        next(error);
    }
}

export default jwtAuthenticationMiddleware;