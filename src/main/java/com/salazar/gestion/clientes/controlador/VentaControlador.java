package com.salazar.gestion.clientes.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.salazar.gestion.clientes.models.entity.Producto;
import com.salazar.gestion.clientes.models.entity.Venta;
import com.salazar.gestion.clientes.service.IClienteService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class VentaControlador {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/ventas/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Venta show(@PathVariable Long id) {
		return clienteService.findVentaById(id);
	}

	
	@DeleteMapping("/ventas/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			clienteService.deleteVenta(id);
		}
	
	@GetMapping("/ventas/filtrar-productos/{term}")
	@ResponseStatus(HttpStatus.OK)
	public List<Producto> filtrarProductos(@PathVariable String term){
		return clienteService.findProductoByNombre(term);
	}
	@PostMapping("/ventas")
	@ResponseStatus(HttpStatus.CREATED)
	public Venta crear(@RequestBody Venta venta) {
		return clienteService.saveVenta(venta);
	}
	}
	

