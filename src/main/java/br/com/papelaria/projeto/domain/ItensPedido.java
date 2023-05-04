package br.com.papelaria.projeto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ItensPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iditenspedido;
	
	@Column(nullable=true)
	private Integer idpedido;
	
	@Column(nullable=true)
	private Integer idproduto;
	
	@Column(nullable=true)
	private Double desconto;
	
	@Column(nullable=true)
	private Integer quantidade;
	
	@Column(nullable=true)
	private Double precototal;

	public ItensPedido() {
	}

	public ItensPedido(Integer iditenspedido, Integer idpedido, Integer idproduto, Double desconto, Integer quantidade,
			Double precototal) {
		this.iditenspedido = iditenspedido;
		this.idpedido = idpedido;
		this.idproduto = idproduto;
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.precototal = precototal;
	}

	public Integer getIditenspedido() {
		return iditenspedido;
	}

	public void setIditenspedido(Integer iditenspedido) {
		this.iditenspedido = iditenspedido;
	}

	public Integer getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(Integer idpedido) {
		this.idpedido = idpedido;
	}

	public Integer getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecototal() {
		return precototal;
	}

	public void setPrecototal(Double precototal) {
		this.precototal = precototal;
	}
	
	
	
}
