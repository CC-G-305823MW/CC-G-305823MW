package Thema7Rekursion;

import utils.IO;
import utils.Methods;

public class Aufg7_1reverse {

	public static void main(String[] args) {
		String original = IO.promptAndReadString("Give me a String.");
		String reversed = Methods.reverseString(original);
		System.out.println("Original: " + original);
		System.out.println("Reversed: " + reversed);
	}

}