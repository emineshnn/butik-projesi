package org.example.butikprojesi.repository;

import org.example.butikprojesi.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerOrderRepository
        extends JpaRepository<CustomerOrder, Long> {

}
