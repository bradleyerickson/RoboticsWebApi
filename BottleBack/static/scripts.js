var roboticsApp = angular.module('roboticsApp', ['ngRoute']);

//routes

roboticsApp.config(function($routeProvider) {
	$routeProvider
	
	//route for homepage
	.when('/', {
		templateUrl : 'static/pages/home.html',
		controller : 'mainController'
	})
	
	.when('/run', {
		templateUrl : 'static/pages/run.html',
		controller : 'runController'
	});
});

roboticsApp.controller('mainController', function($scope) {
	
	$scope.message = 'Robotics Home Page';
});

roboticsApp.controller('runController', function($scope) {
	$scope.message = 'Robotics Running Page'
});


