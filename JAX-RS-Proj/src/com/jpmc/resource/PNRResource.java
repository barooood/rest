package com.jpmc.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.jpmc.entity.PNRDetails;
import com.jpmc.system.RailwayReservationSystem;
import com.jpmc.system.Train;

@Path("/pnr")
public class PNRResource {
	
	
	//to run http://localhost:8080/JAX-RS-Proj/rest/pnr?pnrNo=12345
	//this code is by default sending the xml response
	//we can use content negotiation to request a different type of data type in response either json or xml
	
	//to achieve content negotiation from the client 
	//we need to send an http header called as accept
	// with the value as 'application/json' or 'application/xml'
	//along with the request to get the response in the desired form
	
	@GET
	@Produces({"application/json","application/xml"}) //we want to send the pnrdetails in the json form
	public List<Train> getPNRDetails(@QueryParam("pnrNo") long pnrNo){
		
		RailwayReservationSystem rs=new RailwayReservationSystem();
		//PNRDetails pnrDetails=rs.getPNRDetails(pnrNo);
		List<Train> a=rs.getTrainList();
		return a;
		
	}
	
	
	
}
