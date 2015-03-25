<!DOCTYPE HTML> 

<!-- Define the angular app --> 
<html ng-app="roboticsApp">
	<head>
		<title>Robotics Web API</title>
		<!--CSS Files-->
		<link rel="stylesheet" href="static/bootstrap.min.css">
		<!--Scripts-->
		<script type="text/javascript" src="static/angular.js" charset="utf-8"></script>
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.25/angular-route.js" charset="utf-8"></script>
		<script type="text/javascript" src="static/ui-bootstrap.min.js" charset="utf-8"></script>
		<script type="text/javascript" src="static/scripts.js" charset="utf-8"></script>
	</head>
	<body ng-controller="mainController">
		<nav class="navbar navbar-default">
			<div class="container">
				<div class="navbar-header">
					<a class="navbar-brand" href="/">Robotics Web Api</a>
				</div>
				
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Home</a></li>
					<li><a href="#/run">Run</a></li>
				</ul>
			</div>
		</nav>
		
		<div id="main">
		
			<!--Angular template where more will be injected -->
			<div ng-view></div>
		
		</div>
	</body>
</html>
