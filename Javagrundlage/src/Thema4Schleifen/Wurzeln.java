package Thema4Schleifen;

import utils.IO;

public class Wurzeln {

	public static void main(String[] args) {
		
		int z = IO.promptAndReadInt(" Geben sie einen Wert für Z ein: ");
		int n = IO.promptAndReadInt(" Anzahl der Wiederholungen in n:  ");
		
		int i = 1;
		double links = 0;
		double rechts = z;
		
		while (i <= n ) {
		double m = (links + rechts) / 2.;
			if (m* m < z) {
				links = m;
			} // if ende
			else {
				rechts = m;
			}
		IO.writeln(i +"\t \t" +links+"\t \t"+rechts );	
			i++;
		} //while ende
		
		
		
	}

}
