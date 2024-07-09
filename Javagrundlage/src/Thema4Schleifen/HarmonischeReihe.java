/*
 * 
 * package Schleifen;


import utils.IO;

public class HarmonischeReihe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n = 1;
		
		do {
		double ergebnis = 1 / n;
		n++ ;
		IO.writeln("Wert von n: \t "+ n +"\t" +"\t" + IO.round(ergebnis, 15));
		} 
		while (n < 10000);
		
		
	}

}
*/


package Thema4Schleifen;

import utils.IO;

public class HarmonischeReihe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n = 10000;
		
		do {
		float ergebnis = 1 / n;
		n-- ;
		IO.writeln("Wert von n: \t "+ n +"\t" +"\t" + IO.round(ergebnis, 15));
		
		} 
		while (n >= 1);
		
		
	}

}
