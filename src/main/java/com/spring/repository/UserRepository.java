package com.spring.repository;

import java.util.List;

import com.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByActive(boolean isActive);
	List<User> findByNameContaining(String name);
	User findByName(String user);


}
