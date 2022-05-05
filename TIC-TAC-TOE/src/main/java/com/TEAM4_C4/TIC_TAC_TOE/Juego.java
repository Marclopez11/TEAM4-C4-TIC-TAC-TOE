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
<<<<<<< HEAD
	private final ButtonGroup buttonGroupTipo1 = new ButtonGroup();
	 public static JLabel labelNombre1 = new JLabel("");
	 public static JLabel labelNombre2 = new JLabel("");

=======
	private final ButtonGroup buttonGroupTipo1 = new ButtonGroup(); 
	
	//este boolean determina quien empieza la partida:
	static boolean jugador = primerTurno();
	//creo una variable turno inicializada
	static int turno = 0;
	static final JLabel infoTurno = new JLabel("Es el turno de " + jugador);
	
>>>>>>> main
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
		
		//Iniciar tablero
		final char[][] tablero = new char[3][3];

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
		
		final JToggleButton btn33 = new JToggleButton("");
		panel.add(btn33);
		
		//LISTENERS
		btn11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO COMENTAR
				if(jugador) {
					btn11.setText("X");
					//implementar todas las funciones que se suceden durante el turno
					
					turno();
				}else{
					btn11.setText("O");
					turno();
				}
			}
		});
		btn12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					btn12.setText("X");
					turno();
				}else{
					btn12.setText("O");
					turno();
				}
			}
		});
		btn13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					btn13.setText("X");
					turno();
				}else{
					btn13.setText("O");
					turno();
				}
			}
		});
		btn21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					btn21.setText("X");
					turno();
				}else{
					btn21.setText("O");
					turno();
				}
			}
		});
		btn22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					btn22.setText("X");
					turno();
				}else{
					btn22.setText("O");
					turno();
				}
			}
		});
		btn23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					btn23.setText("X");
					turno();
				}else{
					btn23.setText("O");
					turno();
				}
			}
		});
		btn31.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					btn31.setText("X");
					turno();
				}else{
					btn31.setText("O");
					turno();
				}
			}
		});
		btn32.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					btn32.setText("X");
					turno();
				}else{
					btn32.setText("O");
					turno();
				}
			}
		});
		btn33.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jugador) {
					btn33.setText("X");
					turno();
				}else{
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
	
	//FASE 1 colocar las piezas [@eloi]
	
	//comprobar casilla (si se puede poner, que esté libre)
	
	//coloca
	
	//mensaje no se puede colocar
	
	//END FASE 1
	
	//FASE 2  seleccionar una ficha, y moverla <- AL TURNO 6 
	
	//END FASE 2
	
	
	
	
}
