# Main bottle route generator
from bottle import *
from subprocess import check_output

#_COMMAND_MAP = {
    #path (endpoint) => shell command
#    'forward':'ls',
#    'backward':'ls',
#    'left' : 'ls -a',
#    'right' : ['echo', 'bye world']
#}

@route('/static/:path#.+#', name='static')
def static(path):
	return static_file(path, root="static")

@route('/')
@route('/index.html')
def index():
	raise static_file('index.html', root='./')
	
#@route('/forward')
#@view('main_temp')
#def direction(forward = 'forward'):
#	command = _COMMAND_MAP[forward]
	
#	if check_output(command, shell=True):
#		return 'Success'
#	else:
#		return 'Fail'

@route('/run')
def running():
	return 'TEMP'
	
run(host='localhost', port=8080)
