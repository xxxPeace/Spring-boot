app.controller('addPasswordCtrl',  function($scope,$http,$q) {
	var config = {
		headers:{
			'Content-Type':'application/json'
		}
	}
	
	$scope.submit = function(){
		//alert("password-api/getPasswordById?id=" +$scope.passwordid + typeof key);
		var addMyPassword = function(data){
			var deferred = $q.defer();
			$http.post("password-api/addMyPassword", data, config).then(
		       function(response){
		           // success callback
		    	   deferred.resolve(response);
		    	   var pstatus = response.data;
		    	   if(pstatus==500)
		    		   alert("The application is already exist!!");
		    	   else
		    		   $scope.massage="Save Suscess."
		    	   console.log("Ok##############$$$$$$$$$$");
		         }, 
		         function(response){
		           // failure callback
		        	 alert("Some problems occures in server side processing############!!!!!!!!!!!!");
		        	 deferred.reject(response);
		         }
		      );
			  return deferred.promise;
		}
		var data = new MyPasswordEntity($scope.application, $scope.userName, $scope.password);
		console.log("data" + data.application + data.userName + data.password);
		var remote = addMyPassword(data);
		
	}
});