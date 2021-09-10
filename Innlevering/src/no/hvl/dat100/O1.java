package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 1; i++) {
			
			
			
			int brutto = parseInt( showInputDialog("Brutto inntekt?: "));	
		if (brutto < 164100) {
			System.out.println("Ingen trinnskatt!");
			
		}
		
		else if (brutto > 164100 || brutto < 230950) {
			
			double trinnSkatt = brutto * 0.0093;
			System.out.println("Din trinnskatt er: " + trinnSkatt);
			
		} 
		
		else if (brutto > 230951 || brutto < 580650) {
			
			double trinnSkatt = brutto * 0.0241;
			System.out.println("Din trinnskatt er: " + trinnSkatt);
			
		}
		
		else if (brutto > 580651 || brutto < 934050) {
			
			double trinnSkatt = brutto * 0.1152;
			System.out.println("Din trinnskatt er: " + trinnSkatt);
			
		}
		
		else if (brutto > 934051) {
			
			double trinnSkatt = brutto * 0.1452;
			System.out.println("Din trinnskatt er: " + trinnSkatt);
			
	
		}
		
	}

}

}


