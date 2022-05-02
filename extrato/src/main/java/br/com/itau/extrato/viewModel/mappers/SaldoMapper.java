package br.com.itau.extrato.viewModel.mappers;

import br.com.itau.extrato.api.model.ApiDTO;
import br.com.itau.extrato.api.model.Saldo;
import br.com.itau.extrato.viewModel.model.SaldoView;

public class SaldoMapper {
	private SaldoMapper() {}
	
	public static SaldoView getSaldo(ApiDTO dto) {
		if(dto != null) {
			Saldo saldo = (Saldo) dto;
			SaldoView saldoModel = new SaldoView();
			saldoModel.setSaldo(saldo.getSaldo());
			saldoModel.setLis(saldo.getLis());
			return saldoModel;
		}
			return null;
	}
}
