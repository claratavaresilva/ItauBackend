package br.com.itau.extrato.api.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Saldo implements ApiDTO {
	@JsonProperty("saldo")
	private String saldo;
	
	@JsonProperty("lis")
	private String lis;
}
