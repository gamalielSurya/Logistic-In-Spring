package com.gamaliel.surya;

public class user {
	public int userId;
	public String userName;
	public String userPosition;
	public int userExtNumber;
	public user(int userId, String userName, String userPosition, int userExtNumber) {
		this.userId = userId;
		this.userName = userName;
		this.userPosition = userPosition;
		this.userExtNumber = userExtNumber;
	}
	public user() {

	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPosition() {
		return userPosition;
	}
	public void setUserPosition(String userPosition) {
		this.userPosition = userPosition;
	}
	public int getUserExtNumber() {
		return userExtNumber;
	}
	public void setUserExtNumber(int userExtNumber) {
		this.userExtNumber = userExtNumber;
	}
	
}
