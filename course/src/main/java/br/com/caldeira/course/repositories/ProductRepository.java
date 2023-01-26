package br.com.caldeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caldeira.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

	
	
}
