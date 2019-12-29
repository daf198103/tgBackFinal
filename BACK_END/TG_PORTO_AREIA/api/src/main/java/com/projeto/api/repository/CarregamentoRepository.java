package com.projeto.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.api.model.Caminhao;
import com.projeto.api.model.Carregamento;


public interface CarregamentoRepository extends JpaRepository<Carregamento, Long>{
	

	
}
