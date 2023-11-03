package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Etudiant;
import com.example.demo.service.etudiantservice;

@RestController
@RequestMapping("/student")
public class etudiantcontroller {
    @Autowired
    etudiantservice es;

    @GetMapping("/")
    public List<Etudiant> getAllStudents() {
        return es.getAll();
    }
    
    @GetMapping("/getByName/{name}")
    public List<Etudiant> getByName(@PathVariable String name) {
        return es.getByName(name);
    }

    @GetMapping("/getByPrenom/{prenom}")
    public List<Etudiant> getByPrenom(@PathVariable String prenom) {
        return es.getByPrenom(prenom);
    }

    @GetMapping("/getByNameAndPrenoun/{name}/{prenom}")
    public List<Etudiant> getByNameAndPrenom(@PathVariable String name, @PathVariable String prenom) {
        return es.getByNameAndPrenom(name, prenom);
    }

    @GetMapping("/getByMail/{mail}")
    public List<Etudiant> getByMail(@PathVariable String mail) {
        return es.getByMail(mail);
    }

    @GetMapping("/getByCin/{cin}")
    public List<Etudiant> getByCin(@PathVariable String cin) {
        return es.getByCin(cin);
    }

    @PostMapping("/add")
	public void addStudent(@RequestBody Etudiant e) {
        es.add(e);
    }

    @PostMapping("/update")
	public void updateStudent(@RequestBody Etudiant e) {
        es.update(e);
    }

    @DeleteMapping("/delete")
	public void deleteStudent(@RequestBody Etudiant e) {
        es.delete(e);
    }

    @DeleteMapping("/deleteById/{id}")
	public void deleteStudentById(@PathVariable Long id) {
        es.deleteById(id);
    }

    @GetMapping("/calculTauxReussite")
    public float MoyenneReussite (){
        return es.TauxReussit();
    }
}
