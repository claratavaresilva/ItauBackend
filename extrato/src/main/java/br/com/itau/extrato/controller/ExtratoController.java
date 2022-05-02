package br.com.itau.extrato.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.itau.extrato.api.params.ParamsExtrato;
import br.com.itau.extrato.api.services.ExtratoService;
import br.com.itau.extrato.viewModel.mappers.ExtratoMapper;
import br.com.itau.extrato.viewModel.model.ExtratoView;

@Controller
public class ExtratoController {
	
	final ExtratoService service;
	
	public ExtratoController(ExtratoService service) {
		this.service = service;		
	}
	

	@ResponseBody
	@PostMapping("/extrato")
	public ResponseEntity<ExtratoView> extrato(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(ExtratoMapper.fromDto(service.getExtrato(params)));
}
}