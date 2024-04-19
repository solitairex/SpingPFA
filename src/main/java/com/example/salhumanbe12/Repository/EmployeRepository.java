package com.example.salhumanbe12.Repository;

import com.example.salhumanbe12.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
Employe findByNom(String nom);   }
