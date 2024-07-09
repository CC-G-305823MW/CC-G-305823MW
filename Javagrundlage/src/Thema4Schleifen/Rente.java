package Thema4Schleifen;

import utils.IO;

public class Rente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		float kapital = IO.promptAndReadFloat("Geben sie ihr anzulegendes Kapital an: " );
		float zinssatz = IO.promptAndReadFloat("Geben sie den Zinssatz an: ");
		int laufzeit = IO.promptAndReadInt("Geben sie die Laufzeit an: ");
			
		for  (int jahr = 1; jahr <= laufzeit; jahr ++) {
			kapital = kapital + kapital * zinssatz / 100;
			IO.writeln("Im" +jahr +" beträgt das Kapital " +kapital +" €.");
			
	}

}
}