package br.com.itau.extrato.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.itau.extrato.api.params.ParamsExtrato;
import br.com.itau.extrato.api.services.SaldoService;
import br.com.itau.extrato.viewModel.ViewEntidade;
import br.com.itau.extrato.viewModel.mappers.SaldoTotalMapper;

@Controller
public class SaldoTotalController {
	final SaldoService service;
	
	public SaldoTotalController(SaldoService service) {
		this.service = service;
	}
	
	@ResponseBody
	@PostMapping("/saldoTotal")
	public ResponseEntity<Double> saldo(@RequestBody ParamsExtrato params) throws Exception{
		return ResponseEntity.ok().body(SaldoTotalMapper.getSaldoTotal(service.getSaldo(params)));
	}
}
