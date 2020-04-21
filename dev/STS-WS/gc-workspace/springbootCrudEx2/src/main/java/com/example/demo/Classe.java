package com.example.demo;


import org.springframework.data.annotation.Id;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Classe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String ClasseNom;
	
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "classe_id")
	private List<Etudiant> etudiant;


	public String getClasseNom() {
		return ClasseNom;
	}


	public void setClasseNom(String classeNom) {
		ClasseNom = classeNom;
	}

}
