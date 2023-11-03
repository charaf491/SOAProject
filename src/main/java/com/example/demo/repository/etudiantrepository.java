package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Etudiant;

@Repository
public interface etudiantrepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findByName (String name);
	List<Etudiant> findByPrenom (String prenom);
    List<Etudiant> findByNameAndPrenom (String name, String prenom);
    List<Etudiant> findByMail(String mail);
	List<Etudiant> findByCin(String cin);
}
