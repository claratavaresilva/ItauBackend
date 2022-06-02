package br.com.itau.extrato.viewModel.mappers;
import java.util.Date;

import br.com.itau.extrato.api.model.Extrato;
import br.com.itau.extrato.viewModel.model.ExtratoView;

public class ExtratoMapper {

	private ExtratoMapper() {}
	
	//extrato com datas passadas
	public static ExtratoView getExtrato(Extrato apiDTO) {
		if(apiDTO != null) {
		Extrato extrato = (Extrato) apiDTO;
		ExtratoView viewModel = new ExtratoView();
		
		for(int i = 0; i < extrato.getDados().size(); i++){
			if (extrato.getDados().get(i).getDataLancamento().before(new Date())){
				viewModel.setExtrato(extrato.getDados().get(i));
				viewModel.getList().add(viewModel.getExtrato());
			}
		}
		return viewModel;
	}
		return null;
}
	
	//extrato entradas futuras
	public static ExtratoView getEntradasFuturas(Extrato apiDTO) {
		if(apiDTO != null) {
			Extrato extrato = (Extrato) apiDTO;
			ExtratoView viewModel = new ExtratoView();
			for(int i = 0; i < extrato.getDados().size(); i++){
				if (extrato.getDados().get(i).getDataLancamento().after(new Date()) && extrato.getDados().get(i).getValor() > 0){
					viewModel.setExtrato(extrato.getDados().get(i));
					viewModel.getList().add(viewModel.getExtrato());
				}
			}
			return viewModel;
		}
		return null;
	}
	
	//extrato saidas futuras
	public static ExtratoView getSaidasFuturas(Extrato apiDTO) {
		if(apiDTO != null) {
			Extrato extrato = (Extrato) apiDTO;
			ExtratoView viewModel = new ExtratoView();
			for(int i = 0; i < extrato.getDados().size(); i++){
				if (extrato.getDados().get(i).getDataLancamento().after(new Date()) && extrato.getDados().get(i).getValor() < 0){
					viewModel.setExtrato(extrato.getDados().get(i));
					viewModel.getList().add(viewModel.getExtrato());
				}
			}
			return viewModel;
		}
		return null;
	}
	
	//extrato entradas passadas
	public static ExtratoView getEntradas(Extrato apiDTO) {
		if(apiDTO != null) {
			Extrato extrato = (Extrato) apiDTO;
			ExtratoView viewModel = new ExtratoView();
			for(int i = 0; i < extrato.getDados().size(); i++){
				if (extrato.getDados().get(i).getDataLancamento().before(new Date()) && extrato.getDados().get(i).getValor() > 0){
					viewModel.setExtrato(extrato.getDados().get(i));
					viewModel.getList().add(viewModel.getExtrato());
				}
			}
			return viewModel;
		}
		return null;
	}
	
	//extrato saidas passadas
	public static ExtratoView getSaidas(Extrato apiDTO) {
		if(apiDTO != null) {
			Extrato extrato = (Extrato) apiDTO;
			ExtratoView viewModel = new ExtratoView();
			for(int i = 0; i < extrato.getDados().size(); i++){
				if (extrato.getDados().get(i).getDataLancamento().before(new Date()) && extrato.getDados().get(i).getValor() < 0){
					viewModel.setExtrato(extrato.getDados().get(i));
					viewModel.getList().add(viewModel.getExtrato());
				}
			}
			return viewModel;
		}
		return null;
	}
	
	
	
}
		

	
	

