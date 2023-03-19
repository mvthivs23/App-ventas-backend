package com.salazar.gestion.clientes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.salazar.gestion.clientes.models.entity.Usuario;
import com.salazar.gestion.clientes.repositorio.UsuarioRepositorio;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = this.usuarioRepositorio.findByUsername(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}
		return usuario;
	}

}
