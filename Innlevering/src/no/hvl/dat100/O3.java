package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static void main(String[] args) {
		
		
		
		int number = 1;
		
		int n = parseInt( showInputDialog("Skriv et heltall: "));
		
		for (int i = 1; i <= n; i++) {
			
			number = number * i;
		}
		
		System.out.println("Fakultet av " + n + " Er: " + number);
		
		

	}

}
