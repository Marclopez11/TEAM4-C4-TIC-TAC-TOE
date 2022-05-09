package com.TEAM4_C4.TIC_TAC_TOE;
import java.awt.EventQueue;

import com.TEAM4_C4.TIC_TAC_TOE.JuegoCPU;
import com.TEAM4_C4.TIC_TAC_TOE.JuegoJugadores;

public class AppJugadores {
	
	//main sin que sea jframe
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoJugadores frame = new JuegoJugadores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
