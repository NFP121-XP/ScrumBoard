/**
 * Date de création : 5 févr. 2016 
 * Auteur : Pascal & Xavier
 * Nom du fichier : Panel.java
 * Package : com.scrum.gui
 * copyright 2016 ScrumBoard
 * Git : 
 * Panel11:43:17
 */
package com.scrum.gui;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;

/**
	 *	<h2><em>Classe</em>  <b>Panel</b>  </h2>
	 *  <p>Composition de la classe Panel du projet ScrumBoard dans le fichier Panel.java</p>
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

public class Panel extends JFrame{
	private JTable table;
	public Panel() {
		setTitle("Scrum Board");
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		System.out.println("panel créé !");
		//				x, y, width, height 
		panel.setBounds(10, 0, 136, 308);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("ToDo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton button = new JButton("Tache 1    ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		table = new JTable();
		panel.add(table);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(145, 0, 136, 308);
		getContentPane().add(panel_1);
		
		JLabel label = new JLabel("In Process");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(label);
		
		JButton button_1 = new JButton("New button");
		panel_1.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(287, 0, 136, 308);
		getContentPane().add(panel_2);
		
		JLabel lblVerify = new JLabel("To Verify");
		lblVerify.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(lblVerify);
		
		JButton button_2 = new JButton("New button");
		panel_2.add(button_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel_3.setBounds(423, 0, 136, 308);
		getContentPane().add(panel_3);
		
		JLabel label_2 = new JLabel("Done");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_3.add(label_2);
		
		JButton button_3 = new JButton("New button");
		panel_3.add(button_3);
		
	}
}
