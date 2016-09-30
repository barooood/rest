package com.jpmc.controller;

import java.util.ArrayList;
import java.util.List;



public class RailwayReservationSystem {
	
	//List<PNRDetails> pnrList;

	public PNRDetails getPNRDetails(long pnrNo) {
		
		// TODO Auto-generated method stub
		PNRDetails pnrDetails=new PNRDetails();
		pnrDetails.setPnrNo(pnrNo);
		pnrDetails.setPassengerName("siddharth");
		pnrDetails.setStatus("waiting");
		
		
		
		return pnrDetails;
		
	}
	
	public List<Train> getTrainList(){
		
		List<Train> a=new ArrayList();
		
		Train first =new Train();
		Train second =new Train();
		
		first.setSource("rajdhani express");
		first.setTrainNo(123);
		first.setDestination("mumbai");
		
		second.setSource("rajdhani express");
		second.setTrainNo(321);
		second.setDestination("mumbai");
		
		a.add(first);
		a.add(second);
		
		return a;
	}
	
	
	
	
}