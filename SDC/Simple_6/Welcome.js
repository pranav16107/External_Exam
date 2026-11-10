
const http = require('http');
const os = require('os');
const path = require('path');
const EventEmitter = require('events');

// Create event
const myEvent = new EventEmitter();

myEvent.on('welcome', () => {
    console.log('Welcome event occurred!');
});

myEvent.emit('welcome');

// Create server
const server = http.createServer((req, res) => {

    if (req.url === '/details') {

        // OS Information
        const osInfo = `
            <h2>OS Information</h2>
            Platform: ${os.platform()}<br>
            Architecture: ${os.arch()}<br>
            Total Memory: ${os.totalmem()}<br>
            Free Memory: ${os.freemem()}<br>
        `;

        // Path Information
        const filePath = path.join(__dirname, 'example.txt');

        const pathInfo = `
            <h2>Path Information</h2>
            File Path: ${filePath}<br>
            Parsed Path: ${JSON.stringify(path.parse(filePath))}
        `;

        res.writeHead(200, {
            'Content-Type': 'text/html'
        });

        res.end(`
            <h1>System Details</h1>
            ${osInfo}
            ${pathInfo}
        `);

    } else {
        res.writeHead(404);
        res.end('Page Not Found');
    }

});

// Start server
server.listen(3000, () => {
    console.log('Server running on port 3000');
});
