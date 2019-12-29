package com.projeto.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.api.model.Caminhao;



public interface CaminhaoRepository extends JpaRepository<Caminhao, Long> {

	Caminhao findByPlacaDoCavalo(String placa);
	

	
	
	

}
