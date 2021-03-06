package com.devsuperior.dsmovie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.Model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{

	User findByEmail(String email);
}
