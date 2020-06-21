package com.example.ejemplo.enums;

public enum EnumRoles {

	ADMIN("ADMIN"),
	AGRICULTOR("AGRICULTOR"),
	CASERO("CASERO"),
	MASTER("MASTER");
	
	private String rol;

	private EnumRoles(String rol) {
		this.rol = rol;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
}
