package br.com.caldeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caldeira.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

	
	
}
