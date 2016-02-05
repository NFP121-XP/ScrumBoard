/**
 * Date de création : 3 févr. 2016 
 * Auteur : Pascal & Xavier
 * Nom du fichier : TypeDeTache.java
 * Package : com.scrum
 * copyright 2016
 * Git : 
 */
package com.scrum.business;

/**
 * 4 types de tâche : Fonctionnalité (bleu), Amélioration (vert), Bug (orange), Spike (magenta)
 *
 */
public class TypeDeTache {
	private String nom;

	/**
	 * @return la donnée nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom : met à jour l'attribut : nom de la TypeDeTache.java
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * ********* Constructor
	 * @param nom
	 */
	public TypeDeTache(String nom) {
		setNom(nom);
	}

	
}
