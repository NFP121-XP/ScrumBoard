/**
 * Date de création : 5 févr. 2016 
 * Auteur : Pascal & Xavier
 * Nom du fichier : Panneau.java
 * Package : com.scrum.gui
 * copyright 2016 ScrumBoard
 * Git : 
 * Panneau19:27:55
 */
package com.scrum.gui;

	/**
	 *	<h2><em>Classe</em>  <b>Panneau</b>  </h2>
	 *  <p>Composition de la classe Panneau du projet ScrumBoard dans le fichier Panneau.java</p>
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

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel implements MouseListener {
 
	@Override
	public void paintComponent(final Graphics g) {
 
		try {
			Image img = ImageIO.read(new File("image.jpg"));
			this.setSize(1366, 768);
			g.drawImage(img, 0, 0, null);
 
		} catch (IOException e) {
 
			e.printStackTrace();
		}
 
		addMouseListener(this);
 
	}
 
    @Override
    public void mouseClicked( MouseEvent e )
    {
          // Clique gauche de la souris
           if(e.getButton()==MouseEvent.BUTTON1)
           {
                // Récupération de la position
                Point position = e.getPoint();
            }
     }

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}	




