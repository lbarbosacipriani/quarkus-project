package org.acme.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.model.Bitcoin;
import org.acme.service.BitcoinService;
import org.eclipse.microprofile.rest.client.inject.RestClient;
@Path("/bitcoins")
public class BitcoinResource {
	@Inject
	@RestClient
	BitcoinService bitcoinService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Bitcoin> listar(){
		return bitcoinService.listar();
	}
}
