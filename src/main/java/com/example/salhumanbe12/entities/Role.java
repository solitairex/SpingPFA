package com.example.salhumanbe12.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Table(name="Role")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Description")
    private String desc;
    @Column(length=20,unique = true)
    private String roleName;
    @ManyToMany(fetch = FetchType.EAGER)
    //@JoinTable(name="USER_ROLES")
    @ToString.Exclude
    private List<Utilisateur> users=new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private Permissions permissions;
}
