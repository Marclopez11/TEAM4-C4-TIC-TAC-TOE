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
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Window.Type;

public class App extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup numeroJugadores = new ButtonGroup();
	private JTextField tfNombreJ1;
	private JTextField tfNombreJ2;
	public static App frame = new App();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//final App frame = new App();
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 452, 303);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		setContentPane(contentPane);

		final JRadioButton rdbtn1 = new JRadioButton("CPU");
		rdbtn1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		rdbtn1.setSelected(true);
		numeroJugadores.add(rdbtn1);
		rdbtn1.setBounds(216, 77, 109, 23);
		contentPane.add(rdbtn1);

		final JRadioButton rdbtn2 = new JRadioButton("2 Players");
		rdbtn2.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		numeroJugadores.add(rdbtn2);
		rdbtn2.setBounds(309, 77, 109, 23);
		contentPane.add(rdbtn2);
		

		JLabel lblNewLabel = new JLabel("Player 1");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblNewLabel.setBounds(216, 135, 86, 14);
		contentPane.add(lblNewLabel);
		

		tfNombreJ1 = new JTextField();
		tfNombreJ1.setBounds(216, 161, 86, 20);
		contentPane.add(tfNombreJ1);
		tfNombreJ1.setColumns(10);
		

		JLabel lblNewLabel2 = new JLabel("Player 2");
		lblNewLabel2.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblNewLabel2.setBounds(330, 135, 88, 14);
		contentPane.add(lblNewLabel2);
		

		tfNombreJ2 = new JTextField();
		tfNombreJ2.setEditable(false);
		tfNombreJ2.setColumns(10);
		tfNombreJ2.setBounds(330, 161, 86, 20);
		contentPane.add(tfNombreJ2);
		

		JButton btnStart = new JButton("Iniciar");
		btnStart.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnStart.setForeground(new Color(51, 204, 153));
		btnStart.setBackground(Color.WHITE);
		btnStart.setBounds(263, 210, 99, 31);
		contentPane.add(btnStart);
		
		JLabel titulo = new JLabel("Tres en Línea");
		titulo.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		titulo.setBounds(23, 19, 198, 43);
		contentPane.add(titulo);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(App.class.getResource("/com/TEAM4_C4/TIC_TAC_TOE/img/t2vuw-eutu8.png")));
		img.setBounds(6, 74, 198, 167);
		contentPane.add(img);
		
		//LISTENERS

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
				//instanciamos la otra pantalla
				Juego abrir = new Juego();
				JuegoCPU abrirCPU = new JuegoCPU();
				//
				if (rdbtn1.isSelected() && !tfNombreJ1.getText().trim().isEmpty()) {
					
					//mandamos el valor del nombre a la página juego para mostrar su nombre
					Juego.labelNombre1.setText(tfNombreJ1.getText().trim());
					Juego.labelNombre2.setText("Player CPU");
					//hacer visible la otra pestaña
					abrir.setVisible(true);
					frame.setVisible(false);
				//	
				}else if (rdbtn2.isSelected() && !tfNombreJ2.getText().trim().isEmpty() && !tfNombreJ1.getText().trim().isEmpty()) {
					Juego.labelNombre1.setText(tfNombreJ1.getText().trim());
					Juego.labelNombre2.setText(tfNombreJ2.getText().trim());
					abrirCPU.setVisible(true);
					frame.setVisible(false);

				} else {
					// Player 1 no tiene valores
					if (tfNombreJ1.getText().trim().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Player 1 Esta vacio ");

					}
					//Player 2 no tiene valores
					if (tfNombreJ2.getText().trim().isEmpty() && rdbtn2.isSelected())  {
						JOptionPane.showMessageDialog(null, "Player 2 Esta vacio ");

					}

				}

			}
		});	

	}
	
	//comprobar valor en el campo de texto, que no sea "" [@MARC]
	//recoger valores del texto y llevarlos a la otra pantalla
	

	// comprobar valor en el campo de texto, que no sea "" [@MARC]
	// recoger valores del texto y llevarlos a la otra pantalla

}
