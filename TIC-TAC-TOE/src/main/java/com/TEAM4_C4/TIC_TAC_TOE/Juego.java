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
	private final ButtonGroup buttonGroupTipo1 = new ButtonGroup();
	
	//Iniciar tablero
	static char[][] tablero = { {'X','-','-'}, 
								{'X', '-','-'}, 
								{'X','-','-'}};

	
	// Constantes de Victoria:
	
	final static int[][] VICTORIAVERTICAL1 = {{1, 0, 0}, {1, 0, 0}, {1, 0, 0}};
	/*
	 *  [1] [ ] [ ]
	 *  [1] [ ] [ ]
	 *  [1] [ ] [ ]
	 */
	
	final static int[][] VICTORIAVERTICAL2 = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
	/*
	 *  [ ] [1] [ ]
	 *  [ ] [1] [ ]
	 *  [ ] [1] [ ]
	 */
	
	final static int[][] VICTORIAVERTICAL3 = {{0, 0, 1}, {0, 0, 1}, {0, 0, 1}};
	/*
	 *  [ ] [ ] [1]
	 *  [ ] [ ] [1]
	 *  [ ] [ ] [1]
	 */
	
	final static int[][] VICTORIAHORIZONTAL1 = {{1, 1, 1}, {0, 0, 0}, {0, 0, 0}};
	/*
	 *  [1] [1] [1]
	 *  [ ] [ ] [ ]
	 *  [ ] [ ] [ ]
	 */
	
	final static int[][] VICTORIAHORIZONTAL2 = {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
	/* 
	 *  [ ] [ ] [ ]
	 *  [1] [1] [1]
	 *  [ ] [ ] [ ]
	 */

	final static int[][] VICTORIAHORIZONTAL3 = {{0, 0, 0}, {0, 0, 0}, {1, 1, 1}};
	/* 
	 *  [ ] [ ] [ ]
	 *  [ ] [ ] [ ]
	 *  [1] [1] [1]
	 */
	
	final static int[][] VICTORIADIAGONAL1 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
	/* 
	 *  [1] [ ] [ ]
	 *  [ ] [1] [ ]
	 *  [ ] [ ] [1]
	 */
	
	final static int[][] VICTORIADIAGONAL2 = {{0, 0, 1}, {0, 1, 0}, {1, 0, 0}};
	/* 
	 *  [ ] [ ] [1]
	 *  [ ] [1] [ ]
	 *  [1] [ ] [ ]
	 */
	
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
		


		JButton btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.setBounds(636, 16, 117, 29);
		contentPane.add(btnNuevaPartida);
		
		JLabel infoTurno = new JLabel("Es el turno de " + "[NombreJugador]");
		infoTurno.setBounds(489, 54, 138, 16);
		contentPane.add(infoTurno);
		
		JLabel labelNombreJugador1 = new JLabel("New label");
		labelNombreJugador1.setBounds(489, 98, 61, 16);
		contentPane.add(labelNombreJugador1);
		
		JLabel labelNombre1 = new JLabel("New label");
		labelNombre1.setBounds(499, 137, 61, 16);
		contentPane.add(labelNombre1);
		
		JLabel labelNombreJugador2 = new JLabel("New label");
		labelNombreJugador2.setBounds(499, 250, 61, 16);
		contentPane.add(labelNombreJugador2);
		
		JLabel labelNombre2 = new JLabel("New label");
		labelNombre2.setBounds(509, 278, 61, 16);
		contentPane.add(labelNombre2);
		
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
		
		comprobarVictoria(true);
		
		
		
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
	
	//comprobar valor en el campo de texto, que no sea "" [@MARC]
	//recoger valores del texto y llevarlos a la otra pantalla
	//reniciar: nos lleva a la pestaña App y pone tablero de 0 [@MARC]
	
	
	//turno [@Eloi]
	//random quien empieza (random boolean)
	
	//una vez colocada se comprueba el tablero <- se gana o se sigue (mirar 9 comprobaciones) [@Borja]
	
	/* Array de 3x3
	 *  [ ] [ ] [ ]
	 *  [ ] [ ] [ ]
	 *  [ ] [ ] [ ]
	 */
	
	public void comprobarVictoria(boolean jugador) {
		// mientras no tengamos ganador, comprobaremos todas la combinaciones ganadoras:
		boolean tenemosGanador = false;
		
		// comprobaremos el array con cada una de las combinaciones ganadoras
		
		//X o O
		if(jugador) {
			//turno X 
			if(tablero[0][0] == 'X' && tablero[1][0] == 'X' && tablero[2][0] == 'X') {
				
				//static char[][] tablero = new char[3][3];
				//final static int[][] VICTORIAVERTICAL1 = {{1, 0, 0}, {1, 0, 0}, {1, 0, 0}};
				/*	  0   1   2
				 * 0 [1] [ ] [ ]
				 * 1 [1] [ ] [ ]
				 * 2 [1] [ ] [ ]
				 */
				System.out.println("win");
			}
			
		}else {
			//turno O
			
		}
			  
		}
	
	//FASE 1 colocar las piezas [@eloi]
	
	//comprobar casilla (si se puede poner, que esté libre)
	
	//coloca
	
	//mensaje no se puede colocar
	
	//END FASE 1
	
	//FASE 2  seleccionar una ficha, y moverla <- AL TURNO 6 
	
	//END FASE 2
	
	
	
	
}
