# Robotics Web Api README

## Front-End:

Required Software to be installed:
- Node.js
- Express.js
- AngularJs and Bootstrap (These should already be linked to but just in case)
- Socket.io (Again more than likely same as above but incase you get an error)

**Run front end after starting back-end**

Steps to run front-end:

1. Navigate to folder RoboticsWebApi/angularFrontEnd/roboticsFront
2. run app.js with command Node app.js
3. This should pop up a message saying listening on port 3000
4. Open a browser (Preferably chrome or firefox) and navigate to port 3000
5. Go to the run page to interact with the back-end by clicking buttons
**The buttons will glow green when clicked and the terminal will display the response**

## Back-End

Required Software to be installed: 

- Bottle.py
- Python 2.7 (Aria doesn't work with 3+)

Steps to run back-end:

1. Navigate to folder RoboticsWebApi/BottleBack
2. using python 2.7 run command python generator.py 
3. This should start the service and it will mention it is listening on port 8080
4. Start the front-end to start communicating with the back-end


### ARIA

You will need to be connected to a robot in either a live environment or a MobileSim environment. 
MobileSim is offered by the same company that puts out Aria and can be downloaded at this link: 
http://robots.mobilerobots.com/wiki/MobileSim

You will start a MobilSim environment and have it listening on a specified port 
(Aria's Py files should default to the port the robot is run on by default in MobileSim)

Speaking of Aria you will be able to download the files needed from the gitHub repo but if you are on 
Windows you may hit an error with path length. (I have not figure how to fix this error yet Unix seems unaffected)

Once you have the Aria programs installed and a MobileSim environment running or a live environment you can test the robot by 
navigating to the PythonExamples folder and running teleop.py which will allow you to control the robot in the 
environment. 

If you have problems getting Aria python working or Aria in general refer to: 
http://robots.mobilerobots.com/wiki/ARIA
