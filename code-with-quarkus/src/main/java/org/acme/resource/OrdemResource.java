package org.acme.resource;

import java.time.LocalDate;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.acme.model.Ordem;

import br.com.alura.repository.OrdemRepository;
import io.quarkus.runtime.Application;

@Path("/ordens")
public class OrdemResource {

	@Inject
	OrdemRepository ordemrepository;
	
	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Ordem ordem) {
		ordem.setData(LocalDate.now());
		ordem.setStatus("ENVIADA");
		ordemrepository.persist(ordem);
	}
}
