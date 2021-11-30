

import { URLController } from './controller/URLController';
import express from 'express';
import { MongoConnection } from './database/MongoConnection';

const api = express();
api.use(express.json());

const dataBase = new MongoConnection();
dataBase.connect();


const urlController = new URLController

api.post('/shorten', urlController.shorten);

api.get('/:hash', urlController.redirect); //? where the arguments?

api.listen(5000, () => {
    console.log('Express listening... Port number 5000.');
})