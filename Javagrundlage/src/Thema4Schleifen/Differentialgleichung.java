package Thema4Schleifen;

import utils.IO;

public class Differentialgleichung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double t = 0;
	double dt = 1;
	double k = 0.1;
	double xn = 0.01;
			double dx = 0;
	
	do {
		t = t + dt;
		dx = k * xn * ( 1 - xn) * dt;
		xn = xn + dx;
		IO.writeln(t + "\t" +xn);	
	}while (t < 100)	;	
			
	
		
		
	}

}
