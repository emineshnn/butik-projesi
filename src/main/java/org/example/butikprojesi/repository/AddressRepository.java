package org.example.butikprojesi.repository;

import org.example.butikprojesi.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
