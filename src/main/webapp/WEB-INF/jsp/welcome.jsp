<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<body>





<div ng-app="peaceApp" ng-controller="PasswordController">

	<form>
		<input type="text" ng-model="passwordid">
		<input type="submit" ng-click="submit()">
	</form>
	<p ng-bind="passwordid"></p>

</div>

<script>
var app = angular.module('myApp', []);
app.controller('formCtrl', function($scope) {
    $scope.firstname = "John";
});
</script>
<script src="../scripts/app.js"></script>
<script src="../scripts/controllers/passwordController"></script>
</body>
</html>