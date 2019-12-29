package com.projeto.api.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping(value = "/projeto")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class HomeController {
	

	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
    public ResponseEntity<String> getHome() {
        return new ResponseEntity<String>("Home", HttpStatus.OK);
    }

}
