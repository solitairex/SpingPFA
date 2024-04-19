package com.example.salhumanbe12.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor@NoArgsConstructor@Data
@Table(name="fiche de paie")

public class Fiche_de_paie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fiche_paie_id")
    Long fiche_de_paie_id;
    @Column(name ="periode")
    String periode;
    @Column(name ="montant_brut",nullable = false)
    int montant_brut;
    @Column(name ="montant_net",nullable = false)
    int montant_net;
    @Column(name ="details_des_deductions")
    String details_des_deductions;

}
