package com.example.salhumanbe12.Repository;
import com.example.salhumanbe12.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur,String> {
    Utilisateur findByUsername(String userName);
}
