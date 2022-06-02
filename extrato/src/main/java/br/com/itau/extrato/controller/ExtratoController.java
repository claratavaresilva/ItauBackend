package br.com.itau.extrato.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.itau.extrato.api.model.Extrato;
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
	@PostMapping("/extratoPassado")
	public ResponseEntity<ExtratoView> extrato(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(ExtratoMapper.getExtrato((Extrato) service.getExtrato(params)));
	}
	
	@ResponseBody	
	@PostMapping("/entradasFuturas")
	public ResponseEntity<ExtratoView> entradasFuturas(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(ExtratoMapper.getEntradasFuturas((Extrato) service.getExtrato(params)));	
	}
	
	@ResponseBody	
	@PostMapping("/saidasFuturas")
	public ResponseEntity<ExtratoView> saidasFuturas(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(ExtratoMapper.getSaidasFuturas((Extrato) service.getExtrato(params)));	
	}
	
	@ResponseBody	
	@PostMapping("/entradasPassadas")
	public ResponseEntity<ExtratoView> entradasPassadas(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(ExtratoMapper.getEntradas((Extrato) service.getExtrato(params)));	
	}
	@ResponseBody	
	@PostMapping("/saidasPassadas")
	public ResponseEntity<ExtratoView> saidasPassadas(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(ExtratoMapper.getSaidas((Extrato) service.getExtrato(params)));	
	}
	
	
}