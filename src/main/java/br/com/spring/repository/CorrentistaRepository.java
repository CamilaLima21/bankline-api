package br.com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer>{

}
