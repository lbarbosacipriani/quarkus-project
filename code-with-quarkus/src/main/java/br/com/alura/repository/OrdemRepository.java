package br.com.alura.repository;

import javax.enterprise.context.ApplicationScoped;

import org.acme.model.Ordem;

import io.quarkus.hibernate.orm.panache.PanacheRepository;


@ApplicationScoped        // a classe cria uma instancia so e é compartilhada pra quem precisa.
public class OrdemRepository implements PanacheRepository<Ordem>{

	// chamo os metodos repository. abstraio ainda mais.
}
