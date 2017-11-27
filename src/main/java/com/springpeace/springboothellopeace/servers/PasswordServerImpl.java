package com.springpeace.springboothellopeace.servers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpeace.springboothellopeace.dao.PasswordDao;
import com.springpeace.springboothellopeace.model.MyPassword;

@Service
public class PasswordServerImpl implements PasswordServer{
	@Autowired
	private PasswordDao passwordDao;
	
	@Override
	public List<MyPassword> addPassword() {
		List<MyPassword> myListPassword = new ArrayList<MyPassword>();
		MyPassword mp1 = new MyPassword(0,"ebay","rtanpeace", "qq3683266hp");
		MyPassword mp2 = new MyPassword(1,"gmail","25238290","qq36832666hp14");
		MyPassword mp3 = new MyPassword(2,"qq","peace","qq36832666hp14");
		
		myListPassword.add(mp1);
		myListPassword.add(mp2);
		myListPassword.add(mp3);
		
		return myListPassword;
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public synchronized int addMyPassword(MyPassword myPassword){
		boolean isExist=false;
		List<MyPassword> lp = passwordDao.getAllMyPassword();
		for(MyPassword mp:lp) {
			if(mp.getApplication()!=null)
				if(mp.getApplication().toLowerCase().equals(myPassword.getApplication().toLowerCase())){
					isExist=true;
				}
			System.out.println(mp);
		}
		
		if(!isExist) {	
			passwordDao.addMyPassword(myPassword);
			return 200;
		}else {
			System.out.println("The application is exist!!!!!!!!!!");
			return 500;
		}
	}
	
	@Override
	public MyPassword getPasswordById(int id) {	
		return passwordDao.getMyPasswordById(id);
	}
	
	@Override
	public MyPassword getPasswordByName(String userName){
		return passwordDao.getMyPasswordByUserName(userName);
	}
	
	@Override
	public MyPassword getPasswordByApplication(String application){
		return passwordDao.getMyPasswordByApplication(application);
	}

	@Override
	public synchronized int updateMyPassword(MyPassword myPassword) {
		return passwordDao.updateMyPassword(myPassword);
	}
	
	@Override
	public void deleteMyPassword(int id) {
		passwordDao.deleteMyPassword(id);
	}
}
