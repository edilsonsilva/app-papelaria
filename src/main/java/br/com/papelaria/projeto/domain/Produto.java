package br.com.papelaria.projeto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idproduto;
	
	@Column(nullable=true)
	private String nomeproduto;
	
	@Column(nullable=true)
	private String descricao;
	
	@Column(nullable=true)
	private Integer categoria;
	
	@Column(nullable=true)
	private Double preco;

	public Produto() {
	}

	public Produto(Integer idproduto, String nomeproduto, String descricao, Integer categoria, Double preco) {
		this.idproduto = idproduto;
		this.nomeproduto = nomeproduto;
		this.descricao = descricao;
		this.categoria = categoria;
		this.preco = preco;
	}

	public Integer getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}

