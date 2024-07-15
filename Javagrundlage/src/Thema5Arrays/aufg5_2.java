package Thema5Arrays;

import java.util.ArrayList;
import java.util.List;

public class aufg5_2 {

	public static void main(String[] args) {

		int[] maxnumbers = new int[20];
		int max = 0;
		List<Integer> maxIndexes = new ArrayList<>();

		for (int i = 0; i < maxnumbers.length; i++) {
			maxnumbers[i] = (int) (Math.random() * 101);

			if (maxnumbers[i] > max) {
				max = maxnumbers[i];
				maxIndexes.clear();
				maxIndexes.add(i);
			} 
			else if (maxnumbers[i] == max) {
				maxIndexes.add(i);
			}

			System.out.println(maxnumbers[i] + "\t" + i);

		} // Ende for Schleife.

		System.out.println("Größte Zahl im Array ist: \t" + max + "\t" + maxIndexes);
	}

}
