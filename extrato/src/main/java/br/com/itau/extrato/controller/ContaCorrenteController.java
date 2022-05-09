package br.com.itau.extrato.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.itau.extrato.api.params.ParamsConta;
import br.com.itau.extrato.api.services.ContaService;
import br.com.itau.extrato.viewModel.ViewEntidade;
import br.com.itau.extrato.viewModel.mappers.ContaMapper;
import br.com.itau.extrato.viewModel.model.ContaErroView;

@Controller
public class ContaCorrenteController {
	
	final ContaService service;
	
	public ContaCorrenteController(ContaService service) {
		this.service = service;		
	}

	
	@ResponseBody
	@PostMapping("/validar")
	 public ResponseEntity<ViewEntidade> getConta(@RequestBody ParamsConta params) {
			String erro = "";
			try {
				return ResponseEntity.ok().body(ContaMapper.getContaCorrente(service.getConta(params)));
			} catch (Exception e) {
				erro = e.getMessage();
			}
			return ResponseEntity.ok().body(new ContaErroView(erro));
	}		
}
	

