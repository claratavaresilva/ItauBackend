package br.com.itau.extrato.api.model;

import java.sql.Date;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Dados {
	
	@JsonProperty("dataLancamento")
	private Date dataLancamento;
	
	@JsonProperty("lancamento")
	private String lancamento;
	
	@JsonProperty("valor")
	private double valor;
	
	@JsonProperty("detalhes")
	private String detalhes;
	
	
	
	public Date getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getLancamento() {
		return lancamento;
	}
	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	
}
