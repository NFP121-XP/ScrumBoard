/**
 * Date de création : 4 févr. 2016 
 * Auteur : Pascal & Xavier
 * Nom du fichier : Equipe.java
 * Package : com.scrum
 * copyright 2016
 * Git : 
 */
package com.scrum.business;
import java.util.ArrayList;
import java.util.List;



	/**
	 *	<h2><em>Classe</em>  <b>Equipe</b>  </h2>
	 *  <p>Composition de la classe Equipe du projet ScrumBoard dans le fichier Equipe.java</p>
	 *  <p>Une equipe est constitué de personnes</p>
	 *<ul>
	 * 		<li>		Getter / Setter		</li>
	 * 		<li>	 	Constructeur		</li>
	 * 		<li>		nominerChefDEquipe				</li>
	 * 		<li>	 	Ajouter un équipier(ière), une personne à l'équipe		</li>
	 * 		<li>	 	Supprimer une personne de l'équipe		</li>
	 * 		<li>	 	Modification	?	</li>
	 * 		<li>	 	Nombre de personne dans l'équipe		</li>
	 * 		<li>	 	Liste des équipiers	String	</li>
	 * 
	 *</ul>
	 * 
	 */

	/**
	 *	<h2><em>Classe</em>  <b>Equipe</b>  </h2>
	 *  <p>Composition de la classe Equipe du projet ScrumBoard dans le fichier Equipe.java</p>
	 * <p>Description : </p>
	 *<ul>
	 * 		<li>		Getter / Setter		</li>
	 * 		<li>	 	Constructeur		</li>
	 * 		<li>	 	Ajouter 		</li>
	 * 		<li>	 	Supprimer 		</li>
	 * 		<li>	 	Modification		</li>
	 * 		<li>	 	Nombre 		</li>
	 * 		<li>	 	Liste 	</li>
	 * 		<li>	 	 	</li>
	 *</ul>
	 * 
	 */
public class Equipe {

	private int id;
	private String nom;
	private Personne chefDEquipe;
	private List <Personne> equipiers = new ArrayList<Personne>();
	private int count; //compteur d'équipiers
	

	
/**
 * <h3>L'accès aux attributs : Les Getter et les Setter </h3>
 */

	/**<h4><em>Get / Lire</em> <b>nom</b></h4>
	 * <p>Méthode : getNom() de la classe Equipe</p>
	 * <p>Lit l'attribut <b>nom</b> du type <b>String</b>de la classe <b>Equipe</b></p>
	 * <p> </p>
	 * <p><i>@return</i> : Renvoi la donnée nom du type String de Equipe</p>
	 */
	public String getNom() {
		return nom;
	}
	/**<h4><em>Set / Ecrire</em> <b>nom</b> 	</h4>
	 * <p>Méthode de mise à jour (modification) : setNom() de la classe Equipe</p>
	 * <p>Ecrit l'attribut <b>nom</b> de type <b>String</b>  de la classe <b>Equipe</b>	</p>
	 * <p>															</p>
	 * <p><i>@param</i> : le paramètre nom met à jour l'attribut nom de Equipe</p> 
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**<h4><em>Get / Lire</em> <b>id</b></h4>
	 * <p>Méthode : getId() de la classe Equipe</p>
	 * <p>Lit l'attribut <b>id</b> du type <b>int</b>de la classe <b>Equipe</b></p>
	 * <p> </p>
	 * <p><i>@return</i> : Renvoi la donnée id du type int de Equipe</p>
	 */
	public int getId() {
		return id;
	}


	/**<h4><em>Set / Ecrire</em> <b>id</b> 	</h4>
	 * <p>Méthode de mise à jour (modification) : setId() de la classe Equipe</p>
	 * <p>Ecrit l'attribut <b>id</b> de type <b>int</b>  de la classe <b>Equipe</b>	</p>
	 * <p>															</p>
	 * <p><i>@param</i> : le paramètre id met à jour l'attribut id de Equipe</p> 
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**<h4><em>Get / Lire</em> <b>chefDEquipe</b></h4>
	 * <p>Méthode : getChefDEquipe() de la classe Equipe</p>
	 * <p>Lit l'attribut <b>chefDEquipe</b> du type <b>Personne</b>de la classe <b>Equipe</b></p>
	 * <p> </p>
	 * <p><i>@return</i> : Renvoi la donnée chefDEquipe du type Personne de Equipe</p>
	 */
	public Personne getChefDEquipe() {
		return chefDEquipe;
	}


