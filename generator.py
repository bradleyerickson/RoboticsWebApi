# Main bottle route generator 
import sys
sys.path.insert(0, '/usr/local/Aria/pythonExamples')
from teleop import runProgram
from bottle import *
from subprocess import check_output

main = Bottle()

	
_COMMAND_MAP = {
    #path (endpoint) => shell command
    'forward':'ls',
    'backward':'ls',
    'left' : 'ls -a',
    'right' : ['echo', 'bye world']
}

@main.route('/')
def index():
	return template('main_temp')

@main.route('/<direction>')
def direction(direction):
	command = _COMMAND_MAP[direction]
	
	if check_output(command, shell=True):
		return 'Success'
	else:
		return 'Fail'

@main.route('/run')
def running():
        if runProgram():
		return 'Program is running'
	else:
		return 'Fail'
	
run(main, host='localhost', port=8080)
