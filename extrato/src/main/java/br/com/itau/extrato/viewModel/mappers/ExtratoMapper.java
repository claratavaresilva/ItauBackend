package br.com.itau.extrato.viewModel.mappers;
import br.com.itau.extrato.api.model.Extrato;
import br.com.itau.extrato.viewModel.model.ExtratoView;
import br.com.itau.extrato.api.model.ApiDTO;

public class ExtratoMapper {
	private ExtratoMapper() {}
	
	public static ExtratoView fromDto(ApiDTO dto) {
		if(dto != null) {
			Extrato extrato = (Extrato) dto;
			ExtratoView extratoModel = new ExtratoView();
			extratoModel.setDataLancamento(extrato.getDataLancamento());
			extratoModel.setLancamento(extrato.getLancamento());
			extratoModel.setValor(extrato.getValor());
			extratoModel.setDetalhes(extrato.getDetalhes());
			return extratoModel;
			
		}
			return null;
	}
}
