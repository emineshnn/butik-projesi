package org.example.butikprojesi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;

    private String district;

    private String street;

    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
