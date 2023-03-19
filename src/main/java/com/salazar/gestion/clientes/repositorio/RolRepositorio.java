package com.salazar.gestion.clientes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salazar.gestion.clientes.models.entity.Rol;

public interface RolRepositorio extends JpaRepository<Rol, Long> {

}
