package org.example.butikprojesi.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
import org.example.butikprojesi.entity.Role;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;

    private String phone;

    private String gender;

    private String password;
    @ManyToMany
    @JoinTable(
            name = "customer_roles",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

}
