package semana03;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Erro5 {
	
	public static void main(String[] args ) {
	
	String[] n = {"Ana", "Bia", "Sandro", "Mara"};
	
	for(int i = 0; i<5; i++) {
		System.out.println(n[i]);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}
		
	}}


