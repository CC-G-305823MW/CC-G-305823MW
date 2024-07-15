package Thema6;

import utils.IO;

public class Aufg6_3Bastelnmitsternen {

	public static void main(String[] args) {
		int height = IO.promptAndReadInt("How tall shall the pyramid be? ");
		

		for (int line = 0; line < height; line++) { // loop for every line (height = no of lines)
			for (int space = height - 1 - line; space > 0; space--) { // loop for leading spaces
				System.out.print(" ");
			}
			for (int star = 0; star < (2 * line + 1); star++) { // loop for stars
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
