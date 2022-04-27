package br.com.itau.extrato.api.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Extrato implements ApiDTO{
	@JsonProperty("dataLancamento")
	private String dataLancamento;
	
	@JsonProperty("lancamento")
	private String lancamento;
	
	@JsonProperty("valor")
	private double valor;
	
	@JsonProperty("detalhes")
	private String detalhes;
	

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
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
