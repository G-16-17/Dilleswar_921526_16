package com.chain_pattern;

public class LeaveRequest {

	private String Employee_name;
	private int LeaveDays;

	// constructor
	public LeaveRequest(String employee_name, int leaveDays) {
		super();
		Employee_name = employee_name;
		LeaveDays = leaveDays;
	}

	// getters and setters
	public String getEmployee_name() {
		return Employee_name;
	}

	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}

	public int getLeaveDays() {
		return LeaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		LeaveDays = leaveDays;
	}
}
