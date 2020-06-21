package com.example.ejemplo.dto.response;

import java.io.Serializable;

public class ResponseAdminsDTO implements Serializable{

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = -1581315429846709991L;
	
	private int idUser;
	private String userName;
	private String password;
	private String name;
	private String lastname;
	private String activo;
	private String sex;
	private String nameRol;
	
	public ResponseAdminsDTO(int idUser, String userName, String password, String name, String lastname, String activo,
			String sex, String nameRol) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.activo = activo;
		this.sex = sex;
		this.nameRol = nameRol;
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
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNameRol() {
		return nameRol;
	}
	public void setNameRol(String nameRol) {
		this.nameRol = nameRol;
	}
	@Override
	public String toString() {
		return "ResponseAdminsDTO [idUser=" + idUser + ", userName=" + userName + ", password=" + password + ", name="
				+ name + ", lastname=" + lastname + ", activo=" + activo + ", sex=" + sex + ", nameRol=" + nameRol
				+ "]";
	}
	
}
