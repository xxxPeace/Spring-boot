package com.springpeace.springboothellopeace.servers;

import java.util.List;
import com.springpeace.springboothellopeace.model.MyPassword;

public interface PasswordServer {
	public List<MyPassword> addPassword();
	public MyPassword getPasswordById(int id);
	public MyPassword getPasswordByApplication(String application);
	public MyPassword getPasswordByName(String userName);
	public int addMyPassword(MyPassword myPassword);
	public int updateMyPassword(MyPassword myPassword);
	public void deleteMyPassword(int id);
	
}
