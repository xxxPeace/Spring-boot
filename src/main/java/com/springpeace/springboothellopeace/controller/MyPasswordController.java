package com.springpeace.springboothellopeace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springpeace.springboothellopeace.model.MyPassword;
import com.springpeace.springboothellopeace.servers.PasswordServer;

@RestController
@RequestMapping("/password-api")
public class MyPasswordController {
	@Autowired
	private PasswordServer passwordServer;
	
	 @RequestMapping(path="/addMyPassword", method = RequestMethod.POST)
	 public int addMyPassword(@RequestBody MyPassword myPassword){
		 return passwordServer.addMyPassword(myPassword);
	        
	 }
	 @RequestMapping(path="/updateMyPassword", method = RequestMethod.PUT)
	 public int updateMyPassword(@RequestBody MyPassword myPassword){
		  return passwordServer.updateMyPassword(myPassword);        
	 }
	
	 @RequestMapping(path="/getPasswordById", method = RequestMethod.GET)
	 public MyPassword getPasswordById(@RequestParam("id") int id){
		 //List<MyPassword> listMyPassword = passwordServer.addPassword();
		 return passwordServer.getPasswordById(id);
	        
	 }
	 
	 @RequestMapping(path="/getPasswordByApplication", method = RequestMethod.GET)
	 public MyPassword getPasswordByApplication(@RequestParam("application") String application){
		 //List<MyPassword> listMyPassword = passwordServer.addPassword();
		 return passwordServer.getPasswordByApplication(application);
	        
	 }
	 
	 @RequestMapping(path="/deleteMyPassword", method = RequestMethod.DELETE)
	 public void deleteMyPassword(@RequestParam("id") int id){
		 //List<MyPassword> listMyPassword = passwordServer.addPassword();
		  passwordServer.deleteMyPassword(id);;
	        
	 }
	 
	 @RequestMapping(path="/getPasswordByName/{name}", method = RequestMethod.GET)
	 public MyPassword getPasswordByName(@PathVariable("name") String name){
		 @SuppressWarnings("unused")
		 List<MyPassword> listMyPassword = passwordServer.addPassword();
		 return passwordServer.getPasswordByName(name);
	        
	 }
}
