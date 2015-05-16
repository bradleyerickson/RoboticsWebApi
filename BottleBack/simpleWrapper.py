#Wrapper for running Aria python commands in bottle.
#Need to have PYTHONPATH=$PYTHONPATH:/usr/local/Aria/python in your path

from AriaPy import *
import sys


class moveRobot():
    # NOTE must call once
    # TODO pass in robot object to __init__()
    Aria_init()

    parser = ArArgumentParser(sys.argv)
    parser.loadDefaultArguments()

    #Create Robot Object
    robot = ArRobot()

    #Create a "simple connector"
    con = ArRobotConnector(parser, robot)
    if not Aria_parseArgs():
        Aria_logOptions()
        Aria_exit(1)

    if not con.connectRobot():
        print "Could not connect to robot, exiting"
        Aria_exit(1)

    def moveForward(self):
        self.robot.runAsync(1)
        self.robot.lock()
        self.robot.enableMotors()
        self.robot.move(1000)
        self.robot.unlock()
        ArUtil_sleep(5000)
        Aria_shutdown()

    def turnAround(self):
        self.robot.runAsync(1)
        self.robot.lock()
        self.robot.enableMotors()
        self.robot.setHeading(180)
        self.robot.unlock()
        ArUtil_sleep(5000)
        Aria_shutdown()

    def turnRight(self):
        self.robot.runAsync(1)
        self.robot.lock()
        self.robot.enableMotors()
        self.robot.setHeading(90)
        self.robot.unlock()
        ArUtil_sleep(5000)
        Aria_shutdown()

    def turnLeft(self):
        self.robot.runAsync(1)
        self.robot.lock()
        self.robot.enableMotors()
        self.robot.setHeading(-90)
        self.robot.unlock()
        ArUtil_sleep(5000)
        Aria_shutdown()

    def moveBackward(self):
        self.robot.runAsync(1)
        self.robot.lock()
        self.robot.enableMotors()
        self.robot.move(-1000)
        self.robot.unlock()
        ArUtil_sleep(5000)
        Aria_shutdown()


def main():
    newRobot = moveRobot()
    newRobot.moveForward()
    newRobot.turnAround()
    newRobot.turnRight()
    newRobot.turnLeft()
    newRobot.moveForward()


if __name__ == '__main__':
    main()
