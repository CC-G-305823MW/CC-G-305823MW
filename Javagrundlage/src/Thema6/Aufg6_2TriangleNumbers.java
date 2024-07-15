package Thema6;

public class Aufg6_2TriangleNumbers {

	public static void main(String[] args) {
		int max = 6;
		int space = max;
		for (int i = 1; i <= max; i++) {
			for (space = max - i; space > 0; space--) { // loop for leading spaces
				System.out.print("  ");}
			int sum = 0;
			for (int j = 1; j <= i; j++) {

				sum += j;
				if (j == 1) {
					System.out.print(j);
				} else {
					System.out.print(" + " + j);
				}
			}

			System.out.println(" =" +" "+ sum);
		}
	}
}

//Calculate the number of spaces needed for centering
//int spaces = (max * 2 - 1);

// Print the spaces before the equation
//for (int k = 0; k < spaces / 2; k++) {
//    System.out.print(" ");