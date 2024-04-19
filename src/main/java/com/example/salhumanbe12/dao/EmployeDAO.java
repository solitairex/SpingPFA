package com.example.salhumanbe12.dao;

import lombok.*;

import java.util.Date;
@Getter@Setter@NoArgsConstructor
public class EmployeDAO {
    Long Idemploye;

    String Nom;

    String Prenom;

    String département;
    String poste;

    Date embauche;

}
