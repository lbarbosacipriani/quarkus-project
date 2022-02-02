package org.acme.resource;

import java.time.LocalDate;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import org.acme.model.Ordem;
import org.acme.service.OrdemService;


@Path("/ordens")
public class OrdemResource {

	
	@Inject
	OrdemService ordemservice;
	
	@POST
	@Transactional
	@RolesAllowed("user") // defino quem pode enviar ordens pela role so user no role	
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(@Context SecurityContext security,Ordem ordem) {
		// validar userId com o user do usuario logado.
		
		ordemservice.inserir(security,ordem);
	}
}
