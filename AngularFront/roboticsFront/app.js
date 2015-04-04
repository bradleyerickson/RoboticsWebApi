var express = require('express');
var app = express();
var http = require('http').Server(app);
var io = require('socket.io')(http);
var path = require('path');
var sleep = require('sleep');
http.listen(3000, function() {
	console.log('Listening on *.3000');
});

app.use(express.static(path.join(__dirname, 'public')));

app.get('/', function(req, res) { 
	res.sendfile('./views/index.html');
});

io.sockets.on('connection', function(socket) {
	var app2 = express();
	var http2 = require('http'); 
	var resString = '';
	
	socket.on('forward', function(msg) {
		console.log(msg);	
		var options = {
			host: 'localhost',
			port: 8080,
			path: '/forward',
			method: 'GET',
			headers: {
				accept: 'application/json'
			}
		};	
		req = http2.request(options, function(res){
			res.setEncoding('utf-8');
			res.on('data', function(chunk){
				if(chunk == 'SUCCESS')
					resString = chunk;
				else
					resString = 'FAIL'; 
			});
			res.on('end', function(){
				socket.emit('forward', resString);
			});
		});

		req.end();
	});
	socket.on('left', function(msg) {
		console.log(msg);
		var options = {
			host: 'localhost',
			port: 8080,
			path: '/left',
			method: 'GET',
			headers: {
				accept: 'application/json'
			}
		};		
		req = http2.request(options, function(res){
			res.setEncoding('utf-8');
			res.on('data', function(chunk){
				if(chunk == 'SUCCESS')
					resString = chunk;
				else
					resString = 'FAIL'; 
			});
			res.on('end', function(){
				socket.emit('left', resString);
			});
		});

		req.end();
	});
	socket.on('right', function(msg) {
		console.log(msg);
		var options = {
			host: 'localhost',
			port: 8080,
			path: '/right',
			method: 'GET',
			headers: {
				accept: 'application/json'
			}
		};		
			req = http2.request(options, function(res){
			res.setEncoding('utf-8');
			res.on('data', function(chunk){
				if(chunk == 'SUCCESS')
					resString = chunk;
				else
					resString = 'FAIL'; 
			});
			res.on('end', function(){
				socket.emit('right', resString);
			});
		});

		req.end();
	});
	socket.on('backward', function(msg) {
		console.log(msg);
		var options = {
			host: 'localhost',
			port: 8080,
			path: '/backward',
			method: 'GET',
			headers: {
				accept: 'application/json'
			}
		};		
		req = http2.request(options, function(res){
			res.setEncoding('utf-8');
			res.on('data', function(chunk){
				if(chunk == 'SUCCESS')
					resString = chunk;
				else
					resString = 'FAIL'; 
			});
			res.on('end', function(){
				socket.emit('backward', resString);
			});
		});

		req.end();
	});
});






