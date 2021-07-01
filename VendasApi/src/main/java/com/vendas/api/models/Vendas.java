package com.vendas.api.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendas {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id_venda;
	private String data_venda;
	private String valor_venda;
	private String id_vendedor;
	private String vendedor_nome;

	public Long getId_venda() {
		return id_venda;
	}

	public void setId_venda(Long id_venda) {
		this.id_venda = id_venda;
	}

	public String getData_venda() {
		return data_venda;
	}

	public void setData_venda(String data_venda) {
		this.data_venda = data_venda;
	}

	public String getValor_venda() {
		return valor_venda;
	}

	public void setValor_venda(String valor_venda) {
		this.valor_venda = valor_venda;
	}

	public String getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(String id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public String getVendedor_nome() {
		return vendedor_nome;
	}

	public void setVendedor_nome(String vendedor_nome) {
		this.vendedor_nome = vendedor_nome;
	}

}
