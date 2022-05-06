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
import java.util.Random;

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
	static char[][] tablero = { {' ',' ',' '}, 
								{' ',' ',' '}, 
								{' ',' ',' '}};

	 public static JLabel labelNombre1 = new JLabel("");
	 public static JLabel labelNombre2 = new JLabel("");
	
	//este boolean determina quien empieza la partida:
	static boolean jugador = primerTurno();
	//creo una variable turno inicializada
	static int turno = 0;
	static boolean octirada = false;
	static final JLabel infoTurno = new JLabel("Es el turno de " + jugador);
	

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
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				limpiarTablero(tablero);
				App abrir = new App();
				abrir.setVisible(true);
			}
		});
		btnNuevaPartida.setBounds(636, 16, 117, 29);
		contentPane.add(btnNuevaPartida);
		
		
		infoTurno.setBounds(489, 54, 138, 16);
		contentPane.add(infoTurno);
		
		
		
		labelNombre1.setBounds(499, 137, 61, 16);
		contentPane.add(labelNombre1);
	
		
		labelNombre2.setBounds(509, 278, 183, 16);
		contentPane.add(labelNombre2);
		
		JPanel panel = new JPanel();
		panel.setBounds(18, 26, 440, 325);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		final JToggleButton btn11 = new JToggleButton("");
		panel.add(btn11);
		
		final JToggleButton btn12 = new JToggleButton("");
		panel.add(btn12);
		
		final JToggleButton btn13 = new JToggleButton("");
		panel.add(btn13);
		
		final JToggleButton btn21 = new JToggleButton("");
		panel.add(btn21);
		
		final JToggleButton btn22 =new JToggleButton("");
		panel.add(btn22);
		
		final JToggleButton btn23 = new JToggleButton("");
		panel.add(btn23);
		
		final JToggleButton btn31 = new JToggleButton("");
		panel.add(btn31);
		
		final JToggleButton btn32  =new JToggleButton("");
		panel.add(btn32);
		
		comprobarVictoria(true);
		
		final JToggleButton btn33 = new JToggleButton("");
		panel.add(btn33);
		
		//LISTENERS
		btn11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO COMENTAR
				if(jugador) {
					//if !ocupada
					while(!octirada) {
						if(btn11.getText().equals("O") || btn11.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								btn11.setText("X");
								
							}
					}
					
					//implementar todas las funciones que se suceden durante el turno
					//meter char en posicion array [@borja]
					turno();
					tablero[0][0] = 'X';
					//else mensaje no se puede colocar
					
				}else{
					while(!octirada) {
						if(btn11.getText().equals("O") || btn11.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn11.setText("O");
					//meter char en posicion array [@borja]
					tablero[0][0] = 'O';
					turno();
				}
			}
		});
		btn12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					while(!octirada) {
						if(btn12.getText().equals("O") || btn12.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn12.setText("X");
					turno();
					//else mensaje no se puede colocar
				}else{
					while(!octirada) {
						if(btn12.getText().equals("O") || btn12.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn12.setText("O");
					turno();
				}
			}
		});
		btn13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					while(!octirada) {
						if(btn13.getText().equals("O") || btn13.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn13.setText("X");
					turno();
				}else{
					while(!octirada) {
						if(btn13.getText().equals("O") || btn13.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn13.setText("O");
					turno();
				}
			}
		});
		btn21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					while(!octirada) {
						if(btn21.getText().equals("O") || btn21.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn21.setText("X");
					turno();
				}else{
					while(!octirada) {
						if(btn21.getText().equals("O") || btn21.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn21.setText("O");
					turno();
				}
			}
		});
		btn22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					while(!octirada) {
						if(btn22.getText().equals("O") || btn22.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn22.setText("X");
					turno();
				}else{
					while(!octirada) {
						if(btn22.getText().equals("O") || btn22.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn22.setText("O");
					turno();
				}
			}
		});
		btn23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					while(!octirada) {
						if(btn23.getText().equals("O") || btn23.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn23.setText("X");
					turno();
				}else{
					while(!octirada) {
						if(btn23.getText().equals("O") || btn23.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn23.setText("O");
					turno();
				}
			}
		});
		btn31.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					while(!octirada) {
						if(btn31.getText().equals("O") || btn31.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn31.setText("X");
					turno();
				}else{
					while(!octirada) {
						if(btn31.getText().equals("O") || btn31.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn31.setText("O");
					turno();
				}
			}
		});
		btn32.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					while(!octirada) {
						if(btn32.getText().equals("O") || btn32.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					
					btn32.setText("X");
					
					turno();
				}else{
					while(!octirada) {
						if(btn32.getText().equals("O") || btn32.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn32.setText("O");
					turno();
				}
			}
		});
		btn33.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					while(!octirada) {
						if(btn33.getText().equals("O") || btn33.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn33.setText("X");
					turno();
				}else{
					while(!octirada) {
						if(btn33.getText().equals("O") || btn33.getText().equals("X")){
							
							infoTurno.setText("Casilla Ocupada, marca otra casilla");
							
							}else {
								octirada = true;
								
							}
					}
					btn33.setText("O");
					turno();
				}
			}
		});
		
		
		
		
	}
	
	//Establece el tablero en espacios vacíos
    static void limpiarTablero(char[][] tablero) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                tablero[y][x] = ' ';
            }
        }
    }
	
	//comprobar valor en el campo de texto, que no sea "" [@MARC]
	//recoger valores del texto y llevarlos a la otra pantalla
	//reniciar: nos lleva a la pestaña App y pone tablero de 0 [@MARC]
	
	
	//turno [@Eloi]
	//random quien empieza (random boolean)
	static boolean primerTurno() {
		
		Random r = new Random();
		return r.nextBoolean();
		
	}
	
	void turno() {
		//la primera vez se decide por boolean random, true = primer jugador, false segundo jugador
		
		if(jugador) {
			
			//implementar todas las funciones que se suceden durante el turno
			
			//se suma el turno
			turno++;
			//se cambia el valor del jugador para que le toque al siguiente
			jugador = false;
			infoTurno.setText("Es el turno de " + jugador);
			
		}else {
			
			//implementar todas las funciones que se suceden durante el turno
			//se suma un turno
			turno++;
			//se cambia el valor del jugador para que le toque al siguiente
			jugador = true;
			infoTurno.setText("Es el turno de " + jugador);
		}
		
	}
	
	//una vez colocada se comprueba el tablero <- se gana o se sigue (mirar 9 comprobaciones) [@Borja]
	
	/* Array de 3x3
	 *  [ ] [ ] [ ]
	 *  [ ] [ ] [ ]
	 *  [ ] [ ] [ ]
	 */
	
	public void comprobarVictoria(boolean jugador) {
		// mientras no tengamos ganador, comprobaremos todas la combinaciones ganadoras:
		boolean ganaX = false;
		boolean ganaO = false;
		// ganaX = true;
		// ganaO = true;
		
		// comprobaremos el array con cada una de las combinaciones ganadoras
		
		//X o O
		if(jugador) {
			//turno X
			if(tablero[0][0] == 'X' && tablero[1][0] == 'X' && tablero[2][0] == 'X') {
				
				/*	  0   1   2
				 * 0 [1] [ ] [ ]
				 * 1 [1] [ ] [ ]
				 * 2 [1] [ ] [ ]
				 */
				ganaX = true;
				
			}
			if(tablero[0][1] == 'X' && tablero[1][1] == 'X' && tablero[2][1] == 'X') {
				/*	  0   1   2
				 * 0 [ ] [1] [ ]
				 * 1 [ ] [1] [ ]
				 * 2 [ ] [1] [ ]
				 */
				ganaX = true;
			}
			if(tablero[0][2] == 'X' && tablero[1][2] == 'X' && tablero[2][2] == 'X') {
				/*	  0   1   2
				 * 0 [ ] [ ] [1]
				 * 1 [ ] [ ] [1]
				 * 2 [ ] [ ] [1]
				 */
				ganaX = true;
			}
			if(tablero[0][0] == 'X' && tablero[0][1] == 'X' && tablero[0][2] == 'X') {
				/*	  0   1   2
				 * 0 [1] [1] [1]
				 * 1 [ ] [ ] [ ]
				 * 2 [ ] [ ] [ ]
				 */
				ganaX = true;
			}
			if(tablero[0][0] == 'X' && tablero[0][1] == 'X' && tablero[0][2] == 'X') {
				/*	  0   1   2
				 * 0 [1] [1] [1]
				 * 1 [ ] [ ] [ ]
				 * 2 [ ] [ ] [ ]
				 */
				ganaX = true;
			}
			if(tablero[1][0] == 'X' && tablero[1][1] == 'X' && tablero[1][2] == 'X') {
				/*	  0   1   2
				 * 0 [ ] [ ] [ ]
				 * 1 [1] [1] [1]
				 * 2 [ ] [ ] [ ]
				 */
				ganaX = true;
			}
			if(tablero[2][0] == 'X' && tablero[2][1] == 'X' && tablero[2][2] == 'X') {
				/*	  0   1   2
				 * 0 [ ] [ ] [ ]
				 * 1 [ ] [ ] [ ]
				 * 2 [1] [1] [1]
				 */
				ganaX = true;
			}
			
			// diagonal1
			if(tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X') {
				/*	  0   1   2
				 * 0 [1] [ ] [ ]
				 * 1 [ ] [1] [ ]
				 * 2 [ ] [ ] [1]
				 */
				ganaX = true;
			}
			
			// diagonal2
			if(tablero[0][2] == 'X' && tablero[1][1] == 'X' && tablero[2][0] == 'X') {
				/*	  0   1   2
				 * 0 [ ] [ ] [1]
				 * 1 [ ] [1] [ ]
				 * 2 [1] [ ] [ ]
				 */
				ganaX = true;
			}
			
			if (ganaX == true) infoTurno.setText("El equipo X ha ganado");
			
		}else {
			//turno O
			if(tablero[0][0] == 'O' && tablero[1][0] == 'O' && tablero[2][0] == 'O') {
				/*	  0   1   2
				 * 0 [1] [ ] [ ]
				 * 1 [1] [ ] [ ]
				 * 2 [1] [ ] [ ]
				 */
				ganaO = true;
			}
			if(tablero[0][1] == 'O' && tablero[1][1] == 'O' && tablero[2][1] == 'O') {
				/*	  0   1   2
				 * 0 [ ] [1] [ ]
				 * 1 [ ] [1] [ ]
				 * 2 [ ] [1] [ ]
				 */
				ganaO = true;
			}
			if(tablero[0][2] == 'O' && tablero[1][2] == 'O' && tablero[2][2] == 'O') {
				/*	  0   1   2
				 * 0 [ ] [ ] [1]
				 * 1 [ ] [ ] [1]
				 * 2 [ ] [ ] [1]
				 */
				ganaO = true;
			}
			if(tablero[0][0] == 'O' && tablero[0][1] == 'O' && tablero[0][2] == 'O') {
				/*	  0   1   2
				 * 0 [1] [1] [1]
				 * 1 [ ] [ ] [ ]
				 * 2 [ ] [ ] [ ]
				 */
				ganaO = true;
			}
			if(tablero[0][0] == 'O' && tablero[0][1] == 'O' && tablero[0][2] == 'O') {
				/*	  0   1   2
				 * 0 [1] [1] [1]
				 * 1 [ ] [ ] [ ]
				 * 2 [ ] [ ] [ ]
				 */
				ganaO = true;
			}
			if(tablero[1][0] == 'O' && tablero[1][1] == 'O' && tablero[1][2] == 'O') {
				/*	  0   1   2
				 * 0 [ ] [ ] [ ]
				 * 1 [1] [1] [1]
				 * 2 [ ] [ ] [ ]
				 */
				ganaO = true;
			}
			if(tablero[2][0] == 'O' && tablero[2][1] == 'O' && tablero[2][2] == 'O') {
				/*	  0   1   2
				 * 0 [ ] [ ] [ ]
				 * 1 [ ] [ ] [ ]
				 * 2 [1] [1] [1]
				 */
				ganaO = true;
			}
			
			// diagonal1
			if(tablero[0][0] == 'O' && tablero[1][1] == 'O' && tablero[2][2] == 'O') {
				/*	  0   1   2
				 * 0 [1] [ ] [ ]
				 * 1 [ ] [1] [ ]
				 * 2 [ ] [ ] [1]
				 */
				ganaO = true;
			}
			
			// diagonal2
			if(tablero[0][2] == 'O' && tablero[1][1] == 'O' && tablero[2][0] == 'O') {
				/*	  0   1   2
				 * 0 [ ] [ ] [1]
				 * 1 [ ] [1] [ ]
				 * 2 [1] [ ] [ ]
				 */
				ganaO = true;
			}
			
			if (ganaO == true) infoTurno.setText("El equipo O ha ganado");
			
		}
			  
		}
	
	//FASE 1 colocar las piezas [@eloi]
	
	//comprobar casilla (si se puede poner, que esté libre)
	//metodo boolean ocupada() [@Marc]
	
	//mensaje no se puede colocar
	
	//END FASE 1
	
	//FASE 2  seleccionar una ficha, y moverla <- AL TURNO 6 [@Eloi]
	
	// comprobar ficha si estuya
	//este método comprueba unicamente si la ficha es tuya
	boolean moverFicha(String value) {
		//miramos a que jugador le pertenece
		if(jugador) {
			if(value.equals('X')) {
				return true;
			}else {	
				return false;	
			}
		}else {
			if(value.equals('O')) {
				return true;
			}else {	
				return false;	
			}
		}

	}
	
	//END FASE 2
	
	
	
	
}
