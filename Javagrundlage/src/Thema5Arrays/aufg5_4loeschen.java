package Thema5Arrays;

public class aufg5_4loeschen {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 9, -5, 4 };
		int valueToDelete = 9;

		System.out.println("Original Array:");
		printArray(arr);
		System.out.println("\n");

		arr = deleteArrayElement(arr, valueToDelete);

		System.out.println("New Array after deleting " + valueToDelete + ":");
		printArray(arr);
	}

	public static int[] deleteArrayElement(int[] a, int w) {
		int[] newArray = new int[a.length - 1];
		int newArrayIndex = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != w) { 				// != bedeute ungleich bzw in diesem Fall "ohne w"
				newArray[newArrayIndex] = a[i];
				newArrayIndex++;
			}
		}

		return newArray;
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}