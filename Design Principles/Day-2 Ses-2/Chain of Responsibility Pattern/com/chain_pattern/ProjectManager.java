package com.chain_pattern;

public class ProjectManager implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextInChain;

	@Override
	public void setHandler(ILeaveRequestHandler c) {
		nextInChain = c;
	}

	@Override
	public void Handlerequest(LeaveRequest request) {
		if (request.getLeaveDays() >= 3 && request.getLeaveDays() < 5) {
			System.out.println("Request  for " + request.getLeaveDays() + " days of " + request.getEmployee_name()
					+ " sent to Project Manager");
		} else {
			nextInChain.Handlerequest(request);
		}
	}

}
