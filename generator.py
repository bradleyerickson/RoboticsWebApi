# Main bottle route generator 

from bottle import route, run, Bottle, template

main = Bottle()

@main.route('/')
def index():
	return template('main_temp')

@main.route('/<direction>')
def direction(direction):
	print(direction)
	return direction
	
run(main, host='localhost', port=8080)
