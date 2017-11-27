app.controller('updatePasswordCtrl',  function($scope,$http,$q) {
	var config = {
		headers:{
			'Content-Type':'application/json'
		}
	}
	
	$scope.updateSubmit = function(){
		//alert("password-api/getPasswordById?id=" +$scope.passwordid + typeof key);
		var updateMyPassword = function(data){
			var deferred = $q.defer();
			$http.put("password-api/updateMyPassword", data, config).then(
		       function(response){
		           // success callback
		    	   deferred.resolve(response);
		    	   var pstatus = response.data;
		    	   if(pstatus==500)
		    		   alert("This application id is not exist!!");
		    	   console.log(response);
		    	   console.log("Ok##############$$$$$$$$$$ update password");
		         }, 
		         function(response){
		           // failure callback
		        	 alert("Some problems occures in server side processing############!!!!!!!!!!!!");
		        	 deferred.reject(response);
		         }
		      );
			  return deferred.promise;
		}
		var data = new MyPassword($scope.id, null, null, $scope.password);
		console.log("data" + data.id + data.password);
		var remote = updateMyPassword(data);
		
	}
});