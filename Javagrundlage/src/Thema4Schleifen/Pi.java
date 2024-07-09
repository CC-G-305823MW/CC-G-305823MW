package Thema4Schleifen;

import utils.IO;

public class Pi {

	public static void main(String[] args) {
		
		
		int n = IO.promptAndReadInt("Wie viele Durchgänge: ");
		double count = 0;
		
		
		for ( int i = 0; i < n; i ++ )  {	
		double x = Math.random();
		double y = Math.random();
		
		double dist = x*x + y*y;
		
		if (dist <= 1.0 ) {
			count++;
		} // if schleife
		} // for schleife
		
		IO.writeln("Der Näherungswert für Pi bei " + n + 
				" Durchgängen beträgt: " + (4 * (count / n))
				+ "\t \t" + Math.PI);
		
	}	
}
