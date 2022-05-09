package br.com.itau.extrato.viewModel.mappers;
import java.util.Date;

import br.com.itau.extrato.api.model.Extrato;
import br.com.itau.extrato.viewModel.model.EntradasFuturasView;
import br.com.itau.extrato.viewModel.model.EntradasView;
import br.com.itau.extrato.viewModel.model.ExtratoView;
import br.com.itau.extrato.viewModel.model.SaidasFuturasView;
import br.com.itau.extrato.viewModel.model.SaidasView;

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
	public static EntradasFuturasView getEntradasFuturas(Extrato apiDTO) {
		if(apiDTO != null) {
			Extrato extrato = (Extrato) apiDTO;
			EntradasFuturasView viewModel = new EntradasFuturasView();
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
	public static SaidasFuturasView getSaidasFuturas(Extrato apiDTO) {
		if(apiDTO != null) {
			Extrato extrato = (Extrato) apiDTO;
			SaidasFuturasView viewModel = new SaidasFuturasView();
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
	
	public static EntradasView getEntradas(Extrato apiDTO) {
		if(apiDTO != null) {
			Extrato extrato = (Extrato) apiDTO;
			EntradasView viewModel = new EntradasView();
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

	public static SaidasView getSaidas(Extrato apiDTO) {
		if(apiDTO != null) {
			Extrato extrato = (Extrato) apiDTO;
			SaidasView viewModel = new SaidasView();
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
		

	
	

