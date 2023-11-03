package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Etudiant;
import com.example.demo.repository.etudiantrepository;


@Service 
public class etudiantserviceimpl implements etudiantservice {
    @Autowired
    etudiantrepository er ;
    
    @Override
    @Transactional
    public List<Etudiant> getAll() {
        return er.findAll();
    }

    @Override
    @Transactional
    public List<Etudiant> getByName(String name) {
        return er.findByName(name);
    }

    @Override
    @Transactional
    public List<Etudiant> getByPrenom(String prenom) {
        return er.findByPrenom(prenom);
    }

    @Override
    @Transactional
    public List<Etudiant> getByNameAndPrenom(String name, String prenom) {
        return er.findByNameAndPrenom(name, prenom);
    }

    @Override
    @Transactional
    public List<Etudiant> getByMail(String mail) {
        return er.findByMail(mail);
    }

    @Override
    @Transactional
    public List<Etudiant> getByCin(String cin) {
        return er.findByCin(cin);
    }

    @Override
    @Transactional
    public void add(Etudiant e) {
        if(e!=null){
            er.save(e);
        }
    }

    /*public Groupe addNewGroupe(String nomGroupe , boolean isActive ) throws GroupeNameExistException, GroupeNameNotFoundException {
    	validateNewGroupeName( null  , nomGroupe ) ;
    	Groupe groupe = new Groupe() ;
    	groupe.setNomGroupe(nomGroupe);
		groupe.setDateCreation(new Date());
		groupe.setIsActive(isActive);
		groupeRepository.save(groupe);
		return groupe ;
	}*/

    @Override
    @Transactional
    public void update(Etudiant e) {
        if(er.findById(e.getId()).isEmpty()==false){
            er.save(e);
        }
    }

    @Override
    @Transactional
    public void delete(Etudiant e) {
        if(er.findById(e.getId()).isEmpty()==false){
            er.delete(e);
        }
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        if(er.findById(id).isEmpty()==false){
            er.deleteById(id);
        }
    }

    @Override
    @Transactional
    public float TauxReussit() {
        int nbrEtudiantReussi=0;
        float tauxReussit = 0;
        
        List<Etudiant> etudiants = er.findAll();
        int nbrAllStudents = etudiants.size(); 

        for(Etudiant e : etudiants){           
            if (e.getMoy()>=10) {
                nbrEtudiantReussi=nbrEtudiantReussi+1;
            }
        }

        tauxReussit=((float) nbrEtudiantReussi / (float) nbrAllStudents)*100.0f;//nbrEtudiantReussi/nbrAllStudents;
        return tauxReussit;
    }

}
