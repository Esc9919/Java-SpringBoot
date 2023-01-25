package br.com.caldeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caldeira.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

	
	
}
