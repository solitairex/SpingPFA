package com.example.salhumanbe12.dao;

import com.example.salhumanbe12.entities.Permissions;
import com.example.salhumanbe12.entities.Utilisateur;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Getter@Setter@NoArgsConstructor
public class RoleDAO {
    private Long id;
    private String desc;
    private String roleName;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Utilisateur> users=new ArrayList<>();
    private Permissions permissions;
}
