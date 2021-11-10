const http = require('http');
const status0S = require('./pcRamUse.js');



const host = 'http://localhost';
const port = 3000;

http.createServer((req, res) => {
    let url = req.url;

    if (url  === '/status') res.end(JSON.stringify(status0S, null, 2))
    else res.end('<h1>Home - Welcome</h1>')
}).listen(port, () => console.log(`Server is running at ${host}:${port}, ${status0S}`))
