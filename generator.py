# Main bottle route generator 

from bottle import route, run, static_file, Bottle

main = Bottle()

@main.route('/')
def index():
	return static_file('main.html', root='/home/brad/Documents/Bottle/WebApi/RoboticsWebApi')
	
@main.route('/<direction>')
def direction(direction):
	print(direction)
	return static_file('main.html', root='/home/brad/Documents/Bottle/WebApi/RoboticsWebApi')
	
run(main, host='localhost', port=8080)
