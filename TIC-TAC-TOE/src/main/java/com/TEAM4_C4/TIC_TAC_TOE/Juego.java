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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		final JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("");
		contentPane.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("");
		contentPane.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("");
		contentPane.add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_4 =new JToggleButton("");
		contentPane.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("");
		contentPane.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("");
		contentPane.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("");
		contentPane.add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_8  =new JToggleButton(""); 
		contentPane.add(tglbtnNewToggleButton_8);
		
		
		
		//LISTENERS
		tglbtnNewToggleButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(tglbtnNewToggleButton_1.isSelected()) {
					tglbtnNewToggleButton_1.setForeground(new Color(51, 204, 51));

					tglbtnNewToggleButton_1.setText("X");

					
				}else {
					tglbtnNewToggleButton_1.setBackground(Color.WHITE);
					tglbtnNewToggleButton_1.setText("");

				}
			}
		});
			
		
			
		
	}

}
