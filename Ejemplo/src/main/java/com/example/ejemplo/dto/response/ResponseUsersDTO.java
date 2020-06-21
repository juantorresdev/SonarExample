package com.example.ejemplo.dto.response;

import java.io.Serializable;

public class ResponseUsersDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 521167551700822583L;
	
	private int idUser;	
	private String userName;		
	private String password;		
	private String name;		
	private String lastname;		
	private int activo;		
	private String email;		
	private String sex;		
	private int Rol_idRol;
	
	public ResponseUsersDTO(int idUser, String userName, String password, String name, String lastname, int activo,
			String email, String sex, int rol_idRol) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.activo = activo;
		this.email = email;
		this.sex = sex;
		Rol_idRol = rol_idRol;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getRol_idRol() {
		return Rol_idRol;
	}

	public void setRol_idRol(int rol_idRol) {
		Rol_idRol = rol_idRol;
	}

	@Override
	public String toString() {
		return "ResponseUsersDTO [idUser=" + idUser + ", userName=" + userName + ", password=" + password + ", name="
				+ name + ", lastname=" + lastname + ", activo=" + activo + ", email=" + email + ", sex=" + sex
				+ ", Rol_idRol=" + Rol_idRol + "]";
	}	
	
}