	/**<h4><em>Set / Ecrire</em> <b>chefDEquipe</b> 	</h4>
	 * <p>Méthode de mise à jour (modification) : setChefDEquipe() de la classe Equipe</p>
	 * <p>Ecrit l'attribut <b>chefDEquipe</b> de type <b>Personne</b>  de la classe <b>Equipe</b>	</p>
	 * <p>															</p>
	 * <p><i>@param</i> : le paramètre chefDEquipe met à jour l'attribut chefDEquipe de Equipe</p> 
	 */
	public void setChefDEquipe(Personne chefDEquipe) {
		this.chefDEquipe = chefDEquipe;
	}


	/**<h4><em>Get / Lire</em> <b>count</b></h4>
	 * <p>Méthode : getCount() de la classe Equipe</p>
	 * <p>Lit l'attribut <b>count</b> du type <b>int</b>de la classe <b>Equipe</b></p>
	 * <p> </p>
	 * <p><i>@return</i> : Renvoi la donnée count du type int de Equipe</p>
	 */
	public int getCount() {
		return count;
	}


	/**
	 * <h3>			Constructeur	(minimal)		</h3>
	 * ScrumBoard
	 * Constructeur de la classe <b>Equipe</b> 
	 * 
	 * <ul>
	 * 		<li>	@param id
	 * 		<li>	@param nom
	 * 		<li>	@param chefDEquipe				</li>
	 * </ul>
	 * 							
	 *		<p> </p>
	 */
	public Equipe(int id, String nom) {
		setId(id);
		setNom(nom);
		System.out.print("création de l'équipe : ");
		System.out.println(toString());
	}

	/**
	 * <h3>			Constructeur	(avec chef d'équipe)		</h3>
	 * ScrumBoard
	 * Constructeur de la classe <b>Equipe</b> 
	 * 
	 * <ul>
	 * 		<li>	@param id
	 * 		<li>	@param nom
	 * 		<li>	@param chefDEquipe				</li>
	 * </ul>
	 * 							
	 *		<p> </p>
	 */
	public Equipe(int id, String nom, Personne chefDEquipe) {
		setId(id);
		setNom(nom);
		setChefDEquipe(chefDEquipe);
		System.out.print("création de l'équipe : ");
		System.out.println(toString());
		
		
		//TODO: implmementer ......
		
	}

	/**
	 * <h3><em>Ajouter</em> un équipier, (une Personne) par son id		</h3>
	 * ScrumBoard
	 * Méthode <b>addEquipier</b> de la classe <b>Equipe</b> 
	 * 
	 * <ul>
	 * 		<li>	@param idPersonne	: numérod'identifiant d'une personne		</li>
	 * 		<li>	@param personnes	: liste de personnes		</li>
	 * 		<li></li>
	 * 		<li>	@return	int			: renvoi le numéro d'équipier		</li>
	 * </ul>
	 * 							
	 * TODO
	 * 		<p><em>	==> 	On l'utilise en lui passant en paramètre  : </em></p>
	 * 		<p> on ajoute un équipier à l'équipe en le selectionnant par son id</p>
	 * 		<p> voir la méthode : <b>getPersonneById</b></p>
	 * 		<p> </p>
	 *		<p> </p>
	 */
	public int addEquipier(int idPersonne, List<Personne> personnes) {
		equipiers.add(getPersonneById(idPersonne, personnes));	
			return count++;
	}

	/**
	 * <h3><em>Selectionner</em> une Personne par son id			</h3>
	 * ScrumBoard
	 * Méthode <b>getPersonneById</b> de la classe <b>Equipe</b> 
	 * 
	 * 
	 * <ul>
	 * 		<li>	@param idPersonne	:	id de la personne 	</li>
	 * 		<li>	@param personnes	:	Liste de personnes	</li>
	 * 		<li>												</li>
	 * 		<li>	@return	Personne	:	L'objet Personne correspondant à l'id	</li>
	 * </ul>
	 * 							
	 * TODO
	 * 		<p><em>	==> 	On l'utilise en lui passant en paramètre  : </em></p>
	 * <p> un identifiant d'une personne et une liste de personnes 		</p>
	 * <p> En retour on obtient l'objet Personne correspondant à l'id passé</p>
	 * <p> 	ou bien un objet null si il n'est pas dans la liste	</p>
	 */
	public Personne getPersonneById(int idPersonne, List<Personne> personnes) {
		Personne personne = null;
		for (int i = 0; i < personnes.size(); i++) {
			if (personnes.get(i).getId() == idPersonne) {
				personne = personnes.get(i);
			}
		}
		return personne;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = "Equipe "+ getNom() +" numéro " + getId() + 
				", nb déjà enregistré" + getCount() + 
				", Chef d'équipe " + getChefDEquipe()+  ".\n";
		int len = equipiers.size();
		int i = 0;
		for(Personne e : equipiers){
			result += i++ + 1 +"/" + len +" : " + e +"\n";
		}

		return result;
	}

}
