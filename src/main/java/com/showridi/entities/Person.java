package com.showridi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long code;
private String nom;
public Person() {
	super();
}
public Person(String nom) {
	super();
	this.nom = nom;
}
@Override
public String toString() {
	return "Person [code=" + code + ", nom=" + nom + "]";
}
public Long getCode() {
	return code;
}
public void setCode(Long code) {
	this.code = code;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}


}
