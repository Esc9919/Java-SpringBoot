package br.com.caldeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caldeira.course.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

	
	
}
