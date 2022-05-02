package br.com.itau.extrato.viewModel.model;

import br.com.itau.extrato.viewModel.ViewEntidade;

public class SaldoView implements ViewEntidade {
	private String saldo;
	
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
