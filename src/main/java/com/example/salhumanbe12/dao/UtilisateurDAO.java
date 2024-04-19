package com.example.salhumanbe12.dao;

import com.example.salhumanbe12.entities.Role;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter@Setter
public class UtilisateurDAO {
    private int idUser;

    private String nom;

    private String mdp;

    boolean active;
    @ManyToMany(mappedBy = "users",fetch = FetchType.LAZY)
    private List<Role> roles=new ArrayList<>();
     public UtilisateurDAO(){};
}
