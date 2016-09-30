package com.jpmc.controller;

//@XmlRootElement
public class PNRDetails {
	private long pnrNo;
	private String passengerNo;
	private String status;
	private String passengerName;
	
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public long getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}
	public String getPassengerNo() {
		return passengerNo;
	}
	public void setPassengerNo(String passengerNo) {
		this.passengerNo = passengerNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
