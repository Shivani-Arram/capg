package com.test.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloService {
	
	
	@GET
	@Path("text")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHellText()
	{
		return "This is plian text response";
	}
	
	@POST
	@Path("html")
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHtml(@FormParam("user") String name)
	{
		return "<html><body><h1>This is HTML response "+name+"</h1></body></html>";
	}

}
