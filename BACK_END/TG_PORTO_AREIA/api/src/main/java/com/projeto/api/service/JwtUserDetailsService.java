package com.projeto.api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.projeto.api.dto.UsuarioDto;
import com.projeto.api.model.Usuario;
import com.projeto.api.repository.UsuarioRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository usuario;

	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = usuario.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
	}
	
	public Usuario save(UsuarioDto user) {
		Usuario newUser = new Usuario();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setFuncao(user.getFuncao());
		newUser.setNome(user.getNome());
		newUser.setRole(user.getRole());
		return usuario.save(newUser);
	}

}
