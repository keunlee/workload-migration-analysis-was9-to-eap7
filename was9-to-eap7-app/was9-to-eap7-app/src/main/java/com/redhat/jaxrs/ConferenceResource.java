package com.redhat.jaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/conference")
public class ConferenceResource {
	private static List<Conference> conferences = new ArrayList<Conference>();
	
	static {
		conferences.add(new Conference("33rd Degree", "March, 19-21", "http://2012.33degree.org"));
		conferences.add(new Conference("DevCrowd", "April 14", "http://devcrowd.pl"));
		conferences.add(new Conference("4Developers","April 17","http://4developers.org.pl"));
		conferences.add(new Conference("GeeCON","May 17","http://2021-geecon.org.pl"));
		conferences.add(new Conference("Confitura","June 17","http://confitura.org.pl"));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Conference> getList() {
		return conferences;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Conference getConferenceById( @PathParam("id") int id ) {
		return conferences.get(id);
	}
}
