package com.salazar.gestion.clientes.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.salazar.gestion.clientes.models.entity.Cliente;
import com.salazar.gestion.clientes.models.entity.Producto;
import com.salazar.gestion.clientes.models.entity.Venta;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);

	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Venta findVentaById(Long id);
	
	public Venta saveVenta(Venta venta);
	
	public void deleteVenta(Long id);
	
	public List<Producto> findProductoByNombre(String term);
	
	
	
	

	
	
}
