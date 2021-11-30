import { config } from "../config/Constants";
import { Request, Response } from "express";
import shortid from "shortid";

export class URLController {
    public async shorten(req: Request, res: Response): Promise<void> {
        // check if url exists
        
        // create hash for url
        const { originURL } = req.body;
        const hash = shortid.generate();
        const shortURL = `${config.API_URL}/${hash}`;
        
        // salve url on db
        
        // return saved url
        res.json({ originURL, hash, shortURL });
       
    }

    public async redirect(req: Request, res: Response): Promise<void> {
        // take url hash
        const { hash } = req.params

        // find original url by url
        const url = {
            "originURL": "https://cloud.mongodb.com/v2/61a61f47772de023b3aee04c#clusters",
            "hash": "68eLw7TNi",
            "shortURL": "http://localhost:5000/68eLw7TNi"
        }
        //redirect to original url from db
        res.redirect(url.originURL);
    }
}