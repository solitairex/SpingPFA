package com.example.salhumanbe12.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Table(name="conge")
@NoArgsConstructor@AllArgsConstructor@Getter@Setter
public class Conge {
    @Column(name="debut")
    Date debut;
    @Column(name="fin")
    Date fin;
    @Column(name="statut")
    conge_status statut;
}
