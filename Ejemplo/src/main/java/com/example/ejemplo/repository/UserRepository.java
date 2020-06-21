package com.example.ejemplo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ejemplo.dto.response.ResponseAdminsDTO;
import com.example.ejemplo.dto.response.ResponseUsersDTO;
import com.example.ejemplo.model.Rol;
import com.example.ejemplo.model.User;

@Repository
public interface UserRepository extends JpaRepository<Rol, Integer>{

	public static final String FIND_USERS = "SELECT * FROM User";
	public static final String FIND_USER_BY_ROL_ADMIN= "SELECT " + 
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
			"WHERE r.nameRol = ?1;";
	
	/*public String FIND_USERS = EnumQuerys.FIND_USERS.getQuery();
	public String FIND_USER_BY_ROL_ADMIN = EnumQuerys.FIND_USER_BY_ROL_ADMIN.getQuery();*/

    @Query(value = FIND_USERS, nativeQuery = true)
    List<User> obtenerUsers();
    
	@Query(value = FIND_USER_BY_ROL_ADMIN, nativeQuery = true)
    List<ResponseAdminsDTO> obtenerAdmins(String rol);
	
}
