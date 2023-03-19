package com.salazar.gestion.clientes.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.salazar.gestion.clientes.models.entity.Venta;

@Repository
public interface IVentaRepositorio extends CrudRepository<Venta, Long> {

	
}
