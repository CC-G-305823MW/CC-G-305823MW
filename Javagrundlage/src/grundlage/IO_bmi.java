package grundlage;

public class IO_bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = IO.promptAndReadString("What's your name? ");
		IO.writeln("Hello " + name);
		// weight in kg
		// height in meters
		
		double height = IO.promptAndReadDouble("Please tell me your height in meter.");
		
		double weight = IO.promptAndReadDouble("Please tell me your weight in KG.");
	
		double bmi = weight / (height * height);	  
		
		IO.writeln ("Your BMI is: " + IO.round(bmi, 2));
		
	
		
	}

}