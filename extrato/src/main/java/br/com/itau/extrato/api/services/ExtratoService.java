package br.com.itau.extrato.api.services;

import br.com.itau.extrato.api.model.ApiDTO;
import br.com.itau.extrato.api.params.ParamsExtrato;

public interface ExtratoService {
	public ApiDTO getExtrato(ParamsExtrato params) throws Exception;
}
