package com.projeto.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.api.model.Caminhao;
import com.projeto.api.model.Carregamento;
import com.projeto.api.repository.CarregamentoRepository;


@Service
public class CarregamentoService {
	
	
	@Autowired
	private CarregamentoRepository carregamentoRepo;
	
	
	public Optional<Carregamento> findById(Long id)
	{
		Optional<Carregamento> carregamento = carregamentoRepo.findById(id);
		return carregamento;
	}
	
	public Carregamento save (Carregamento carregamento) 
	{
		return carregamentoRepo.save(carregamento);
	}
	
	public List<Carregamento> findAll() 
	{
		List<Carregamento> carregamentos = new ArrayList<Carregamento>();
		carregamentos.addAll(carregamentoRepo.findAll());
		return carregamentos;
	}

	
	
	
	/*
	 * public List<Carregamento> findById_(Integer camId) { List<Carregamento>
	 * listaCarregamento = new ArrayList<Carregamento>();
	 * listaCarregamento.addAll(carregamentoRepo.findBycmnid(camId)); return
	 * listaCarregamento; }
	 */
	
	


}
