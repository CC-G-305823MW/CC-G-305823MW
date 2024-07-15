package Thema5Arrays;

public class aufg51 {

	public static void main(String[] args) {
		// Teil 1
		Integer[] array = { 1, 5, 10, 25 };
		int sum = 0;
		int i;

		for (i = 0; i < array.length; i++) {
			sum += array[i];
		} // for ende
		System.out.println("Die Summe der Array Elemente ist:" + sum);

	

		int[] geradesarray = new int[20];
		for(
		i = 0;i<geradesarray.length;i++)
		{
		geradesarray[i] = (int) (Math.random() * 50) * 2; // Nur gerade Zahlen
		System.out.println("20 zufällige gerade Zahlen: \t" + geradesarray[i]);
		}
	}
}