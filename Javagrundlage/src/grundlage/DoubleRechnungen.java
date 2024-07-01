package grundlage;

public class DoubleRechnungen {

	public static void main(String[] args) {
		
	double a = 0;
	double b = 0;
	double e = 0;
			
	 a = IO.promptAndReadDouble("Give me a value for a: ");
	 b = IO.promptAndReadDouble("Give me a value for b: ");
	
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
