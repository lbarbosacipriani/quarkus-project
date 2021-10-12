package org.acme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.security.User;

@Entity // representa um dado. 
@UserDefinition // essa classe tem os metodos de usuario, como senha e tal. tem que ser unica e tem que ser JPA
public class Usuario  extends PanacheEntityBase{ // pode usar anotacoes do panache, que facilita interacao com o DB.

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id; // é chave e autoincrementavel
	
	public String nome;
	
	public String cpf;
	
	@Username
	public String username;
	
	@Password
	public String password;
	
	@Roles
	public String role;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

}
