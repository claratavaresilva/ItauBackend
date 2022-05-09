package br.com.itau.extrato.api.model;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Extrato implements ApiDTO{
	
	@JsonProperty("dados")
	private List<Dados> dados = new ArrayList<Dados>();

	public List<Dados> getDados() {
		return dados;
	}

	public void setDados(List<Dados> dados) {
		this.dados = dados;
	}
	
	
	
}
