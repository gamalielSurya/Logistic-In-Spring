package com.gamaliel.surya;

public class department {
	public int deptId;
	public String deptName;
	public department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public department() {

	}

	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
