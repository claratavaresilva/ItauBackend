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
import br.com.itau.extrato.viewModel.model.EntradasFuturasView;
import br.com.itau.extrato.viewModel.model.EntradasView;
import br.com.itau.extrato.viewModel.model.ExtratoView;
import br.com.itau.extrato.viewModel.model.SaidasFuturasView;
import br.com.itau.extrato.viewModel.model.SaidasView;

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
	public ResponseEntity<EntradasFuturasView> entradasFuturas(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(ExtratoMapper.getEntradasFuturas((Extrato) service.getExtrato(params)));	
	}
	
	@ResponseBody	
	@PostMapping("/saidasFuturas")
	public ResponseEntity<SaidasFuturasView> saidasFuturas(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(ExtratoMapper.getSaidasFuturas((Extrato) service.getExtrato(params)));	
	}
	
	@ResponseBody	
	@PostMapping("/entradasPassadas")
	public ResponseEntity<EntradasView> entradasPassadas(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(ExtratoMapper.getEntradas((Extrato) service.getExtrato(params)));	
	}
	@ResponseBody	
	@PostMapping("/saidasPassadas")
	public ResponseEntity<SaidasView> saidasPassadas(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(ExtratoMapper.getSaidas((Extrato) service.getExtrato(params)));	
	}
	
	
}