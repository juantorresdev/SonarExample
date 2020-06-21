package com.example.ejemplo.enums;

public enum EnumQuerys {

	FIND_USERS("SELECT * FROM User"),
	FIND_USER_BY_ROL_ADMIN("SELECT " + 
			"u.idUser, " + 
			"u.userName, " + 
			"u.password, " + 
			"u.name, " + 
			"u.lastname, " + 
			"u.activo, " + 
			"u.sex, " + 
			"r.nameRol " + 
			"FROM user u inner join rol " + 
			"on u.Rol_idRol = r.idRol " + 
			"WHERE r.nameRol = ?1");
	
	private String query;

	private EnumQuerys(String query) {
		this.query = query;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	
}
