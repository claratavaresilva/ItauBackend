package br.com.itau.extrato.viewModel.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.itau.extrato.api.model.Dados;

public class ExtratoView {
	@JsonProperty
	private List<Dados> list = new ArrayList<Dados>();
	
	@JsonIgnore
	private Dados extrato;

	public Dados getExtrato() {
		return extrato;
	}
	
	public void setExtrato(Dados extrato) {
		this.extrato = extrato;
	}


	public List<Dados> getList() {
		return list;
	}

	public void setList(List<Dados> list) {
		this.list = list;
	}
}
