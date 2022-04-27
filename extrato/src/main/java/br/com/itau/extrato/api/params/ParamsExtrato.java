package br.com.itau.extrato.api.params;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParamsExtrato {
	
	@JsonProperty("agencia")
	private String agencia = "4444";
	
	@JsonProperty("conta")
	private String conta = "55555";
	
	@JsonProperty("dac")
	private String dac = "1";

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getDac() {
		return dac;
	}

	public void setDac(String dac) {
		this.dac = dac;
	}
}
