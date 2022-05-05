package com.TEAM4_C4.TIC_TAC_TOE;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class App extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup numeroJugadores = new ButtonGroup();
	private JTextField tfNombreJ1;
	private JTextField tfNombreJ2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		final JRadioButton rdbtn1 = new JRadioButton("1 Jugador");
		rdbtn1.setSelected(true);
		numeroJugadores.add(rdbtn1);
		rdbtn1.setBounds(89, 84, 109, 23);
		contentPane.add(rdbtn1);

		final JRadioButton rdbtn2 = new JRadioButton("2 Jugadores");
		numeroJugadores.add(rdbtn2);
		rdbtn2.setBounds(200, 84, 109, 23);
		contentPane.add(rdbtn2);

		JLabel lblNewLabel = new JLabel("Nombre Jugador 1");
		lblNewLabel.setBounds(89, 132, 88, 14);
		contentPane.add(lblNewLabel);

		tfNombreJ1 = new JTextField();
		tfNombreJ1.setBounds(89, 151, 86, 20);
		contentPane.add(tfNombreJ1);
		tfNombreJ1.setColumns(10);

		JLabel lblNewLabel2 = new JLabel("Nombre Jugador 2");
		lblNewLabel2.setBounds(200, 132, 88, 14);
		contentPane.add(lblNewLabel2);

		tfNombreJ2 = new JTextField();
		tfNombreJ2.setEditable(false);
		tfNombreJ2.setColumns(10);
		tfNombreJ2.setBounds(200, 151, 86, 20);
		contentPane.add(tfNombreJ2);

		JButton btnStart = new JButton("Iniciar");
		btnStart.setBounds(140, 195, 89, 23);
		contentPane.add(btnStart);

		// LISTENERS
		rdbtn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfNombreJ2.setEditable(false);
			}
		});

		rdbtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfNombreJ2.setEditable(true);
			}
		});

		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Juego abrir = new Juego();

				if (rdbtn1.isSelected() && !tfNombreJ1.getText().trim().isEmpty()) {
					Juego.labelNombre1.setText(tfNombreJ1.getText().trim());
					Juego.labelNombre2.setText("Player CPU");

					abrir.setVisible(true);
				}else if (rdbtn2.isSelected() && !tfNombreJ2.getText().trim().isEmpty() && !tfNombreJ1.getText().trim().isEmpty()) {
					Juego.labelNombre1.setText(tfNombreJ1.getText().trim());
					Juego.labelNombre2.setText(tfNombreJ2.getText().trim());
					abrir.setVisible(true);

				} else {
					if (tfNombreJ1.getText().trim().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Player 1 Esta vacio ");

					}
					if (tfNombreJ2.getText().trim().isEmpty() && rdbtn2.isSelected())  {
						JOptionPane.showMessageDialog(null, "Player 2 Esta vacio ");

					}

				}

			}
		});

	}

	// comprobar valor en el campo de texto, que no sea "" [@MARC]
	// recoger valores del texto y llevarlos a la otra pantalla

}
