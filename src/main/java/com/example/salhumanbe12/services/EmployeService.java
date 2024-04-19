package com.example.salhumanbe12.services;

import com.example.salhumanbe12.dao.EmployeDAO;
import com.example.salhumanbe12.dao.UtilisateurDAO;

import java.util.List;

public interface EmployeService {
    EmployeDAO createEmploye(EmployeDAO employe);

    boolean deleteEmploye(Long idemploye);

    List<EmployeDAO> getAllEmploye();

    EmployeDAO getEmploye(Long idemploye);

    EmployeDAO updateEmploye(Long idemploye, EmployeDAO employe);
}
