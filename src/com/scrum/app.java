package com.scrum;

import com.scrum.business.*;
import com.scrum.gui.Panel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import java.text.SimpleDateFormat;

public class app {

/**
 * init : creation 
 * 
 * 
 */
	
	public static void main(String[] args) {
		
	 int nbPersonnes = 0;
	 List<Personne> personnes = new ArrayList<Personne>();
	
// creation d'une personne
	 Personne personne1 =new Personne(nbPersonnes++, "Nom1", "prenom1", "nom1.prenom1@mail.com", 01, 01, 1970);
		personnes.add( personne1 );
		personne1.setNom("toto");
		personnes.add( personne1 );

		Personne personne2 = new Personne(1, "Nom2", "prenom2", "nom2.prenom2@mail.com", 02, 02, 1972);
		Personne personne3 = new Personne(1, "Nom3", "prenom3", "nom3.prenom3@mail.com", 03, 03, 1973);
		Personne personne4 = new Personne(1, "Nom4", "prenom4", "nom4.prenom4@mail.com", 04, 04, 1974);
		
// Creation des équipes
		Equipe equipe1 = new Equipe(1, "JAVA Force One", personne1);
		Equipe dreamTeam = new Equipe(2, "Dream Team");
		dreamTeam.setChefDEquipe(personne4);
		System.out.println(dreamTeam);
		dreamTeam.addEquipier(1, personnes);
		System.out.println(dreamTeam);
		dreamTeam.addEquipier(2, personnes);
		System.out.println(dreamTeam);
		dreamTeam.addEquipier(3, personnes);
		System.out.println(dreamTeam);
		dreamTeam.addEquipier(1, personnes);
		
// création des "constantes" (pas très satisfaisant cette manière objet)
		/**
		 * @ 4 Statuts différents : 1-ToDo, 2-InProcess, 3-ToVerify, 4-Done
		 */
		Statut toDo = new Statut("ToDo");
		Statut inProcess = new Statut("InProcess");
		Statut toVerify = new Statut("ToVerify");
		Statut done = new Statut("Done");
		/**
		 * 		4 types de tâche : Fonctionnalité (bleu), Amélioration (vert), Bug (orange), Spike (magenta)
		 */
		TypeDeTache fonctionnalite = new TypeDeTache("Fonctionnalité");
		TypeDeTache amelioration = new TypeDeTache("Amélioration");
		TypeDeTache bug = new TypeDeTache("Bug");
		TypeDeTache spike = new TypeDeTache("Spike");
// essais date		
		System.out.println(System.currentTimeMillis());
		System.out.println(new java.util.Date().getTime());
		System.out.println(Calendar.getInstance().getTimeInMillis() );
		System.out.println(Calendar.getInstance().getTime().getTime ());

		Panel panneau = new Panel();
		
		//création liste de taches
		ListeTache listeTache = new ListeTache();
		// test debug
		System.out.println(listeTache.nbTache()); 	
		//creation des taches
		listeTache.addTache(0, "tache1", "type : 0 = Fonctionnalité"); 	//Fonctionnalité
		listeTache.addTache(1, "tache2", "type : 1 = Amélioration");	//Amélioration
		listeTache.addTache(2, "tache3", "type : 2 = Bug");				//Bug
		listeTache.addTache(3, "tache4", "type : 3 = Spike");			//Spike
		listeTache.addTache(2, "Debug appli Scrum Board", "il faut débugger debugger et encore debugger !!!!"); //une autre tache
		listeTache.getTache(0).upStatut();
		System.out.println(listeTache.getTache(0));
		listeTache.getTache(0).upStatut();
		System.out.println(listeTache.getTache(0));
		listeTache.getTache(0).upStatut();
		System.out.println(listeTache.getTache(0));
		listeTache.getTache(0).upStatut();
		System.out.println(listeTache.getTache(0));
		listeTache.getTache(1).upStatut();
		listeTache.getTache(1).upStatut();
		System.out.println(listeTache.getTache(1));
		listeTache.getTache(1).upStatut();
		listeTache.getTache(1).upStatut();
		listeTache.getTache(1).upStatut();
		listeTache.getTache(1).upStatut();
		System.out.println(listeTache.getTache(1));
		//Tache tache = new Tache(2, "Debug appli Scrum Board", "il faut débugger debugger et encore debugger !!!!");
		
	}

	
	
}
