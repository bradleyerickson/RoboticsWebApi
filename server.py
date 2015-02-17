#!/usr/bin/python
from urlparse import urlparse
from subprocess import check_output

from BaseHTTPServer import BaseHTTPRequestHandler, HTTPServer

PORT = 8080

_COMMAND_MAP = {
    # path (endpoint) =>  shell command
    'ls': 'ls -a',
    'free': 'df',
    'run-demo': './demo',
    'run-wander': './wander',
    'run-levy': './levywalk'
}


class MrsRequestHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header('Content-type', 'text/html')
        self.end_headers()
        endpoint = urlparse(self.path).path.split('/')[-1].lower()

        self.wfile.write('{}<br />'.format(endpoint))
        if endpoint not in _COMMAND_MAP:
            self.wfile.write('Unknown command')
            return

        command = _COMMAND_MAP[endpoint]
        self.wfile.write(check_output(command, shell=True))
        return


class MrsServer(HTTPServer):
    def __init__(self, port=PORT, host=''):
        HTTPServer.__init__(self, (host, port), MrsRequestHandler)

if __name__ == '__main__':
    server = MrsServer()
    try:
        print('serving on port {}'.format(PORT))
        server.serve_forever()
    except KeyboardInterrupt:
        print('^C received, shutting down the web server')
        server.socket.close()
