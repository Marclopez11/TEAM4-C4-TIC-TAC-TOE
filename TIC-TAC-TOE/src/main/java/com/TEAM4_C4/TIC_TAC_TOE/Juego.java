package com.TEAM4_C4.TIC_TAC_TOE;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalToggleButtonUI;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Juego extends JFrame {

	private JPanel contentPane;

	// Iniciar tablero
	static char[][] tablero = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

	public static JLabel labelNombre1 = new JLabel("");
	public static JLabel labelNombre2 = new JLabel("");
	JToggleButton btn11 = new JToggleButton(" ");
	JToggleButton btn12 = new JToggleButton(" ");
	JToggleButton btn13 = new JToggleButton(" ");
	JToggleButton btn21 = new JToggleButton(" ");
	JToggleButton btn22 = new JToggleButton(" ");
	JToggleButton btn23 = new JToggleButton(" ");
	JToggleButton btn31 = new JToggleButton(" ");
	JToggleButton btn32 = new JToggleButton(" ");
	JToggleButton btn33 = new JToggleButton(" ");
	 


	// este boolean determina quien empieza la partida:
	static boolean jugador = primerTurno();
	// creo una variable turno inicializada
	static int turno = 0;
	static boolean octirada = false;
	static final JLabel infoTurno = new JLabel("Es el turno de " + jugador);
	public  static 	Juego juego = new Juego();
	
	//esta variable nos indica una vez llegada la fase 2, si el usuario ya ha quitado una ficha que quiere mover
	public static boolean haCambiado = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Juego frame = new Juego();
					juego.setVisible(true);
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
		setTitle("Los treses en la línea [Team 4]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 600, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));

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

		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));

		panel.add(btn11);
		panel.add(btn12);
		panel.add(btn13);
		panel.add(btn21);
		panel.add(btn22);
		panel.add(btn23);
		panel.add(btn31);
		panel.add(btn32);
		panel.add(btn33);

		/* Añadimos todos los botones en una lista para recorrerla dinamicamente */
		final List<JToggleButton> listButton = new ArrayList<JToggleButton>();
		listButton.add(btn11);
		listButton.add(btn12);
		listButton.add(btn13);
		listButton.add(btn21);
		listButton.add(btn22);
		listButton.add(btn23);
		listButton.add(btn31);
		listButton.add(btn32);
		listButton.add(btn33);

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

		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				limpiarTablero(tablero);
				juego.setVisible(false);
				App abrir = new App();
				abrir.setVisible(true);
				// Resetamos el turno a 0
				turno = 0;
				// El jugador1 volverá a ser la X
				jugador = true;

			}
		});

		// LISTENERS
		btn11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// DONE COMENTAR
				if (jugador) {
					if (turno <= 5) { // Si el turno es menor o igual a 5 estara haciendo la fase 1
						fase1(btn11, "X", 0, 0);
					} else {
						if (!haCambiado) { // si no a cambiado la pieza ejecuta para cambiala
							fase2(btn11, "X", 0, 0);
						} else { // si a a cambiado selecciona para cambiarla
							fase21(btn11, "X", 0, 0);
						}

					}
					if (turno > 4) {
						// Comprobamos victoria para jugador X
						if (comprobarVictoria('X')) {

							printarVictoria(listButton, "X");
						}

					}
				} else {
					if (turno <= 5) { // Si el turno es menor o igual a 5 estara haciendo la fase 1
						fase1(btn11, "O", 0, 0);
					} else {
						if (!haCambiado) { // si no a cambiado la pieza ejecuta para cambiala
							fase2(btn11, "O", 0, 0);
						} else { // si a a cambiado selecciona para cambiarla
							fase21(btn11, "O", 0, 0);
						}
					}
					if (turno > 4) {
						if (comprobarVictoria('O')) { // Comprobamos O
							printarVictoria(listButton, "O");
						}
					}
				}
			}
		});
		btn12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jugador) {
					if (turno <= 5) {
						fase1(btn12, "X", 0, 1);
					} else {
						if (!haCambiado) {
							fase2(btn12, "X", 0, 1);
						} else {
							fase21(btn12, "X", 0, 1);
						}
					}
					if (turno > 4) {
						// Comprobamos victoria para jugador X
						if (comprobarVictoria('X')) {

							printarVictoria(listButton, "X");
						}
					}
				} else {
					if (turno <= 5) {
						fase1(btn12, "O", 0, 1);
					} else {
						if (!haCambiado) {
							fase2(btn12, "O", 0, 1);
						} else {
							fase21(btn12, "O", 0, 1);
						}
					}
					if (turno > 4) {
						if (comprobarVictoria('O')) { // Comprobamos O
							printarVictoria(listButton, "O");
						}
					}
				}
			}
		});
		btn13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jugador) {
					if (turno <= 5) {
						fase1(btn13, "X", 0, 2);
					} else {
						if (!haCambiado) {
							fase2(btn13, "X", 0, 2);
						} else {
							fase21(btn13, "X", 0, 2);
						}
					}
					if (turno > 4) {
						// Comprobamos victoria para jugador X
						if (comprobarVictoria('X')) {

							printarVictoria(listButton, "X");
						}
					}
				} else {
					if (turno <= 5) {
						fase1(btn13, "O", 0, 2);
					} else {
						if (!haCambiado) {
							fase2(btn13, "O", 0, 2);
						} else {
							fase21(btn13, "O", 0, 2);
						}
					}
					if (turno > 4) {
						if (comprobarVictoria('O')) { // Comprobamos O
							printarVictoria(listButton, "O");
						}
					}
				}
			}
		});
		btn21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jugador) {
					if (turno <= 5) {
						fase1(btn21, "X", 1, 0);
					} else {
						if (!haCambiado) {
							fase2(btn21, "X", 1, 0);
						} else {
							fase21(btn21, "X", 1, 0);
						}
					}
					if (turno > 4) {
						// Comprobamos victoria para jugador X
						if (comprobarVictoria('X')) {

							printarVictoria(listButton, "X");
						}
					}
				} else {
					if (turno <= 5) {
						fase1(btn21, "O", 1, 0);
					} else {
						if (!haCambiado) {
							fase2(btn21, "O", 1, 0);
						} else {
							fase21(btn21, "O", 1, 0);
						}
					}
					if (turno > 4) {
						if (comprobarVictoria('O')) { // Comprobamos O
							printarVictoria(listButton, "O");
						}
					}
				}
			}
		});
		btn22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jugador) {
					if (turno <= 5) {
						fase1(btn22, "X", 1, 1);
					} else {
						if (!haCambiado) {
							fase2(btn22, "X", 1, 1);
						} else {
							fase21(btn22, "X", 1, 1);
						}
					}
					if (turno > 4) {
						// Comprobamos victoria para jugador X
						if (comprobarVictoria('X')) {

							printarVictoria(listButton, "X");
						}
					}
				} else {
					if (turno <= 5) {
						fase1(btn22, "O", 1, 1);
					} else {
						if (!haCambiado) {
							fase2(btn22, "O", 1, 1);
						} else {
							fase21(btn22, "O", 1, 1);
						}
					}
					if (turno > 4) {
						if (comprobarVictoria('O')) { // Comprobamos O
							printarVictoria(listButton, "O");
						}

					}
				}
			}
		});
		btn23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jugador) {
					if (turno <= 5) {
						fase1(btn23, "X", 1, 2);
					} else {
						if (!haCambiado) {
							fase2(btn23, "X", 1, 2);
						} else {
							fase21(btn23, "X", 1, 2);
						}
					}
					if (turno > 4) {
						// Comprobamos victoria para jugador X
						if (comprobarVictoria('X')) {

							printarVictoria(listButton, "X");
						}

					}
				} else {
					if (turno <= 5) {
						fase1(btn23, "O", 1, 2);
					} else {
						if (!haCambiado) {
							fase2(btn23, "O", 1, 2);
						} else {
							fase21(btn23, "O", 1, 2);
						}
					}
					if (turno > 4) {

						if (comprobarVictoria('O')) { // Comprobamos O
							printarVictoria(listButton, "O");
						}
					}
				}
			}
		});
		btn31.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jugador) {
					if (turno <= 5) {
						fase1(btn31, "X", 2, 0);
					} else {
						if (!haCambiado) {
							fase2(btn31, "X", 2, 0);
						} else {
							fase21(btn31, "X", 2, 0);
						}
					}
					if (turno > 4) {
						// Comprobamos victoria para jugador X
						if (comprobarVictoria('X')) {

							printarVictoria(listButton, "X");
						}
					}
				} else {
					if (turno <= 5) {
						fase1(btn31, "O", 2, 0);
					} else {
						if (!haCambiado) {
							fase2(btn31, "O", 2, 0);
						} else {
							fase21(btn31, "O", 2, 0);
						}

					}
					// Comprobamos que del turno 5 en adelante puede darse condicion de victoria
					if (turno > 4) {
						if (comprobarVictoria('O')) { // Comprobamos O
							printarVictoria(listButton, "O");
						}

					}
				}
			}
		});
		btn32.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jugador) {
					if (turno <= 5) {
						fase1(btn32, "X", 2, 1);
					} else {
						if (!haCambiado) {
							fase2(btn32, "X", 2, 1);
						} else {
							fase21(btn32, "X", 2, 1);
						}
					}
					if (turno > 4) {
						// Comprobamos victoria para jugador X
						if (comprobarVictoria('X')) {

							printarVictoria(listButton, "X");
						}
					}
				} else {
					if (turno <= 5) {

						fase1(btn32, "O", 2, 1);
					} else {
						if (!haCambiado) {
							fase2(btn32, "O", 2, 1);
						} else {
							fase21(btn32, "O", 2, 1);
						}
					}
					if (turno > 4) {
						if (comprobarVictoria('O')) { // Comprobamos O
							printarVictoria(listButton, "O");
						}

					}
				}
			}
		});
		btn33.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jugador) {
					if (turno <= 5) {
						fase1(btn33, "X", 2, 2);
					} else {
						if (!haCambiado) {
							fase2(btn33, "X", 2, 2);
						} else {
							fase21(btn33, "X", 2, 2);
						}
					}
					if (turno > 4) {
						// Comprobamos victoria para jugador X
						if (comprobarVictoria('X')) {

							printarVictoria(listButton, "X");
						}
					}
				} else {
					if (turno <= 5) {
						fase1(btn33, "O", 2, 2);
					} else {
						if (!haCambiado) {
							fase2(btn33, "O", 2, 2);
						} else {
							fase21(btn33, "O", 2, 2);
						}
					}
					if (turno > 4) {
						if (comprobarVictoria('O')) { // Comprobamos O
							printarVictoria(listButton, "O");
						}

					}
				}
			}
		});
	}
	// Establece el tablero en espacios vacíos
	static void limpiarTablero(char[][] tablero) {
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				tablero[y][x] = ' ';
			}
		}
	}

	// random quien empieza (random boolean)
	static boolean primerTurno() {
		Random r = new Random();
		return r.nextBoolean();

	}
	
	static void mostrarArray() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}
		System.out.println("Turno: " + turno);
	}

	static void turno() {
		
		mostrarArray();
		
		// la primera vez se decide por boolean random, true = primer jugador, false
		// segundo jugador

		  
		if (jugador) {
			// implementar todas las funciones que se suceden durante el turno
			// se suma el turno
			turno++;
			// se cambia el valor del jugador para que le toque al siguiente
			jugador = false;
			infoTurno.setText("Es el turno de " + jugador);

		} else {
			// implementar todas las funciones que se suceden durante el turno
			// se suma un turno
			turno++;
			// se cambia el valor del jugador para que le toque al siguiente
			jugador = true;
			infoTurno.setText("Es el turno de " + jugador);
		}
		
		if(turno >5) {
			infoTurno.setText("Tienes que quitar una casilla tuya");

		}

	}
	
	//una vez colocada se comprueba el tablero <- se gana o se sigue (mirar 9 comprobaciones) [@Borja]
	
	/* Array de 3x3
	 *  [ ] [ ] [ ]
	 *  [ ] [ ] [ ]
	 *  [ ] [ ] [ ]
	 */
	
	public boolean comprobarVictoria( char XoO) {
		// mientras no tengamos ganador, comprobaremos todas la combinaciones ganadoras:
		boolean victoria = false;
		// ganaX = true;
		// ganaO = true;
		
		// comprobaremos el array con cada una de las combinaciones ganadoras
		
		/*Comprobamos en el turno del jugador. si se cumple una de las combinaciones de victoria*/
		victoria = comprobarCondiciones(XoO);
			if (victoria) {
				infoTurno.setText("El jugador "  + XoO + "ha ganado");
			}

		return victoria;
	}

	public boolean comprobarCondiciones(char valorXoO) {
		boolean ganaX = false;
		if(tablero[0][0] == valorXoO && tablero[1][0] == valorXoO && tablero[2][0] == valorXoO) {
			
			/*	  0   1   2
			 * 0 [1] [ ] [ ]
			 * 1 [1] [ ] [ ]
			 * 2 [1] [ ] [ ]
			 */
			ganaX = true;
			
		}
		else if(tablero[0][1] == valorXoO && tablero[1][1] == valorXoO && tablero[2][1] == valorXoO) {
			/*	  0   1   2
			 * 0 [ ] [1] [ ]
			 * 1 [ ] [1] [ ]
			 * 2 [ ] [1] [ ]
			 */
			ganaX = true;
		}
		else if(tablero[0][2] == valorXoO && tablero[1][2] == valorXoO && tablero[2][2] == valorXoO) {
			/*	  0   1   2
			 * 0 [ ] [ ] [1]
			 * 1 [ ] [ ] [1]
			 * 2 [ ] [ ] [1]
			 */
			ganaX = true;
		}
		else if(tablero[0][0] == valorXoO && tablero[0][1] == valorXoO && tablero[0][2] == valorXoO) {
			/*	  0   1   2
			 * 0 [1] [1] [1]
			 * 1 [ ] [ ] [ ]
			 * 2 [ ] [ ] [ ]
			 */
			ganaX = true;
		}
		else if(tablero[1][0] == valorXoO && tablero[1][1] == valorXoO && tablero[1][2] == valorXoO) {
			/*	  0   1   2
			 * 0 [ ] [ ] [ ]
			 * 1 [1] [1] [1]
			 * 2 [ ] [ ] [ ]
			 */
			ganaX = true;
		}
		else if(tablero[2][0] == valorXoO && tablero[2][1] == valorXoO && tablero[2][2] == valorXoO) {
			/*	  0   1   2
			 * 0 [ ] [ ] [ ]
			 * 1 [ ] [ ] [ ]
			 * 2 [1] [1] [1]
			 */
			ganaX = true;
		}
		
		// diagonal1
		else if(tablero[0][0] == valorXoO && tablero[1][1] == valorXoO && tablero[2][2] == valorXoO) {
			/*	  0   1   2
			 * 0 [1] [ ] [ ]
			 * 1 [ ] [1] [ ]
			 * 2 [ ] [ ] [1]
			 */
			ganaX = true;
		}
		
		// diagonal2
		else if(tablero[0][2] == valorXoO && tablero[1][1] == valorXoO && tablero[2][0] == valorXoO) {
			/*	  0   1   2
			 * 0 [ ] [ ] [1]
			 * 1 [ ] [1] [ ]
			 * 2 [1] [ ] [ ]
			 */
			ganaX = true;
		}
		
		 return ganaX;
	}
	
		// FASE 2 seleccionar una ficha, y moverla <- AL TURNO 6 [@Eloi]

		// comprobar ficha si estuya
		// este método comprueba unicamente si la ficha es tuya
		boolean moverFicha(String value) {
			// miramos a que jugador le pertenece
			if (jugador) {
				if (value.equals('X')) {
					return true;
				} else {
					return false;
				}
			} else {
				if (value.equals('O')) {
					return true;
				} else {
					return false;
				}
			}

		}

		static void fase1(JToggleButton btn, String jugador, int y, int x) {

			if (turno <= 5 && (btn.getText().equals("O")) || (btn.getText().equals("X"))) { // SI ES TURNO 6 O LA
																							// CASILLA ESTA OCUPADA
				infoTurno.setText("Casilla Ocupada, marca otra casilla"); // INFORMA AL USUARIO
			} else { // SI NO ESTA OCUPADA y el turno es menor o igual a 6
				btn.setText(jugador); // TE METE UNA X
				turno(); // PASA TURNO
				tablero[y][x] = jugador.charAt(0); // LA METE EN TABLERO
			}

		}

		static void fase2(JToggleButton btn, String jugador, int y, int x) {

	
			
				if (btn.getText().equals(jugador) && !haCambiado) { // tenemos que mirar que la ficha se pueda
					infoTurno.setText("Selecciona una casilla vacia");
											// reemplazar y no se haya reemplazado otra antes
					btn.setText(" "); // "reseteamos" la casilla
					tablero[y][x] = ' ';

					// todavia estoy en mi turno

					// activamos el bool fase 2
					haCambiado = true;
				} else if ((btn.getText().equals("X") && jugador.equals("O"))
						|| (btn.getText().equals("O") && jugador.equals("X"))) { // Si el jugador es 0 y la casilla es X
																					// o al reves
					infoTurno.setText("Casilla no es tuya, marca otra casilla");
				} else {
					infoTurno.setText("Casilla esta vacia, marca otra casilla");
				}

			

		}

		static void fase21(JToggleButton btn, String jugador, int y, int x) {

			
			if (btn.getText().equals(" ") && haCambiado) { // FASE 2 PARTE 2 si selecciona un espacio

				// pintar la marca en esa casilla
				btn.setText(jugador); //!! me marca en el mismo boton
				// pintamos tambien el tablero
				tablero[y][x] = jugador.charAt(0);
				haCambiado = false;
				// pasar turno
				turno(); 

			} // else {
				// infoTurno.setText("Selecciona un espacio");
				// }

		}
		
		public void printarVictoria(List<JToggleButton> list, String XoO) {
			for (JToggleButton button : list) {
				if(button.getText().equals(XoO)) {
					button.setUI(new MetalToggleButtonUI() {
					    @Override
					    protected Color getSelectColor() {
					        return Color.GREEN;
					    }
					});
				}
				button.setEnabled(false);
				
			}
		}
	}
