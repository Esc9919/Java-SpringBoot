package br.com.caldeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caldeira.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long>  {

	
	
}
