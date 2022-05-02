package br.com.itau.extrato.viewModel.mappers;

import br.com.itau.extrato.api.model.ApiDTO;
import br.com.itau.extrato.api.model.Saldo;
import br.com.itau.extrato.viewModel.model.SaldoTotalView;
import br.com.itau.extrato.viewModel.model.SaldoView;

public class SaldoTotalMapper {
	
	private SaldoTotalMapper() {}


	@SuppressWarnings("null")
	public static double getSaldoTotal(ApiDTO dto) {
		if(dto != null) {
			Saldo saldo = (Saldo) dto;
			SaldoTotalView saldoTotalModel = new SaldoTotalView();
			saldoTotalModel.setSaldo(saldo.getSaldo());
			saldoTotalModel.setLis(saldo.getLis());
			saldoTotalModel.setSaldoTotal(Double.parseDouble(saldo.getSaldo()) + Double.parseDouble(saldo.getLis()));
			return saldoTotalModel.getSaldoTotal();
		}
			Double double1 = (Double) null;
			return double1;
}
}