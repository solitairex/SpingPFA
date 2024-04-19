package com.example.salhumanbe12.dao;

import lombok.*;

@Getter@Setter@NoArgsConstructor
public class Fiche_de_paieDAO {
    Long fiche_de_paie_id;

    String periode;

    int montant_brut;

    int montant_net;

    String details_des_deductions;

}
