package Aufgaben1;

import java.util.Scanner;

public class BMI {

	
	public static void main (String[] args) {
	//public static void IO (double height, double weight, double bmi) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println ("What's your Name? ");
	String name = scanner.next();
	
	//IO.promptAndReadString("What's your name? + + );
	
	
	System.out.println("How tall are you?"
			+ " Please tell me in meter.");
	Double height = scanner.nextDouble();
	// size in m
	
	
	
	
	System.out.println("What your weight?"
			+ "Please tell me in kg.");
	Double weight = scanner.nextDouble();
	 //  weight in KG	
			
	
	Double bmi = weight / (height * height);
	System.out.println("Hello" + name);
	System.out.println("Your BMI is: "+bmi);
	System.out.println("Without the numbers after the comma is your BMI: " + Math.round(bmi));
	 
//	IO.promptAndReadDouble("Bitte ... eingeben: ");
// 	System.out.println("What's your weight in KG?" + weight + );
// 	 double weight = scanner.nextDouble() ;
 	
 	


	
		
//	double bmi = weight / (size  * size);
//	IO.writeln("Wert = "+ bmi);
//	System.out.println("Bonjour" + name);
//	System.out.println("Your BMI is: "+bmi+" punkte");
//	System.out.println("Without those numbers after the comma, the BMI Count is" + Math.round(bmi));
	
	
	
	
	
	
	/*public static void inFileStream(File name, File weight, File size) {
		InputStream namestream= null;
		InputStream weightstream= null;
		Inputstream sizestream= null;
	*/	
		scanner.close();
	}	
	}
   