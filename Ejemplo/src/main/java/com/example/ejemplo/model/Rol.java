package com.example.ejemplo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Rol", schema="TT2019-B087")
public class Rol {
	
	@Id
    @Column(name="idRol")
	private int idRol;
	
	@Column(name="nameRol", length=45, nullable=false)
	private String nameRol;
	
	@Column(name="activo", nullable=false)
	private int activo;
	
	@JoinColumn(name = "Rol_idRol")
	@OneToMany(mappedBy = "Rol_idRol", fetch = FetchType.EAGER)
	private List<User> users;

	public Rol() {
		super();
	}

	public Rol(int idRol, String nameRol, int activo, List<User> users) {
		super();
		this.idRol = idRol;
		this.nameRol = nameRol;
		this.activo = activo;
		this.users = users;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNameRol() {
		return nameRol;
	}

	public void setNameRol(String nameRol) {
		this.nameRol = nameRol;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Rol [idRol=" + idRol + ", nameRol=" + nameRol + ", activo=" + activo + ", users=" + users + "]";
	}

}
