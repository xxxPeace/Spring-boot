<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<body>



<H1>add my password</H1>

<div ng-app="peaceApp" ng-controller="addPasswordCtrl">
	
	
	<form name="myPasswordform">
		<p>Application name:</p><input type="text" ng-model="application" required>
		<p>User name:</p><input type="text" ng-model="userName" required>
		<p>Password:</p><input type="text" ng-model="password" required>
		<br><br>
		<input type="submit" ng-disabled="myPasswordform.$invalid" ng-click="submit()">
	</form>
	<span style="color:blue" >{{massage}}</span>
</div>


<script src="/scripts/app.js"></script>
<script src="/scripts/model/MyPasswordEntity.js"></script>
<script src="/scripts/controllers/addPasswordController.js"></script>
</body>
</html>