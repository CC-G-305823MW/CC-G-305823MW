package Thema5Arrays;

public class aufg5_3tauschen {

	public static void main(String[] args) {

		int[] Array = {4, 2, 10, 3, -5, 0, 17};
		
		for (int i = 0; i < Array.length; i++) {
			System.out.println("Inhalt von Array: "+i +"\t \t" +Array[i] );
		}
		
	int temporary = Array [3];
	Array[3] = Array [5];
	Array[5] = temporary;
		
	System.out.println("After swapping the Elements at [3] and [5]:");
	for (int i = 0; i < Array.length; i++) {
		System.out.println("Inhalt von Array: "+i +"\t \t" +Array[i] );
	}
	}

}
