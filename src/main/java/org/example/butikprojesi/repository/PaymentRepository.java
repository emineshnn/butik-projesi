package org.example.butikprojesi.repository;

import org.example.butikprojesi.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository
        extends JpaRepository<Payment, Long> {

}
