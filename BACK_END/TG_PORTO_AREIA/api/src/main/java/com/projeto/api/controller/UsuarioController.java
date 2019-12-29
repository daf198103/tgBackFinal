package com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.api.model.Usuario;
import com.projeto.api.service.UsuarioService;

@RestController 
@RequestMapping(value = "/projeto")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UsuarioController {
	
	
	@Autowired
	private UsuarioService userService;
	
	@RequestMapping(value = "/user/{nome}", method = RequestMethod.GET)
    public ResponseEntity<Usuario> findByNome(@PathVariable("nome") String nome) {
			Usuario usuario = userService.findByNome(nome);
        return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/user/username/{username}", method = RequestMethod.GET)
    public ResponseEntity<Usuario> findByUsername(@PathVariable("username") String username) {
			Usuario usuario = userService.findByUsername(username);
        return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
    }
	
	@PostMapping(value = "/user/save")
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) 
    {
    	Usuario usu = userService.findByNome(usuario.getNome());
    	if(usu == null) {
    		userService.salvarUsuario(usu);	
    		return new ResponseEntity<Usuario>(usu, new  HttpHeaders(),HttpStatus.OK);
    	}else
    	{
    		return new ResponseEntity<Usuario>(null, new  HttpHeaders(),HttpStatus.OK);	
    	}
    	    
    }
	

}
