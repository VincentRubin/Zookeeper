package com.example.demo;


import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classe_id")
	private Classe classeID;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
