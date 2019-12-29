package com.projeto.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.projeto.api.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findById(Long id);
	
	public Usuario findByNome(String nome);
	
	public Usuario findByUsername(String username);
	
	
}
		


