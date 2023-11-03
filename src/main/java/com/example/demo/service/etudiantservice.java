package com.example.demo.service;
import java.util.List;

import com.example.demo.model.Etudiant;

public interface etudiantservice {
    
	List<Etudiant> getAll ();

	List<Etudiant> getByName (String name);
	List<Etudiant> getByPrenom (String prenom);
	List<Etudiant> getByNameAndPrenom (String name, String prenom);
	List<Etudiant> getByMail (String mail);
	List<Etudiant> getByCin (String cin);

	void add (Etudiant e);

	void update (Etudiant e);

	void delete (Etudiant e);
	void deleteById (Long id);

	float TauxReussit ();
}
