/**
 * <h2> Classe Personne </h2>
 */
package com.scrum.business;
// Pour la sérialisation des objets
import java.io.Serializable; 	
// Pour la date
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Calendar;

// ma classe implemente la classe serialisable
// grace à cette implementation il sera possible de sauvegarder 
public class Personne implements Serializable{
	/**
	 *  <h3> Attributs de la classe Personne </h3>
	 */
	private int id;									//Numero unique
	private String nom;								// Nom
	private String prenom;							// Prenom
	private String mail;							// mail
	protected GregorianCalendar dateDeNaissance;	// Date de naissance
	
	//******************************************************************
	/**
	 * 	<h3> Getter Setter </h3>
	 */
	//******************************************************************

	/**
	 * @return la donnée id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id met à jour la id de la Personne.java
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return la donnée nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom met à jour la nom de la Personne.java
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return la donnée prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom met à jour le prenom de la Personne.java
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return la donnée mail
	 */
	public String getMail() {		
		return mail;
	}
	/**
	 * @param mail met à jour la mail de la Personne.java
	 */
	public void setMail(String mail) {//TODO : controle du @ et du .
		this.mail = mail;
	}
	/**
	 * @return la donnée dateDeNaissance
	 */
	public GregorianCalendar getDateDeNaissance() {//TODO : ?format du retour
		return dateDeNaissance;
	}
	public String getStringDateDeNaissance() {	// format de retour String
		String chaine="";
		chaine = dateDeNaissance.get(Calendar.DAY_OF_MONTH)+"/"+
				dateDeNaissance.get(Calendar.MONTH)+"/"+
				dateDeNaissance.get(Calendar.YEAR);
		return chaine;
	}
	/**
	 * @return l'age = Année de naissance - Année courrante
	 */
	public int getAge() {//TODO : Calcul de l'age
		int age=0;
		GregorianCalendar now = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"));
		age= now.get(Calendar.YEAR) - this.dateDeNaissance.get(Calendar.YEAR);
		return age;
	}
	/**
	 * @param dateDeNaissance met à jour la dateDeNaissance de la Personne.java
	 */
	public void setDateDeNaissance(String mail, int jour, int mois, int annee) {
		this.dateDeNaissance.set(annee, mois, jour, 00, 00, 0);
	}
	/**
	 *   <h3> Les construteurs de la classe Personne </h3>
	 */
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @pour la date De Naissance :
	 * @param jour
	 * @param mois
	 * @param annee
	 * TODO ????
	 * @return 	<ul>
	 * 				<li> true : personne créé </li>
	 * 				<li> false : personne pas créé </li>
	 * 			</ul>
	 */
	
	
	
	
	
	
	public Personne(int id, String nom, String prenom, String mail, int jour, int mois, int annee) {
		super();// ****????????**** Est ce necessaire? non !?!
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		// La date avec le GregorianCalendar
		this.dateDeNaissance = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"));
		this.dateDeNaissance.set(annee, mois, jour, 12, 00, 0);
		System.out.print("Création de la ");
		System.out.println(toString());
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne : Numéro " + getId() + ", " + getNom() + ", " + getPrenom()
				+ ", adresse Mail : " + getMail() + ", né le : " + getStringDateDeNaissance() + ", a aujourd'hui : "
				+ getAge() + " ans";
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}