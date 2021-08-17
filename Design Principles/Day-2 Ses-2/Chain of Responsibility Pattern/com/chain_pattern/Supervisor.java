package com.chain_pattern;

public class Supervisor implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextInChain;

	@Override
	public void setHandler(ILeaveRequestHandler c) {
		nextInChain = c;
	}

	@Override
	public void Handlerequest(LeaveRequest request) {
		if (request.getLeaveDays() >= 1 && request.getLeaveDays() < 3) {
			System.out.println("Request  for " + request.getLeaveDays() + " days of " + request.getEmployee_name()
					+ " sent to Supervisor");
		} else {
			nextInChain.Handlerequest(request);
		}
	}

}
