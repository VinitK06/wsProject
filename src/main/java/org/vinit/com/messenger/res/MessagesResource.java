package org.vinit.com.messenger.res;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
public class MessagesResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getResource()
	{
		return "Hello World";
	}
}
