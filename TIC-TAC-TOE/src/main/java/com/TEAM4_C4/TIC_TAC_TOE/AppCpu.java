package com.TEAM4_C4.TIC_TAC_TOE;

import java.awt.EventQueue;

public class AppCpu {

	//main sin que sea jframe
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoCPU frame = new JuegoCPU();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
