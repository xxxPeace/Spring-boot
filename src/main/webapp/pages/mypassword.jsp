<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<body>



<H1>Find my password</H1>

<div ng-app="peaceApp" ng-controller="formCtrl">
	
	<h2>Input Id number or application name:</h2>
	<form>
		<input type="text" ng-model="key">
		<input type="submit" ng-click="submit()">
	</form>


<p>ID: {{myPassword.id}}</p>
<p>Application: {{myPassword.application}}</p>
<p>User name: {{myPassword.userName}}</p>
<p>Password: {{myPassword.password}}</p>
</div>


<script src="/scripts/app.js"></script>
<script src="/scripts/controllers/passwordController.js"></script>
</body>
</html>