package com.example.salhumanbe12.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor@NoArgsConstructor@Data@Entity
@Table(name = "Element_salaire")

public class Element_Salaire {
    @Id
    @GeneratedValue(generator = "Element salaire")
    @Column(name="base" ,nullable = false)
    int base;
    @Column(name="somme")
    int somme;
    @Column(name="prime")
    int prime;
    @Column(name="indemnité")
    int indemnité;
}
