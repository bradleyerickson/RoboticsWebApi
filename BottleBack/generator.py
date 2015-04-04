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

#@route('/forward')
#@view('main_temp')
#def direction(forward = 'forward'):
#	command = _COMMAND_MAP[forward]
	
#	if check_output(command, shell=True):
#		return 'Success'
#	else:
#		return 'Fail'

#@route('/static/:path#.+#', name='static')
#def static(path):
#	return static_file(path, root="static")

@route('/')
def index():
	return 'HOME'	


@route('/forward')
@route('/left')
@route('/right')
@route('/backward')
def running():
	return 'SUCCESS'
	
run(host='localhost', port=8080)
