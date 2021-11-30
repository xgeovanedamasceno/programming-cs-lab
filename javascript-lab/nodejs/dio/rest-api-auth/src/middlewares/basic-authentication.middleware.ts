import { NextFunction, Request, Response } from "express";
import ForbiddenError from "../models/errors/forbidden.error.model";
import userRepository from "../repositories/user.repository";

async function basicAuthenticationMiddleware(req: Request, res: Response, next: NextFunction) {
    try {
        const authorizationHeader = req.headers['authorization'];
  
        if (!authorizationHeader) {
            throw new ForbiddenError('Crendetials error');
        }

        const [ authenticationType, token ] = authorizationHeader.split(' ');

        if (authenticationType !== 'Basic' || !token) {
            throw new ForbiddenError('Invalid Authentication Type')
        }

        const tokenContent = Buffer.from(token, 'base64').toString('utf-8');

        const [ username, password ] = tokenContent.split(':');
    
        if (!username || !password) {
            throw new ForbiddenError('Crendentials empty');
        }    

        const user = await userRepository.findByUsernameAndPassword(username, password);

        if (!user) {
            throw new ForbiddenError('User and Password invalid');
        }

        req.user = user;
        next(); // next handler

    } catch (error) {
        next(error);
    }
}

export default basicAuthenticationMiddleware;