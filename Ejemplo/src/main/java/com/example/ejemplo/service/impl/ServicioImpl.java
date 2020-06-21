package com.example.ejemplo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejemplo.dto.response.ResponseAdminsDTO;
import com.example.ejemplo.dto.response.ResponseUsersDTO;
import com.example.ejemplo.enums.EnumRoles;
import com.example.ejemplo.model.User;
import com.example.ejemplo.repository.UserRepository;
import com.example.ejemplo.service.Servicio;

@Service
public class ServicioImpl implements Servicio{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> obtenerUsers() {

		List<User> listaUsers = userRepository.obtenerUsers();
		
		return listaUsers;
	}

	@Override
	public List<ResponseAdminsDTO> obtenerAdmins() {

		String param = EnumRoles.ADMIN.toString();
		
		List<ResponseAdminsDTO> listaAdmins = userRepository.obtenerAdmins(param);
		
		return listaAdmins;
	}

	@Override
	public List<ResponseAdminsDTO> obtenerAgricultores() {
		
		String param = EnumRoles.AGRICULTOR.toString();
		
		List<ResponseAdminsDTO> listaAdmins = userRepository.obtenerAdmins(param);
		
		return listaAdmins;
		
	}

	@Override
	public List<ResponseAdminsDTO> obtenerCaseros() {
		
		String param = EnumRoles.CASERO.toString();
		
		List<ResponseAdminsDTO> listaAdmins = userRepository.obtenerAdmins(param);
		
		return listaAdmins;
		
	}

	

}
