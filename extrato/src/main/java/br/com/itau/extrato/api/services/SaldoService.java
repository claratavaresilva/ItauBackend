package br.com.itau.extrato.api.services;

import br.com.itau.extrato.api.model.ApiDTO;
import br.com.itau.extrato.api.params.ParamsExtrato;

public interface SaldoService {
	public ApiDTO getSaldo(ParamsExtrato params) throws Exception;

}
