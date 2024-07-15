package Thema7Rekursion;

import utils.IO;
public class reverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				String input = IO.promptAndReadString("Eingabe des originalen Wortes: ");
				StringBuilder inputText1 = new StringBuilder(input);
				System.out.println("reverse(" + inputText1 + ") = " + inputText1.reverse());
		
		}
	
	}


