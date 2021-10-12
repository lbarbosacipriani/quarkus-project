package org.acme.resource;



import javax.annotation.security.PermitAll;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.acme.model.Usuario;

// classe para o usuario ter o recurso de ser inserido dentro do DB.
@Path("/usuarios")
public class UsuarioResource {
	// funcao para inserir no DB
	@POST
	@PermitAll
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Usuario usuario) {
		
		Usuario.persist(usuario); // anotacao de persist faz tudo ja. louco demais
	}
}
