package br.com.itau.extrato.viewModel.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.itau.extrato.viewModel.ViewEntidade;

public class ContaErroView implements ViewEntidade {
	
	@JsonProperty("Dados inválidos")
	private String erro;

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public ContaErroView(String erro) {
		this.erro = erro;
	}
	
	
	
}
