/*angular.module('peaceApp')
	.controller('PasswordController', function($scope, BaseRestURI){
		$scope.submit = function(){
			alert("here")
		}
	}); */
app.controller('formCtrl',  function($scope,$http) {
	
	function isCharDigit(n){
		  return !!n.trim() && n*0==0;
	}
	
	$scope.submit = function(){
		//alert("password-api/getPasswordById?id=" +$scope.passwordid + typeof key);
		var key =$scope.key;
		var isTrue =isCharDigit(key);
		var remote;
		if(isTrue){
			remote = $http.get("password-api/getPasswordById?id=" +$scope.key);
		}else{
			remote = $http.get("password-api/getPasswordByApplication?application=" +$scope.key);
		}
		remote.then(function(serverResponse){
			//alert(serverResponse.data.id);
			$scope.myPassword = serverResponse.data;
			//alert($socpe.myPassword.userName);
		},function(serverResponse){
			var status = serverResponse.status;
			if(status == 500)
				alert("The Id or application do not exist");
			else
				alert("Some problems occures in server side processing############!!!!!!!!!!!!");
		});

	}
});