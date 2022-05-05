package com.TEAM4_C4.TIC_TAC_TOE;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JToggleButton;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JProgressBar;

public class Juego extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 600, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JToggleButton btn11 = new JToggleButton("");
		btn11.setBounds(6, 5, 146, 87);
		contentPane.add(btn11);
		
		JToggleButton btn12 = new JToggleButton("");
		btn12.setBounds(152, 5, 146, 87);
		contentPane.add(btn12);
		
		JToggleButton btn13 = new JToggleButton("");
		btn13.setBounds(298, 5, 146, 87);
		contentPane.add(btn13);
		
		JToggleButton btn21 =new JToggleButton("");
		btn21.setBounds(6, 92, 146, 87);
		contentPane.add(btn21);
		
		JToggleButton btn22 = new JToggleButton("");
		btn22.setBounds(152, 92, 146, 87);
		contentPane.add(btn22);
		
		JToggleButton btn23 = new JToggleButton("");
		btn23.setBounds(298, 92, 146, 87);
		contentPane.add(btn23);
		
		JToggleButton btn31 = new JToggleButton("");
		btn31.setBounds(6, 179, 146, 87);
		contentPane.add(btn31);
		
		JToggleButton btn32 = new JToggleButton("");
		btn32.setBounds(152, 179, 146, 87);
		contentPane.add(btn32);
		
		JToggleButton btn33  =new JToggleButton(""); 
		btn33.setBounds(298, 179, 146, 87);
		contentPane.add(btn33);
		
		JButton btnNuevaPartida = new JButton("NuevaPartida");
		btnNuevaPartida.setBounds(636, 16, 117, 29);
		contentPane.add(btnNuevaPartida);
		
		JLabel lblNewLabel = new JLabel("X, coloca ficha...");
		lblNewLabel.setBounds(489, 54, 61, 16);
		contentPane.add(lblNewLabel);
		
		
		
		//LISTENERS
		btn11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(btn11.isSelected()) {
					btn11.setForeground(new Color(51, 204, 51));

					btn11.setText("X");

					
				}else {
					btn11.setBackground(Color.WHITE);
					btn11.setText("");

				}
			}
		});
			
		
			
		
	}
}
