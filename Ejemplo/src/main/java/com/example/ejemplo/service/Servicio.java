package com.example.ejemplo.service;

import java.util.List;

import com.example.ejemplo.dto.response.ResponseAdminsDTO;
import com.example.ejemplo.dto.response.ResponseUsersDTO;
import com.example.ejemplo.model.User;



public interface Servicio {

	public List<User> obtenerUsers();
	
	public List<ResponseAdminsDTO> obtenerAdmins(); 
	
	public List<ResponseAdminsDTO> obtenerAgricultores(); 
	
	public List<ResponseAdminsDTO> obtenerCaseros(); 
	
}
