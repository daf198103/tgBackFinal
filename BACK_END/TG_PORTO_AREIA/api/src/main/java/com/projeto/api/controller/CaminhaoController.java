package com.projeto.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.api.dto.CaminhaoDto;
import com.projeto.api.model.Caminhao;
import com.projeto.api.model.Carregamento;
import com.projeto.api.service.CaminhaoService;
import com.projeto.api.service.CarregamentoService;

@RestController 
@RequestMapping(value = "/projeto")
@CrossOrigin(origins = "http://localhost:4200")
public class CaminhaoController {
	
	
	@Autowired
	private CaminhaoService caminhaoService;
	
	@Autowired
	private CarregamentoService cargtoService;
	
	
	@PostMapping(value="/caminhao/save")
	public ResponseEntity<Caminhao>save(@RequestBody Caminhao caminhao){
		Caminhao cami = caminhaoService.findByPlacaDoCavalo(caminhao.getPlacaDoCavalo());
		if(!cami.equals(null)) {
			cami.setCarregado(caminhao.isCarregado());
			caminhaoService.save(cami);
			return new ResponseEntity<Caminhao>(cami,new HttpHeaders(),HttpStatus.OK);

		}
		caminhaoService.save(caminhao);
		return new ResponseEntity<Caminhao>(caminhao,new HttpHeaders(),HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public ResponseEntity<List<Caminhao>> findAll() {
	    List<Caminhao> caminhoes = caminhaoService.findAll();	    
	    return new ResponseEntity<List<Caminhao>>(caminhoes, HttpStatus.OK);
	}	

	@RequestMapping(value = "/findByPlaca/{placaDoCavalo}", method = RequestMethod.GET)
	  public ResponseEntity<Caminhao> findByPlaca(@PathVariable("placaDoCavalo")String placaDoCavalo) {
	      Caminhao caminhao = caminhaoService.findByPlacaDoCavalo(placaDoCavalo);
	      if(caminhao == null)
	      {
	      	return new ResponseEntity<Caminhao>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<Caminhao>(caminhao, HttpStatus.OK); 
	  }	

//	@PutMapping(value="/caminhao/update")
//	public ResponseEntity<Caminhao>update(@RequestBody Caminhao caminhao){
//		Caminhao cami = caminhaoService.findByPlacaDoCavalo(caminhao.getPlacaDoCavalo());
//		cami.setCarregado(caminhao.isCarregado());
//		caminhaoService.save(cami);
//		return new ResponseEntity<Caminhao>(caminhao,new HttpHeaders(),HttpStatus.OK);
//	}






}
	
//	
//	
//	
//	
//	@PostMapping(value = "/caminhao/save")//, method = RequestMethod.POST
//    public ResponseEntity<Caminhao>save(@RequestBody Caminhao caminhao) 
//    {
//    	Caminhao camin = caminhaoService.findByPlacaDoCavalo(caminhao.getPlacaDoCavalo());
//    	if(camin == null) {
//    		caminhaoService.save(caminhao);	
//    		return new ResponseEntity<Caminhao>(caminhao, new  HttpHeaders(),HttpStatus.OK);
//    	}else
//    	{
//    		return new ResponseEntity<Caminhao>(camin, new  HttpHeaders(),HttpStatus.OK);	
//    	}
//    	    
//    }
//	
//	@PutMapping(value = "/caminhao/update")//, method = RequestMethod.POST
//    public ResponseEntity<Caminhao>update(@RequestBody Caminhao caminhao) 
//    {
//    	Caminhao camin = caminhaoService.findByPlacaDoCavalo(caminhao.getPlacaDoCavalo());
//    	//camin.setCargaMaxima(caminhao.getCargaMaxima());
//    	caminhaoService.save(camin);	
//    	return new ResponseEntity<Caminhao>(caminhao, new  HttpHeaders(),HttpStatus.OK);
//    	    
//    }
//	
//	
//	
//	

//	@RequestMapping(value="/nomeEmpresa/{nomeEmpresa}")
//	public ResponseEntity<List<Caminhao>> findByNomeEmpresa(
//			@PathVariable("nomeEmpresa")String nomeEmpresa)
//	{
//		List<Caminhao>caminhao = caminhaoService.findByNomeEmpresa(nomeEmpresa);
//		if(caminhao.size() == 0) 
//		{
//			return null;
//		}
//		return new ResponseEntity<List<Caminhao>>(caminhao,HttpStatus.OK);
//	}
	
