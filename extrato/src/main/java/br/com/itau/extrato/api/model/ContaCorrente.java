package br.com.itau.extrato.api.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;

public class ContaCorrente implements ApiDTO{
	
	@Size(max = 4)
	@JsonProperty("agencia")
	private String agencia;
	
	@Size(max = 5)
	@JsonProperty("conta")
	private String conta;
	
	@Size(max = 1)
	@JsonProperty("dac")
	private String dac;
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("sobrenome")
	private String sobrenome;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
}
