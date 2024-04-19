package com.example.salhumanbe12.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Users")
@Getter
@Setter
@NoArgsConstructor

public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int idUser;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String mdp;

    boolean active;
    @ManyToMany (mappedBy = "users",fetch = FetchType.LAZY)
    private List<Role> roles=new ArrayList<>();
}
