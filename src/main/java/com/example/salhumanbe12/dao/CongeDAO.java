package com.example.salhumanbe12.dao;

import lombok.*;

import java.util.Date;
@Getter@Setter@NoArgsConstructor
public class CongeDAO {
    Date debut;
    Date fin;
    conge_statusDAO statut;
}