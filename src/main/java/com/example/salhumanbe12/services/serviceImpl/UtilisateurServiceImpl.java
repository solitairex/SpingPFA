package com.example.salhumanbe12.services.serviceImpl;

import com.example.salhumanbe12.Repository.EmployeRepository;
import com.example.salhumanbe12.Repository.UserRepository;
import com.example.salhumanbe12.dao.UtilisateurDAO;
import com.example.salhumanbe12.services.EmployeService;
import com.example.salhumanbe12.services.UtilisateurService;
import com.example.salhumanbe12.utils.ObjectMapperUtils;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.salhumanbe12.entities.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UtilisateurDAO createUtilisateur(UtilisateurDAO utilisateur) {
        Utilisateur addedUtilisateur = userRepository.save(ObjectMapperUtils.map(utilisateur, Utilisateur.class));
        return ObjectMapperUtils.map(addedUtilisateur, UtilisateurDAO.class);
    }

    @Override
    public boolean deleteUtilisateur(Long idUser) {
        Optional<Utilisateur> searchedUtilisateur = userRepository.findById(String.valueOf(idUser));

        if(searchedUtilisateur.isEmpty()) return false;
        userRepository.delete(searchedUtilisateur.get());
        return true;
    }

    @Override
    public List<UtilisateurDAO> getAllUtilisateur() {
        List<Utilisateur> utilisateurList = userRepository.findAll();
        List<UtilisateurDAO> utilisateurs = ObjectMapperUtils.mapAll(utilisateurList, UtilisateurDAO.class);
        return utilisateurs;
    }

    @Override
    public UtilisateurDAO getUtilisateur(Long idUser) {
        Optional<Utilisateur> searchedUtilisateur = userRepository.findById(String.valueOf(idUser));

        if(searchedUtilisateur.isEmpty()) return null;
        return ObjectMapperUtils.map(searchedUtilisateur.get(), UtilisateurDAO.class);
    }

    @Override
    public UtilisateurDAO updateUtilisateur(Long idUser, UtilisateurDAO utilisateur) {
        if(!userRepository.existsById(String.valueOf(idUser)))
            return null;
        else
            return ObjectMapperUtils.map(userRepository.save(ObjectMapperUtils.map(utilisateur, Utilisateur.class)), UtilisateurDAO.class);
    }

}