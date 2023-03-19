package com.salazar.gestion.clientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.salazar.gestion.clientes.models.entity.Cliente;
import com.salazar.gestion.clientes.models.entity.Producto;
import com.salazar.gestion.clientes.models.entity.Venta;
import com.salazar.gestion.clientes.repositorio.ClienteRepositorio;
import com.salazar.gestion.clientes.repositorio.IProductoRepositorio;
import com.salazar.gestion.clientes.repositorio.IVentaRepositorio;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	private ClienteRepositorio clienteRepositorio;

	@Autowired
	private IVentaRepositorio ventaRepositorio;
	
	@Autowired
	private IProductoRepositorio productoRepositorio;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteRepositorio.findAll();
	}

	@Override
	@Transactional(readOnly = true)

	public Page<Cliente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return clienteRepositorio.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteRepositorio.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteRepositorio.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteRepositorio.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Venta findVentaById(Long id) {
		// TODO Auto-generated method stub
		return ventaRepositorio.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Venta saveVenta(Venta venta) {
		return ventaRepositorio.save(venta);
	}

	@Override
	@Transactional
	public void deleteVenta(Long id) {
		ventaRepositorio.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findProductoByNombre(String term) {
		return productoRepositorio.findByNombreStartingWithIgnoreCase(term);
	}


}