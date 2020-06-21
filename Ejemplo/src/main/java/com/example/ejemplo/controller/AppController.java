package com.example.ejemplo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejemplo.dto.response.ResponseAdminsDTO;
import com.example.ejemplo.model.User;
import com.example.ejemplo.service.Servicio;

@RestController
public class AppController {

	@Autowired
	Servicio servicio;
	
	@GetMapping("/ejecucion")
	public String llamarEjecucion() {
		return "Welcome to Execution.";
	}
	
	@GetMapping("/consultaUsuarios")
	public List<User> consultaUsuarios() {
		
		List<User> listaUsers = servicio.obtenerUsers();
		
		return listaUsers;
	}
	
	@GetMapping("/consultaAdmins")
	public List<ResponseAdminsDTO> consultaUsuariosAdmin(){
		
		List<ResponseAdminsDTO> listaAdmins = servicio.obtenerAdmins();
		
		return listaAdmins;
		
	}
	
	@GetMapping("/consultaAgricultores")
	public List<ResponseAdminsDTO> consultaUsuariosAgricultores(){
		
		List<ResponseAdminsDTO> listaAgricultores = servicio.obtenerAgricultores();
		
		return listaAgricultores;
		
	}
	
	@GetMapping("/consultaCaseros")
	public List<ResponseAdminsDTO> consultaUsuariosCaseros(){
		
		List<ResponseAdminsDTO> listaCaseros = servicio.obtenerCaseros();
		
		return listaCaseros;
		
	}
	
}
