package org.acme.model;

import java.time.LocalDate;

import javax.enterprise.context.RequestScoped;

// classe para transformar o Json de entrada em um 
public class Bitcoin {

		public void setId(Long id) {
		this.id = id;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
		private Long id;
		private double preco;
		private String tipo;
		public Long getId() {
			return id;
		}
		public double getPreco() {
			return preco;
		}
		public String getTipo() {
			return tipo;
		}
		public LocalDate getData() {
			return data;
		}
		private LocalDate data;
}
