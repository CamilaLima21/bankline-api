package br.com.spring.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.dto.NovoCorrentista;
import br.com.spring.model.Conta;
import br.com.spring.model.Correntista;
import br.com.spring.repository.CorrentistaRepository;

@Service
public class CorrentistaService {
 
	@Autowired
	private CorrentistaRepository correntistaRepository;

	public void save(NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		
		correntistaRepository.save(correntista);
	}
	
}
