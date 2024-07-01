package grundlage;

public class PrimitiveAddition {

	public static void main(String[] args) {
		
	double a = 0.0;
	double b = 0.0;
	double e = 0.0;
			
	 a = IO.promptAndReadDouble("Give me a value for a");
	 b = IO.promptAndReadDouble("Give me a value for b");
	
	e = a + b;
	IO.writeln("a= " + a);
	IO.writeln("b= " + b);
	IO.round(e, 2);
	IO.writeln("e= " + e);
	
	}
}
