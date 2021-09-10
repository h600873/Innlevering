package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

	public static void main(String[] args) {
		
		
		//Kode for å vise hvilken karakter eleven får med poengsum 0 - 100
		
				for (int i = 1; i <= 10; i++) {
				boolean status = true;
					
				
				
				while (status) {
				
					int poengsum = parseInt( showInputDialog("Poengsum?: "));	
				if (poengsum > 100 || poengsum < 0) {
					System.out.println("Ugyldig poengsum!");
					
				}
				
				else if (poengsum == 100 || poengsum >= 90) {
					
					System.out.println("Student Nr: " + i + " Fikk Karakter A!");
					status = false;
				} 
				
				else if (poengsum == 89 || poengsum >= 80) {
					System.out.println("Student Nr: " + i + " Fikk Karakter B!");
					status = false;
				}
				
				else if (poengsum == 79 || poengsum >= 60) {
					System.out.println("Student Nr: " + i + " Fikk Karakter C!");
					status = false;
				}
				
				else if (poengsum == 59 || poengsum >= 50) {
					System.out.println("Student Nr: " + i + " Fikk Karakter D!");
					status = false;
				}
				
				else if (poengsum == 49 || poengsum >= 40) {
					System.out.println("Student Nr: " + i + " Fikk Karakter E!");
					status = false;
				}
				
				else if (poengsum == 39 || poengsum >= 0) {
					System.out.println("Student Nr: " + i + " Fikk Karakter F!");
					status = false;
				}

				}
				
			}

	}

}
