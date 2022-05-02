package br.com.itau.extrato.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.itau.extrato.api.params.ParamsExtrato;
import br.com.itau.extrato.api.services.SaldoService;
import br.com.itau.extrato.viewModel.ViewEntidade;
import br.com.itau.extrato.viewModel.mappers.SaldoMapper;

@Controller
public class SaldoController {
	final SaldoService service;
	
	public SaldoController(SaldoService service) {
		this.service = service;
	}
	
	
	@ResponseBody
	@PostMapping("/saldo")
	public ResponseEntity<ViewEntidade> saldo(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(SaldoMapper.getSaldo(service.getSaldo(params)));
	}
}
