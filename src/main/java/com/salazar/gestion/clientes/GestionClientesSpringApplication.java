package com.salazar.gestion.clientes;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.salazar.gestion.clientes.models.entity.Rol;
import com.salazar.gestion.clientes.models.entity.Usuario;
import com.salazar.gestion.clientes.models.entity.UsuarioRol;
import com.salazar.gestion.clientes.service.UsuarioService;

@SpringBootApplication
public class GestionClientesSpringApplication implements CommandLineRunner{
	
	

	public static void main(String[] args) {
		
		SpringApplication.run(GestionClientesSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Usuario usuario = new Usuario();
		
		usuario.setNombre("Matias");
		usuario.setApellido("Salazar");
		usuario.setUsername("matias");
		usuario.setPassword("12345");
		usuario.setEmail("matias.ale@gmail.com");
		usuario.setTelefono("965874521");
		usuario.setPerfil("foto.png");
		
		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setNombre("ADMIN");
		
		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);
		
		
		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
		
		
		System.out.println(usuarioGuardado.getUsername());*/
	}

}
