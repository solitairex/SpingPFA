package com.example.salhumanbe12.services;

import com.example.salhumanbe12.dao.UtilisateurDAO;
import com.example.salhumanbe12.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    UtilisateurDAO createUtilisateur(UtilisateurDAO utilisateur);

    boolean deleteUtilisateur(Long idUser);

    List<UtilisateurDAO> getAllUtilisateur();

    UtilisateurDAO getUtilisateur(Long idUtilisateur);

    UtilisateurDAO updateUtilisateur(Long idUser, UtilisateurDAO utilisateur);
}
