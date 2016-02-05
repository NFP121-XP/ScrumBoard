/**
 * Date de création : 5 févr. 2016 
 * Auteur : Pascal & Xavier
 * Nom du fichier : Souris.java
 * Package : com.scrum.gui
 * copyright 2016 ScrumBoard
 * Git : 
 * Souris19:14:44
 */
package com.scrum.gui;

	/**
	 *	<h2><em>Classe</em>  <b>Souris</b>  </h2>
	 *  <p>Composition de la classe Souris du projet ScrumBoard dans le fichier Souris.java</p>
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

public class Souris {
/**
 * A partir d'un composant avec MouseEvent

En enregistrant un MouseEvent auprès de votre composant graphique, vous pouvez avoir accès à la position de la souris relativement à ce composant. Il vous suffira ensuite d'utiliser la méthode getLocationOnScreen() de Component pour calculer la position de la souris par rapport à l'écran.

int x = (int)(mouseEvent.getPoint().getX() + monComposant.getLocationOnScreen().getX());
int y = (int)(mouseEvent.getPoint().getY() + monComposant.getLocationOnScreen().getY());
Vous pouvez aussi utiliser la méthode convertPointToScreen() de la classe javax.swing.SwingUtilities. Par exemple :

MouseEvent event = ...;
Component composant = ...;
Point locationComposant = event.getPoint();
Point locationEcran = SwingUtilities.convertPointToScreen(locationComposant, composant);
Sans composant graphique

A partir de Java 5.0 (Tiger), si vous voulez connaître la position de la souris (même en dehors d'une fenêtre) vous pouvez utiliser l'objet MouseInfo du package java.awt. Par exemple :

PointerInfo pointer = MouseInfo.getPointerInfo();
Point location = pointer.getLocation();
System.out.println("La souris se trouve en "+location);
Attention, l'instance de PointerInfo n'est pas mise à jour automatiquement. Vous devrez en récupérer une nouvelle instance à chaque fois.

Avant Java 5.0, la seule solution possible est de passer par JNI (Java Native Interface). Vous pourrez ainsi avoir accès grâce à des langages plus proches du système aux cooordonnées de la souris à l'écran. Attention tout de même, vous risquez de perdre la portabilité de votre application. 	
 */


/**
 * 
 *  getPointerInfo().getLocation() returns the position relative to the screen. 
 *  If you want the position relative to your component (like given by MouseListeners) 
 *  you can subtract yourComponent.getLocationOnScreen() from it. – Thomas Ahle Jan 10 '12 at 10:43 
	
In addition to what @ThomasAhle said, you can avoid implementing it yourself, 
by using an already implemented convinience method: 
SwingUtilities.convertPointFromScreen(MouseInfo.getPointerInfo().getLocation(), component)
 * 
 * 
 */
