package br.com.itau.extrato.api.params;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParamsConta {
	@JsonProperty("agencia")
	private String agencia = "4444";
	
	@JsonProperty("conta")
	private String conta = "55555";
	
	@JsonProperty("dac")
	private String dac = "1";
	
	@JsonProperty("senha")
	private String senha = "123456";
}
