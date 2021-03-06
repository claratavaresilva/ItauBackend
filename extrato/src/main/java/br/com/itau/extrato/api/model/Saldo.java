package br.com.itau.extrato.api.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Saldo implements ApiDTO {
	@JsonProperty("saldo")
	private String saldo;
	
	@JsonProperty("lis")
	private String lis;
	
	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getLis() {
		return lis;
	}

	public void setLis(String lis) {
		this.lis = lis;
	}

}
