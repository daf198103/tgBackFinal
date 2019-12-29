package com.projeto.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.api.model.Usuario;
import com.projeto.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	
	@Autowired
	private UsuarioRepository userRepo;
	
	
	public Usuario salvarUsuario(Usuario usuario) {
		return userRepo.save(usuario);
	}
	
	public Usuario findByNome(String nome) {
		return userRepo.findByNome(nome);
	}
	
	public Optional<Usuario> findById(Long id) {
		return userRepo.findById(id);
	}
	
	public Usuario findByUsername(String username) {
		return userRepo.findByUsername(username);
	}
	
	
	
	
	

}
