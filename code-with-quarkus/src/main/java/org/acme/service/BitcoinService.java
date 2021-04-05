package org.acme.service;

import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.acme.model.Bitcoin;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@Path("/bitcoins")
@RegisterRestClient() // vou injetar ele em algum lugar. 
public interface BitcoinService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Bitcoin> listar() ;
}
