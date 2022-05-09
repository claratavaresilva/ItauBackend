package br.com.itau.extrato.api.services;

import br.com.itau.extrato.api.model.ApiDTO;
import br.com.itau.extrato.api.params.ParamsConta;

public interface ContaService {
	public ApiDTO getConta(ParamsConta params) throws Exception;

}
