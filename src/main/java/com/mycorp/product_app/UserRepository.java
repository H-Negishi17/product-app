package com.mycorp.product_app;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycorp.product_app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUsername(String username);

}
