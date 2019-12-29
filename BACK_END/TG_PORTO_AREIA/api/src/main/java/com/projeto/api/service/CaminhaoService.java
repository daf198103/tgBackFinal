package com.projeto.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.api.model.Caminhao;
import com.projeto.api.repository.CaminhaoRepository;


@Service
public class CaminhaoService {
	
	@Autowired
	private CaminhaoRepository caminhaoRepo;
	
	
	
	public Optional<Caminhao> findByid(Long id) 
	{
		Optional<Caminhao> caminhao = caminhaoRepo.findById(id);
		return caminhao;		
	}
	
	public Caminhao findByPlacaDoCavalo(String placa)
	{
		Caminhao caminhao = caminhaoRepo.findByPlacaDoCavalo(placa);
		return caminhao;
	}
	

	public List<Caminhao> findAll()
	{
		List<Caminhao> listaCaminhao = new ArrayList<Caminhao>(); 
		listaCaminhao.addAll(caminhaoRepo.findAll());
		List<Caminhao> retorno = new ArrayList<Caminhao>();
		listaCaminhao.forEach(cmn->{
			if(cmn.isCarregado() == false) {
				retorno.add(cmn);
			}
		});
		return retorno;
		
	}
	
	public Caminhao save (Caminhao caminhao) 
	{
		return caminhaoRepo.save(caminhao);
	}
	
}
	