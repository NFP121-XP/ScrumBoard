/**
 * Date de création : 3 févr. 2016 
 * Auteur : Pascal & Xavier
 * Nom du fichier : ListeTache.java
 * Package : com.scrum
 * copyright 2016
 * Git : 
 */
package com.scrum.business;
import java.util.ArrayList;
import java.util.List;

/**
 * Liste des taches
 *
 */
public class ListeTache {
	private List <Tache> taches = new ArrayList<Tache>();
	private int count;
	/**
	 * @return la liste des taches
	 */
	public List<Tache> getTaches() {
		return taches;
	}
	/**
	 * @return la  tache
	 */
	public Tache getTache(int indice) {
		Tache tache = this.taches.get(indice);
		return tache;
	}

	/**
	 * @param taches : met à jour l'attribut : taches de la ListeTache.java
	 */
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
	/**
	 * @return nombre de taches dans le tableau
	 */
	public int nbTache(){
		int len = this.taches.size();
		return len;
	}
	
	/*********************************************************************************************
	 * <h2> Ajouter une tache </h2>
	 * @param simpleDateFormat
	 * @param id
	 * @param type
	 * @param statut
	 * @param nom
	 * @param description
	 * @param dateCreation
	 * 
	 * @return numero de la tache créé
	 * 
	 * 4 types de tâche : Fonctionnalité (bleu), Amélioration (vert), Bug (orange), Spike (magenta)
	 * 4 statuts : 1-ToDo, 2-InProcess, 3-ToVerify, 4-Done
	 * 
	 * fait appel au constructeur de Tache et ajoute la Tache au tableau liste des taches
	 */
		// ajout d'une tache par appel au Constructeur de Tache 
		// et insertion en fin de tableau taches (avec un s) 
		// de l'objet de type Tache
		// Incrementation du compteur de taches
	
	public int addTache(int type, String nom, String description) {
		taches.add(new Tache(count, type, nom, description));	
			return count++;
	}
	

	/*********** Constructor
	 * 
	 * @param taches
	 */
	public ListeTache() {
//		this.taches = null;
		this.count = 0;
	}

	/**
	 *  Liste des taches
	 */
	@Override
	public String toString() {
		String result = "";
		int len = taches.size();
		int i = 0;
		for(Tache t : taches){
			result += i++ + 1 +"/" + len +" : " + t +"\n";
		}
		return result;
	}


	
	
 }
