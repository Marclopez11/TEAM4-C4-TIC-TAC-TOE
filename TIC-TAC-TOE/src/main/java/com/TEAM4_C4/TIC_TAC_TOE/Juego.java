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
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JTextField nombre1;
	private final ButtonGroup buttonGroupTipo1 = new ButtonGroup();
	private JTextField nombre2;

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
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNuevaPartida = new JButton("NuevaPartida");
		btnNuevaPartida.setBounds(636, 16, 117, 29);
		contentPane.add(btnNuevaPartida);
		
		JLabel infoPartida = new JLabel("X, coloca ficha...");
		infoPartida.setBounds(489, 54, 61, 16);
		contentPane.add(infoPartida);
		
		JLabel labelNombreJugador1 = new JLabel("New label");
		labelNombreJugador1.setBounds(489, 98, 61, 16);
		contentPane.add(labelNombreJugador1);
		
		JLabel labelNombre1 = new JLabel("New label");
		labelNombre1.setBounds(499, 137, 61, 16);
		contentPane.add(labelNombre1);
		
		nombre1 = new JTextField();
		nombre1.setBounds(579, 132, 130, 26);
		contentPane.add(nombre1);
		nombre1.setColumns(10);
		
		JLabel labelTipo1 = new JLabel("New label");
		labelTipo1.setBounds(499, 196, 61, 16);
		contentPane.add(labelTipo1);
		
		JRadioButton rdBtnHum1 = new JRadioButton("New radio button");
		buttonGroupTipo1.add(rdBtnHum1);
		rdBtnHum1.setBounds(579, 192, 141, 23);
		contentPane.add(rdBtnHum1);
		
		JRadioButton rdBtnCpu1 = new JRadioButton("New radio button");
		buttonGroupTipo1.add(rdBtnCpu1);
		rdBtnCpu1.setBounds(732, 192, 141, 23);
		contentPane.add(rdBtnCpu1);
		
		JLabel labelNombreJugador2 = new JLabel("New label");
		labelNombreJugador2.setBounds(499, 250, 61, 16);
		contentPane.add(labelNombreJugador2);
		
		JLabel labelNombre2 = new JLabel("New label");
		labelNombre2.setBounds(509, 278, 61, 16);
		contentPane.add(labelNombre2);
		
		nombre2 = new JTextField();
		nombre2.setBounds(579, 273, 130, 26);
		contentPane.add(nombre2);
		nombre2.setColumns(10);
		
		JLabel labelTipo2 = new JLabel("New label");
		labelTipo2.setBounds(499, 335, 61, 16);
		contentPane.add(labelTipo2);
		
		JRadioButton rdBtnHum2 = new JRadioButton("New radio button");
		rdBtnHum2.setBounds(579, 331, 141, 23);
		contentPane.add(rdBtnHum2);
		
		JRadioButton rdBtnCpu2 = new JRadioButton("New radio button");
		rdBtnCpu2.setBounds(732, 331, 141, 23);
		contentPane.add(rdBtnCpu2);
		
		JPanel panel = new JPanel();
		panel.setBounds(18, 26, 440, 325);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JToggleButton btn12 = new JToggleButton("");
		panel.add(btn12);
		
		JToggleButton btn13 = new JToggleButton("");
		panel.add(btn13);
		
		JToggleButton btn22 = new JToggleButton("");
		panel.add(btn22);
		
		JToggleButton btn23 = new JToggleButton("");
		panel.add(btn23);
		
		JToggleButton btn21 =new JToggleButton("");
		panel.add(btn21);
		
		final JToggleButton btn11 = new JToggleButton("");
		panel.add(btn11);
		
		JToggleButton btn31 = new JToggleButton("");
		panel.add(btn31);
		
		JToggleButton btn33  =new JToggleButton("");
		panel.add(btn33);
		
		JToggleButton btn32 = new JToggleButton("");
		panel.add(btn32);
		
		
		
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
