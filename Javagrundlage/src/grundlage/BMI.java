package grundlage;

import java.util.Scanner;

public class BMI {

	
	public static void main (String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	

	 System.out.println ("What's your Name? ");
	 String name = scanner.next();
	 
 	System.out.println("Eingabe Gewicht in weight: +m+ ");
 	double weight = 100.5 ;
 	
	System.out.println("Eingabe Größe in cm: +size+ ");
	double size = 1.90 ;

	 //  weight in KG
	 // size in m
		
	double bmi = weight / (size  * size);

	System.out.println("Your BMI is: "+bmi+" punkte");
	// scanner.close();
	
	}
		
}   