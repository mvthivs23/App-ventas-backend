package com.salazar.gestion.clientes.service;

import java.util.Set;

import com.salazar.gestion.clientes.models.entity.Usuario;
import com.salazar.gestion.clientes.models.entity.UsuarioRol;

public interface UsuarioService {

public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
	

public Usuario obtenerUsuario(String username);

public void eliminarUsuario(Long usuarioId);
	
}
