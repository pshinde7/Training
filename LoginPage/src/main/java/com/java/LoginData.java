package com.java;

public class LoginData {
String userName;
String passwod;

public LoginData(){
	
}

public LoginData(String userName, String passwod) {
	this.userName = userName;
	this.passwod = passwod;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPasswod() {
	return passwod;
}
public void setPasswod(String passwod) {
	this.passwod = passwod;
}

}
