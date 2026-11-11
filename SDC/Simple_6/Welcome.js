
const http = require('http');
const os = require('os');
const path = require('path');
const EventEmitter = require('events');

// Event module
const event = new EventEmitter();

event.on('welcome', () => {
    console.log("Welcome to Node JS");
});

event.emit('welcome');

// HTTP server
const server = http.createServer((req, res) => {

    if (req.url === '/details') {
        res.writeHead(200, {'Content-Type': 'text/html'});

        res.write("<h2>System Details</h2>");
        res.write("OS: " + os.platform() + "<br>");
        res.write("Architecture: " + os.arch() + "<br>");
        res.write("File: " + path.basename(__filename));

        res.end();
    } else {
        res.writeHead(404);
        res.end("Page Not Found");
    }
});

server.listen(3000, () => {
    console.log("Server running on port 3000");
});
