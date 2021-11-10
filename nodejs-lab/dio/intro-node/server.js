import { createServer } from 'http';

const host = 'http://localhost';
const port = 3000;

createServer((req, res) => {
    res.end('<h1>Working</h1')
}).listen(port, () => console.log(`Server is running at ${host}:${port}`))
