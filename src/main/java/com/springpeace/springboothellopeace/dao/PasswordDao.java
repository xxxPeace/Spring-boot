package com.springpeace.springboothellopeace.dao;

import java.util.List;

import com.springpeace.springboothellopeace.model.MyPassword;

public interface PasswordDao {

	public void addMyPassword(MyPassword myPassword);
	public List<MyPassword> getAllMyPassword();
	public MyPassword getMyPasswordById(int id);
	public MyPassword getMyPasswordByApplication(String application);
	public MyPassword getMyPasswordByUserName(String userName);
	public int updateMyPassword(MyPassword myPassword);
	public void deleteMyPassword(int id);
	

}
