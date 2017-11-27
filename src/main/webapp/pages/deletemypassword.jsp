<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<body>



<H1>Delete my password</H1>

<div ng-app="peaceApp" ng-controller="deletePasswordCtrl">
	
	
	<form name="deleteForm">
		<p>Application ID:</p><input type="text" ng-model="id" required>
		<br><br>
		<input name="deleteButton" type="submit" ng-disabled="deleteForm.$invalid" ng-click="deleteSubmit()" value="delete My Password">
	</form>
	<span style="color:red" >{{massage}}</span>
</div>


<script src="/scripts/app.js"></script>
<script src="/scripts/controllers/deletePasswordController.js"></script>
</body>
</html>