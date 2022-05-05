package br.com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.dto.NovaMovimentacao;

import br.com.spring.model.Movimentacao;
import br.com.spring.repository.MovimentacaoRepository;

import br.com.spring.services.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository movimentacaoRepository;
	
	@Autowired
	private MovimentacaoService movimentacaoService;
	
	@GetMapping
	public List<Movimentacao> findAll() {
		return movimentacaoRepository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NovaMovimentacao novaMovimentacao) {
		movimentacaoService.save(novaMovimentacao);
	}

}
