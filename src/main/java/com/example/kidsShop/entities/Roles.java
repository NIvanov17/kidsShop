package com.example.kidsShop.entities;

import com.example.kidsShop.entities.enums.RolesEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RolesEnum name;
}
