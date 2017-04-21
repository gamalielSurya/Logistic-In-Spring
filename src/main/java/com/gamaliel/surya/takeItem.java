package com.gamaliel.surya;

import java.util.Date;

public class takeItem {
	public String itemCode;
	public int deptId;
	public int userId;
	public Date itemDateTaken;
	public int itemQuantityTaken;
	public String notes;
	public takeItem(String itemCode, int deptId, int userId, Date itemDateTaken, int itemQuantityTaken, String notes) {
		this.itemCode = itemCode;
		this.deptId = deptId;
		this.userId = userId;
		this.itemDateTaken = itemDateTaken;
		this.itemQuantityTaken = itemQuantityTaken;
		this.notes = notes;
	}
	
	public takeItem() {

	}

	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getItemDateTaken() {
		return itemDateTaken;
	}
	public void setItemDateTaken(Date itemDateTaken) {
		this.itemDateTaken = itemDateTaken;
	}
	public int getItemQuantityTaken() {
		return itemQuantityTaken;
	}
	public void setItemQuantityTaken(int itemQuantityTaken) {
		this.itemQuantityTaken = itemQuantityTaken;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
