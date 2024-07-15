package Thema7Rekursion;

public class Aufg7_1sumArray {

	public static void main(String[] args) {
		
		int [] zahlen = {1, 2, 3, 4, 5 };
		int sum = sumArray(zahlen,0);
		System.out.println("Die Summe der Elemente im Array ist: "+sum);
		}
	
	
	public static int sumArray(int[] arr, int index) {	
		if (index >= arr.length) {
		return 0;
		}
		return arr[index] + sumArray(arr, index + 1);
		}
}	
		 

