package com.robotdreams.assignment7.repository;

import com.robotdreams.assignment7.entity.OrderProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductRepository extends CrudRepository<OrderProduct, Long> {

}
