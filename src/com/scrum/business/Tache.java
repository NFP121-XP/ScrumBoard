/**
 * Date de création : 3 févr. 2016 
 * Auteur : Pascal & Xavier
 * Nom du fichier : Tache.java
 * Package : com.scrum
 * copyright 2016
 * Git : 
 */
package com.scrum.business;
import java.util.List;



import java.text.SimpleDateFormat;
import java.util.Date;



public class Tache {
	
	SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat formatter3 = new SimpleDateFormat("EEEE dd/MM/yyyy");
	SimpleDateFormat formatter4 = new SimpleDateFormat("E yyyy-MM-dd");


	/* 
	 * Les Attributs
	 */
	private int id;				// Numero unique d'identifiant de la tache à affecter dans le constructeur
	private int type;				// 4 types de tâche : Fonctionnalité (bleu), Amélioration (vert), Bug (orange), Spike (magenta)
	private int statut;				// 4 positions : 1-ToDo, 2-InProcess, 3-ToVerify, 4-Done
	private String nom;				// Nom de la tache
	private String description;		// Description de la tache
	private Date dateCreation;		// Date du jour
//********************************************************************************************	
/*
 * Les Getters et les Setters	
 **********************************************************************************************
 **********************************************************************************************/
	/**
	 * @return la donnée id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id : met à jour l'attribut : id de la Tache.java
	 */
	public void setId(int id) {
		this.id = id;
	}
//**********************************************************************************************
	/**
	 * <h3> Type de tache </h3>
	 *<ul>
	 * 		<li>	 0 : "Fonctionnalité"	</li>
	 * 		<li>	 1 : "Amélioration"		</li>
	 * 		<li>	 2 : "Bug"				</li>
	 * 		<li>	 3 : "Spike"			</li>
	 *</ul>
	 *
	 * @return la donnée type au format d'un entier
	 */
	public int getType() {
		return type;
	}
	/** 
	 * 4 types de tâche : Fonctionnalité (bleu), Amélioration (vert), Bug (orange), Spike (magenta)
	 * @return la donnée type sous forme de chaine de caractères
	 */

	public String getStringType() {
		String typeString;
		switch(getType()){
			case 0 : typeString="Fonctionnalité"; break;
			case 1 : typeString="Amélioration"; break;
			case 2 : typeString="Bug"; break;
			default : typeString="Spike"; break;
		}
		return typeString;
	}
	/**
	 * @param type : met à jour l'attribut : type de la Tache.java
	 */
	public void setType(int type) {
		this.type = type;
	}
//************************************************************************
	/**
	 * <h3> Statut des taches </h3>
	 *<ul>
	 * 		<li>	 0 : "ToDo"	</li>
	 * 		<li>	 1 : "InProcess"		</li>
	 * 		<li>	 2 : "ToVerify"				</li>
	 * 		<li>	 3 : "Done"			</li>
	 *</ul>
	 *
	 *	4 positions : 1-ToDo, 2-InProcess, 3-ToVerify, 4-Done
	 * @return la donnée statut
	 */
	public int getStatut() {
		return statut;
	}
	 /**	4 positions : 1-ToDo, 2-InProcess, 3-ToVerify, 4-Done
	 * @return la donnée statut
	 */
	public String getStringStatut() {
		String statutString;
		switch(getStatut()){
			case 0 : statutString="ToDo"; break;
			case 1 : statutString="InProcess"; break;
			case 2 : statutString="ToVerify"; break;
			default : statutString="Done"; break;
		}
		return statutString;
	}
	/**
	 * @param statut : met à jour l'attribut : statut de la Tache.java
	 */
	public void setStatut(int statut) {
		this.statut = statut;
	}
	/**
	 * @param statut : met à jour l'attribut : statut de la Tache.java
	 */
	public void upStatut() {
		if(statut<4){
			this.statut += 1;
		}
	}
//**************************************************************************
	
	/**
	 * @return la donnée nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom : met à jour l'attribut : nom de la Tache.java
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return la donnée description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description : met à jour l'attribut : description de la Tache.java
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return la donnée dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
	/**
	 * @return la donnée dateCreation
	 */
	public String getStringDateCreation() {
		String result;
		result = formatter4.format(getDateCreation());
		return result;
	}
/*	/**
	 * @param dateCreation : met à jour l'attribut : dateCreation de la Tache.java
	 
	public void setDateCreation() {
		if(getDateCreation()==null){
			this.dateCreation = new Date();
		}
	
	}
*/	
	/*********************************************************************************************
	 * *********************************** Constructor
	 * @param simpleDateFormat
	 * @param id
	 * @param type
	 * @param statut
	 * @param nom
	 * @param description
	 * @param dateCreation
	 * 
	 * 4 types de tâche : Fonctionnalité (bleu), Amélioration (vert), Bug (orange), Spike (magenta)
	 * 4 statuts : 1-ToDo, 2-InProcess, 3-ToVerify, 4-Done
	 * 
	 * Appel : Tache( 0, 2, "nom", "description")
	 */
	protected Tache(int id, int type, String nom, String description) {
		this.id = id;
		this.type = type;
		this.statut = 0;					// En position ToDo
		this.nom = nom;
		this.description = description;
		this.dateCreation = new Date();
		System.out.print("Création de la ");
		System.out.println(toString());
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tache numéro : " + id + " du "+ dateCreation +",  type : " + getStringType() + ", statut : " + getStringStatut() + ", nom : " + nom + ",  "
				+ description + ".";
	}




}