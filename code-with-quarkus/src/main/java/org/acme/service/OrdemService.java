package org.acme.service;

import java.time.LocalDate;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.management.RuntimeErrorException;
import javax.ws.rs.core.SecurityContext;

import org.acme.model.Ordem;
import org.acme.model.Usuario;

import br.com.alura.repository.OrdemRepository;

@ApplicationScoped
public class OrdemService {

	@Inject	
	OrdemRepository ordemrepository;

	public void inserir(SecurityContext security, Ordem ordem) {
		// TODO Auto-generated method stub
		Optional <Usuario> usuarioOptional = 
				Usuario.findByIdOptional(ordem.getUserId()); //n nao sei se existe, por isso rpeciso ver isso
		Usuario usuario = usuarioOptional.orElseThrow();
		if (!usuario.getUsername().equals(security.getUserPrincipal().getName())) {
			throw new RuntimeException("Usuario diferente do logado"); 
		}
		ordem.setData(LocalDate.now());
		ordem.setStatus("ENVIADA");
		ordemrepository.persist(ordem);
	}

}
