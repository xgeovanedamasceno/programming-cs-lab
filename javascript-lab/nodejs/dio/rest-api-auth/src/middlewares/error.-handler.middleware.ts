import { Response, Request, NextFunction } from "express";
import { StatusCodes } from "http-status-codes";
import DatabaseError from "../model/errors/database.error.model";


function errorHandler(error: any, req: Request, res: Response, next: NextFunction) {
    if (error instanceof DatabaseError) {
        res.sendStatus(StatusCodes.BAD_REQUEST)
    } else {
        res.status(StatusCodes.INTERNAL_SERVER_ERROR);
    }
}

export default errorHandler;