<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<body>



<H1>Update my password</H1>

<div ng-app="peaceApp" ng-controller="updatePasswordCtrl">
	
	
	<form name="updateForm">
		<p>Application ID:</p><input type="text" ng-model="id" required>
		<p>New Password:</p><input type="text" ng-model="password" required>
		<br><br>
		<input type="submit" ng-disabled="updateForm.$invalid" ng-click="updateSubmit()" value="update">
	</form>

</div>


<script src="/scripts/app.js"></script>
<script src="/scripts/model/MyPassword.js"></script>
<script src="/scripts/controllers/updatePasswordController.js"></script>
</body>
</html>