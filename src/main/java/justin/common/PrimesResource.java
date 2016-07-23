package justin.common;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import justin.java.exercise.Primes;

@Path("/primes")
public class PrimesResource {

	@GET
	@Path("/{param}")
	public Response getPrimes(@PathParam("param") int number) {
		
		String output = Primes.primes(number).toString();

		return Response.status(200).entity(output).build();
	}
}
