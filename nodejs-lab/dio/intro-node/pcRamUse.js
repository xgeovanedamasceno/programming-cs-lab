const OS = require('os');

const { arch, platform, totalmem, freemem } = OS;

const tRAM = totalmem()/1024/1024;
const fRAM = freemem()/1024/1024;

const status = {
    OS: platform(),
    Arch: arch(),
    TotalRAM: parseInt(tRAM),
    FreeRAM: parseInt(fRAM),
}

console.log(status);
