package com.taetae.collection.list;

public class Empolyee { 
	private int empId;
	private String empName;
	public Empolyee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Empolyee [empId=" + empId + ", empName=" + empName + "]";
	}
   
	
}
