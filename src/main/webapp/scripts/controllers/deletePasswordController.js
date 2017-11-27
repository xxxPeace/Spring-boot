app.controller('deletePasswordCtrl',  function($scope,$http) {
	var config = {
		headers:{
			'Content-Type':'application/json'
		}
	}
	
	$scope.deleteSubmit = function(){
		//alert("password-api/getPasswordById?id=" +$scope.passwordid + typeof key);
		var deleteMyPassword = function(){

			$http.delete("password-api/deleteMyPassword?id="+ $scope.id, config).then(
		       function(response){
		           // success callback
		    	   $scope.massage="Suscess."
		    	   console.log("Ok##############$$$$$$$$$$");
		         }, 
		         function(response){
		           // failure callback
		        	 $scope.massage="The application Id do not exist!! Deletion not Suscess."
		        	 alert("Some problems occures in server side processing############!!!!!!!!!!!!");
		         }
		      );
		}
		console.log("data" + $scope.id);
		var remote = deleteMyPassword();
		
	}
});