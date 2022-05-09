package com.TEAM4_C4.TIC_TAC_TOE;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalToggleButtonUI;
import javax.swing.ImageIcon;
import java.awt.Font;

public class JuegoCPU extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	
	//lo pasamos a un array que nos servirá para acceder desde la cpu
	//ademas lo pasamos astatic para que se use desde los metodos
	static JToggleButton btn[] = new JToggleButton[9];
	static JLabel infoTurno = new JLabel("Turno: 1");
	
	public JuegoCPU() {

		setTitle("Los treses en la línea [Team 4]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 600, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		
		JLabel labelNombre1 = new JLabel("");
		JLabel labelNombre2 = new JLabel("");
		
		btn[0] = new JToggleButton(" ");
		btn[1] = new JToggleButton(" ");
		btn[2] = new JToggleButton(" ");
		btn[3] = new JToggleButton(" ");
		btn[4] = new JToggleButton(" ");
		btn[5] = new JToggleButton(" ");
		btn[6] = new JToggleButton(" ");
		btn[7] = new JToggleButton(" ");
		btn[8] = new JToggleButton(" ");

		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		labelNombre1.setFont(new Font("Palatino", Font.BOLD, 13));

		labelNombre1.setBounds(485, 117, 314, 16);
		contentPane.add(labelNombre1);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(18, 16, 440, 335);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		//se podría hacer en un array
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		btn[0].setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		btn[0].setBackground(Color.BLACK);
		panel.add(btn[0]);
		
		btn[1].setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		btn[1].setBackground(Color.BLACK);
		panel.add(btn[1]);
		
		btn[2].setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		btn[2].setBackground(Color.BLACK);
		panel.add(btn[2]);
		
		btn[3].setForeground(Color.BLACK);
		btn[3].setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		btn[3].setBackground(Color.BLACK);
		panel.add(btn[3]);
		
		btn[4].setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		btn[4].setBackground(Color.BLACK);
		panel.add(btn[4]);
		
		btn[5].setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		btn[5].setBackground(Color.BLACK);
		panel.add(btn[5]);
		
		btn[6].setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		btn[6].setBackground(Color.BLACK);
		panel.add(btn[6]);
		
		btn[7].setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		btn[7].setBackground(Color.BLACK);
		panel.add(btn[7]);
		
		btn[8].setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		btn[8].setBackground(Color.BLACK);
		panel.add(btn[8]);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(470, 49, 3, 223);
		contentPane.add(panel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Juego.class.getResource("/com/TEAM4_C4/TIC_TAC_TOE/img/fondo.png")));
		lblNewLabel.setBounds(0, -22, 471, 394);
		contentPane.add(lblNewLabel);

		JButton btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.setBackground(new Color(255, 255, 255));
		btnNuevaPartida.setBounds(543, 4, 181, 36);
		contentPane.add(btnNuevaPartida);
		btnNuevaPartida.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNuevaPartida.setForeground(new Color(0, 0, 0));
		infoTurno.setBounds(480, 290, 305, 16);
		contentPane.add(infoTurno);
		infoTurno.setFont(new Font("New Peninim MT", Font.BOLD, 15));

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Juego.class.getResource("/com/TEAM4_C4/TIC_TAC_TOE/img/fondo.png")));
		lblNewLabel_1.setBounds(464, 272, 334, 46);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon(Juego.class.getResource("/com/TEAM4_C4/TIC_TAC_TOE/img/fondo.png")));
		lblNewLabel_1_1.setBounds(470, 0, 328, 49);
		contentPane.add(lblNewLabel_1_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(470, 269, 330, 3);
		contentPane.add(panel_2);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(470, 318, 330, 3);
		contentPane.add(panel_2_1);

		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1_1.setBackground(Color.BLACK);
		panel_2_1_1.setBounds(470, 49, 330, 3);
		contentPane.add(panel_2_1_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(470, 318, 3, 54);
		contentPane.add(panel_1_1);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.BLACK);
		panel_1_2.setBounds(797, 0, 2, 372);
		contentPane.add(panel_1_2);

		JLabel lblPlayer = new JLabel("PLAYER 1");
		lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlayer.setBounds(485, 77, 128, 16);
		contentPane.add(lblPlayer);

		JLabel lblPlayer_2 = new JLabel("PLAYER 2");
		lblPlayer_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlayer_2.setBounds(485, 167, 128, 16);
		contentPane.add(lblPlayer_2);

		labelNombre2.setFont(new Font("Palatino", Font.BOLD, 13));
		labelNombre2.setBounds(485, 207, 314, 16);
		contentPane.add(labelNombre2);

		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1_2.setBackground(Color.BLACK);
		panel_2_1_2.setBounds(470, 369, 330, 3);
		contentPane.add(panel_2_1_2);

		//TODO poner todo a 0
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		boolean jugador = r.nextBoolean(); //inicializamos un bool static para el jugador
		
		//si es el turno de la máquina que inicie la jugada (al ser el jugador dos su turno es cuando el bool JUGADOR es false)
		if(!jugador) { //funciona
			comportamientoCpu();
		}

		//action listener jugada para todos los botones
		ActionListener jugada = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//el boton se pasa por parametro con el get source que devuelve el OBJETO que ha activado el evento, en nuestro caso ha sido el JToggleButton
				//como devuelve un OBJETO se tiene que CASTEAR a JToggleButton
				movimientoJugador((JToggleButton) e.getSource());
				
			}
		};
		
		//addActionListener a cada boton
		btn[0].addActionListener(jugada);
		btn[1].addActionListener(jugada);
		btn[2].addActionListener(jugada);
		btn[3].addActionListener(jugada);
		btn[4].addActionListener(jugada);
		btn[5].addActionListener(jugada);
		btn[6].addActionListener(jugada);
		btn[7].addActionListener(jugada);
		btn[8].addActionListener(jugada);
		
	}
	
	//este es el movimento del jugador que sucede desde su turno
	public static void movimientoJugador(JToggleButton btn) {
		//fase1 turno 1 al 3
		//if(numeroTurno <= 6) {
			//comprobamos si se puede colocar sePuedeColocar()
			if(sePuedeColocar(btn)) {
				//en caso que se pueda colocamos la ficha
				btn.setText("X");
				//pasamos a mirar si hemos ganado
				//pasamos turno
				comportamientoCpu();
			}else{	//en caso que no se pueda informamos al usuario
				JOptionPane.showMessageDialog(null, "No se puede colocar ahí");
			}
		//}else { //fase2 a partir del turno 3
			//se comprueba si es su ficha para mover
			
			//se mueve a un espacio vacío sePuedeColocar()
		//}
	}
	
	//metodo para ver si se puede colocar
	public static boolean sePuedeColocar(JToggleButton btn) {
		if(btn.getText() == " "){
			return true;
		}else {
			return false;
		}
	}
	
	//sobrecarga del metodo para que lo pueda usar la CPU
	public static boolean sePuedeColocar(int x) {
		if(btn[x].getText() == " "){
			return true;
		}else {
			return false;
		}
	}
	
	public static Random r = new Random(); //Random estatico para acceder desde los metodos
	public static int numeroTurno = 0;//inicializamos a 1 para contar con el turno del jugador

	public static void comportamientoCpu(){

		//de momento se pone random
			movimientoAleatorioCpu();

	}
	
	//este es la tactica inicial de la CPU, y el ultimo recurso si se atasca
	public static void movimientoAleatorioCpu() {
		int x;
		do {
		//genera un numero del 0 al 8
			x = r.nextInt(8);
		//si se puede colocar pasa el bucle
		}while(!sePuedeColocar(x));
		//se coloca
		btn[x].setText("O");
	}
	
	//TODO Implementar
	//moviento para decidir  intentar jugada o bloquear
	public static void decidirJugadaCpu() {
		//la cpu tiene como prioridad bloquear al jugador para eso se recorre el array y se mira cuantas fichas del jugador hay en tablero
		int numeroX = 0;
		for (int i = 0; i < btn.length; i++) {
			if(btn[i].getText() == "X") {
				numeroX++;
			}
		}
		//si resulta que hay mas de dos fichas del jugador se va a intentar bloquear
		if(numeroX >= 2) {
			bloquearAlJugador();
		}else { //TODO: Cambiar por intentar jugada
			movimientoAleatorioCpu();
		}
	}
	
	public static void bloquearAlJugador() {
		//se crea el array de posiciones
		int posiciones[] = new int[3];
		//se recorre el array de botones y se guardan las posiciones del JUGADOR
		for (int i = 0; i < btn.length; i++) {
			if(btn[i].getText() == "X") {
				for (int j = 0; j < 3; j++) {
					posiciones[j] = i+1; //se guardan las posiciones +1 para ahorrar tiempo calculando
				}
			}
		}
		//se calcula la posible victoria y se bloquea
		//analizamos is las fichas estan en posicion de posible victoria h1)123 v1)147 d)159
		if(posiciones[0] == 1 && (posiciones[1] == 2 || posiciones[1] == 4 || posiciones[1] == 5)) {
			if(posiciones[1] == 2) {
				intentarBloquear(3-1);
				return;
			}
			if(posiciones[1] == 4) {
				intentarBloquear(7-1);
				return;
			}
			if(posiciones[1] == 5) {
				intentarBloquear(9-1);
				return;
			}
		}
		//h1)123 //vertical 2) 258
		if(posiciones[0] == 2 && (posiciones[1] == 5 || posiciones[1] == 1 || posiciones[1] == 3)) {
			if(posiciones[1] == 5) {
				intentarBloquear(8-1);
				return;
			}
			if(posiciones[1] == 1) {
				intentarBloquear(3-1);
				return;
			}
			if(posiciones[1] == 3) {
				intentarBloquear(1-1);
				return;
			}
		}
		
		//h1)123 vertical 3) 369
		if(posiciones[0] == 3 && (posiciones[1] == 6 || posiciones[1] == 5 || posiciones[1] == 2)) {
			if(posiciones[1] == 6) {
				intentarBloquear(9-1);
				return;
			}
			if(posiciones[1] == 5) {
				intentarBloquear(7-1);
				return;
			}
			if(posiciones[1] == 2) {
				intentarBloquear(1-1);
				return;
			}
		}
		
		//en caso negativo la cpu procede a intentar ganar
	}
	
	//procede a intentar bloquear la posicion indicada
	public static void intentarBloquear(int x) {
		if(sePuedeColocar(x)) {
			btn[x].setText("O");
		}else {//si no se puede recurre a una tactica diferente
			//TODO:cambiar por intentar jugada
			movimientoAleatorioCpu();
		}
	}

}
