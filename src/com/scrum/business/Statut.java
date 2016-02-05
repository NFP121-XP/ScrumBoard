/**
 * Date de création : 3 févr. 2016 
 * Auteur : Pascal & Xavier
 * Nom du fichier : Statut.java
 * Package : com.scrum
 * copyright 2016
 * Git : 
 */
package com.scrum.business;

/**
 * @ 4 Statuts différents : 1-ToDo, 2-InProcess, 3-ToVerify, 4-Done
 *
 */
public class Statut {
	private String nom;

	/**
	 * @return la donnée nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom : met à jour l'attribut : nom de la Statut.java
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * ********* Constructor
	 * @param nom
	 */
	public Statut(String nom) {
		super();
		this.nom = nom;
	}



}
