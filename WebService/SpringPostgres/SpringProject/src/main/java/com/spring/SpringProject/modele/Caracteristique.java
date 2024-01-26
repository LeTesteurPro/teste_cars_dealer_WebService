package com.spring.SpringProject.modele;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Caracteristique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nom;

    public Caracteristique() {
    }
    public Caracteristique(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
        
    

    

}