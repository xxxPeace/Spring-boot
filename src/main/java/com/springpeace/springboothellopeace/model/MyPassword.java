package com.springpeace.springboothellopeace.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyPassword_db")
public class MyPassword  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	private String application;
	private String userName;
	private String password;
	
	
	public MyPassword() {
		super();
	}
	public MyPassword(int id, String application, String userName, String password) {
		this.id=id;
		this.application = application;
		this.userName=userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyPassword [id=" + id + ", application=" + application + ", userName=" + userName + ", password="
				+ password + "]";
	}
	
}
