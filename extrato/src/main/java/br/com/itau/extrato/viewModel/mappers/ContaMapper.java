package br.com.itau.extrato.viewModel.mappers;


import br.com.itau.extrato.api.model.ApiDTO;
import br.com.itau.extrato.api.model.ContaCorrente;
import br.com.itau.extrato.viewModel.ViewEntidade;
import br.com.itau.extrato.viewModel.model.ContaView;

public class ContaMapper {

	
	ContaMapper(){};
	
	
	public static ViewEntidade getContaCorrente(ApiDTO api) {
		if(api != null) {
			ContaCorrente conta = (ContaCorrente) api;
			ContaView model = new ContaView();
			model.setAgencia(conta.getAgencia());
			model.setConta(conta.getConta());
			model.setDac(conta.getDac());
			model.setNome(conta.getNome());
			model.setSobrenome(conta.getSobrenome());
			return model;
		}	
		return null;
	}
	
}
