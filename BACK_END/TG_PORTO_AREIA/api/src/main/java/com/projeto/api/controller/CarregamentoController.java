package com.projeto.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.api.model.Carregamento;
import com.projeto.api.service.CaminhaoService;
import com.projeto.api.service.CarregamentoService;

import javassist.NotFoundException;

@RestController 
@RequestMapping(value = "/projeto")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CarregamentoController {
	
	
	@Autowired
	private CarregamentoService carregamentoService;
	
	@Autowired
	private CaminhaoService caminhao;
	
	
	@PostMapping("/carregamento/{caminhaoId}")
	 public Carregamento addCarregamento(@PathVariable Long caminhaoId,
             @Valid @RequestBody Carregamento carregamento) throws NotFoundException {
			return caminhao.findByid(caminhaoId)
						.map(caminhao -> {
			     carregamento.setCaminhao(caminhao);
			     return carregamentoService.save(carregamento);
			 }).orElseThrow(() -> new NotFoundException("Student not found!"));
	}
	

}
	
	
	
		
//	@PostMapping(value = "/create/carregamento/save")//, method = RequestMethod.POST
//    public ResponseEntity<Carregamento> save(@RequestBody Carregamento carregamento) 
//    {
//    	Carregamento carregto = carregamentoService.findById(findById(carregamento.getId()));
//    	if(carregto == null) {
//    		carregamentoService.save(carregamento);	
//    		return new ResponseEntity<Carregamento>(carregamento, new  HttpHeaders(),HttpStatus.OK);
//    	}else
//    	{
//    		return new ResponseEntity<Carregamento>(carregto, new  HttpHeaders(),HttpStatus.OK);	
//    	}
//    	    
//    }
//	
// 	@RequestMapping(value = "/carregamento/findAll", method = RequestMethod.GET)
//    public ResponseEntity<List<Carregamento>> findAll() {
//        List<Carregamento> carregto = carregamentoService.findAll();
//    return new ResponseEntity<List<Carregamento>>(carregto, HttpStatus.OK);
//    }
 	
 	

