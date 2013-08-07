package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * This is the root path for our restful api service 
 * in the web.xml file, we specified that /api/* resource
 * need to be in the URL to get to this class
 * @author ccardoso
 *
 */
@Path("/v1/status")
public class V1_status {
	
	private static final String api_version = "00.01.00"; //version of the api
	
	/**
	 * 
	 * 
	 * @return String - Title of the api
	 */
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		
		return "<p>Java Web Service</p>";
	}
	
	/**
	 * 
	 * @return String - version numeber of the api
	 */
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion() {
		
		return "<p>Version</p>" + api_version;
	}
}
