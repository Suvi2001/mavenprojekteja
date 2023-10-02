package Fish;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


	 
	 @Path("/fishservice")
	 public class FishService {
	 	
	 	/*
	 	 * This method can be reached with a GET (annotation @GET) type request to the URL
	 	 * http://some.server.someplace/rest/laptopservice/servicename
	 	 * ...just adding value of the @Path to the previously mentioned address
	 	 * Method can return plain text (@Produces...) 
	 	 */
	 	@GET
	 	@Path("/all")
	 	@Produces(MediaType.TEXT_PLAIN)
	 	public String listAll() {
	 		return "These are all the fish I got last summer";
	 	}
	 	
	 
}
