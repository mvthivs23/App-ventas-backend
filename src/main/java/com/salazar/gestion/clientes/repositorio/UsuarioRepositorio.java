package com.salazar.gestion.clientes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salazar.gestion.clientes.models.entity.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
