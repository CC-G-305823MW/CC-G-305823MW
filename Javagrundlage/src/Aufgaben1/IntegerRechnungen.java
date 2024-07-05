package Aufgaben1;

import utils.IO;

public class IntegerRechnungen {

	public static void main(String[] args) {
		
	int a = 0;
	int b = 0;
	int e = 0;
			
	 a = IO.promptAndReadInt("Give me a value for a: ");
	 b = IO.promptAndReadInt("Give me a value for b: ");
	 
	IO.writeln("a= " + a);
	IO.writeln("b= " + b);
	
	e = a + b;  		
	IO.writeln( "Addition e = " + e); 
	
	e = a - b;  		
	IO.writeln("Subtraktion e= " + e);
	
	e = a * b;   	
	IO.writeln("Multiplikation e= " + e);
	
	e = a / b;		
	IO.writeln("Division e= " + e);
	
	e = a % b;
	IO.writeln("Modulo e= " +e);
	
	}
}