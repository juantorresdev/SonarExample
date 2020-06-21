package com.example.ejemplo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="User", schema="TT2019-B087")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3966263868035720016L;
	
	@Id
    @Column(name="iduser")
    private int idUser;

    @Column(name="username", length=45, nullable=false)
    private String userName;

    @Column(name="password", length=45, nullable=false)
    private String password;

    @Column(name="name", length=45, nullable=false)
    private String name;

    @Column(name="lastname", length=45, nullable=false)
    private String lastname;
    	
    public User() {}

	public User(int idUser, String userName, String password, String name, String lastname) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
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

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", userName=" + userName + ", password=" + password + ", name=" + name
				+ ", lastname=" + lastname + "]";
	}
    
}
