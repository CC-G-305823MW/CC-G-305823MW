package Aufgaben1;

import utils.IO;

public class Booleand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int x = 120;
int y = 2;
int z = 3;

// Aufgabe a

double a = 2147483647 + '1' ;
	IO.writeln("Result for a: " + a);

// Aufgabe b
// byte b = (byte) (256 * long (2147483648) ;	
// IO.writeln("Result for b:" + b);

// Aufgabe c

String c = "x" + y + z;
	IO.writeln("Result for c:" +c);
	
// Aufgabe d
	
boolean d = x < y && true;
	IO.writeln("Result for d:" + d);
	
// Aufgabe e
	
double e = 9f / 3d;
	IO.writeln("Result for e:" +e);
	
// Aufgabe f
	
String f = x + "y" + z; // funktioniert nicht mit - Operator muss auf + geändert werden.
 	IO.writeln("Result for f:" + f);




	}

}
