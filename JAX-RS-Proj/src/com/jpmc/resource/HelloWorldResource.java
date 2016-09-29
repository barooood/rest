package com.jpmc.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//Resource in REST Webservice
@Path("/hello")
public class HelloWorldResource {
	
	@GET
	public String sayHello(){
		return "Hello from REST services";
	}
}
