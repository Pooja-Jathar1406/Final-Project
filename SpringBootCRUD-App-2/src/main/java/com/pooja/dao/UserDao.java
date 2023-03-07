package com.pooja.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
import com.pooja.model.User;
 

@Repository
public interface UserDao extends JpaRepository<User, String> {
	 
	 
//	login
	@Query(value = "SELECT * FROM user WHERE  email =:email and password=:password and authenticate!=0", nativeQuery = true)
	List<User> findAllActiveUsersNative(@Param(value = "email") String email, @Param(value = "password") String password);
 
	@Query(value = "select * from user  where authenticate = '0' ", nativeQuery = true)
	public List<User> findByAuthenticate();
	
	@Query(value = "update user set authenticate=1 where authenticate = '0' ", nativeQuery = true)
	public List<User> authenticateAdmin();
	
}
