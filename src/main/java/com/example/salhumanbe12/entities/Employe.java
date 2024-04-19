package com.example.salhumanbe12.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@AllArgsConstructor@NoArgsConstructor@Data
@Table(name ="Employe")


public class Employe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idemploye")
    Long idemploye;
    @Column(name="Nom")
    String Nom;

    @Column(name = "Prenom")
    String Prenom;
    @Column(name = "departement")
    String département;
    @Column(name = "poste")
    String poste;
    @Column(name = "Embauche")
    Date embauche;

}
