package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Etudiant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="Name", length = 50)
    private String name; // camelCase
    
    @Column(name="nomPoste", length = 50)
    private String prenom;
    
    @Column(name="mail", length = 50)
    private String mail;
    
    @Column(name="cin", length = 50)
    private String cin;

    //@Column(name="Moy", length = 50)
    private float moy;

}