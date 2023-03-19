package com.salazar.gestion.clientes.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.salazar.gestion.clientes.models.entity.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{



}
