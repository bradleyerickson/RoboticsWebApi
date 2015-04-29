# Main bottle route generator
from bottle import *
from subprocess import check_output
from simpleWrapper import *
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



@route('/left')
def moveLeft():
        newRobot = moveRobot()
        try:
                newRobot.turnLeft()
                return 'SUCCESS'
        except Exception as inst:
                print(inst)
                return 'FAIL'
        
@route('/right')
def moveRight():
        newRobot = moveRobot()
        try:
                newRobot.turnRight()
                return 'SUCCESS'
        except Exception as inst:
                print(inst)
                return 'FAIL'
@route('/backward')
def moveBackward():
        newRobot = moveRobot()
        try:
                newRobot.moveBackward()
                return 'SUCCESS'
        except Exception as inst:
                print(inst)
                return 'FAIL'

@route('/forward')
def moveForward():
        newRobot = moveRobot()
        try:
                newRobot.moveForward()
                return 'SUCCESS'
        except Exception as inst:
                print(inst)
                return 'FAIL'
        
	
run(host='localhost', port=8080)
