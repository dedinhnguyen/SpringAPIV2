package com.example.demo.reponsitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Role;

public interface RoleReponsitory extends JpaRepository<Role, Long>{
	Optional<Role> findByName(String name);

}
