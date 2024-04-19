package com.example.salhumanbe12.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Table(name="heure_travaille")
@NoArgsConstructor@AllArgsConstructor@Getter@Setter
public class Heure_travaille {


    @Column(name = "date")
    private Date date;

    @Column(name = "nbre_heures")
    private int nbre_heures;

    @Column(name = "travail")
    private int travail;

    @Column(name = "absence")
    private int absence;
    //clé etranger de employe


}
