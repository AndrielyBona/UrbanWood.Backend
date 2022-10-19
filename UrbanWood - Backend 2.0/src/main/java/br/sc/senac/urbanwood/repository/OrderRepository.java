package br.sc.senac.urbanwood.repository;

import br.sc.senac.urbanwood.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

	

	   /* @Query(value = """
	            select o.id as id, o.initialDate as initialDate, o.priceOrder as priceOrder, o.status as status
	            from Order o
	            """)
	    Page<OrderProjectionW12> findOrderW12OrderByInitialDate(Pageable pageable);*/

}
