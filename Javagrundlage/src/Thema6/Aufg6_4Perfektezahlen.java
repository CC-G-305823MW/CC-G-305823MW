package Thema6;

public class Aufg6_4Perfektezahlen {

	public static void main(String[] args) {
		
		        int limit = 500;

		        for (int num = 1; num <= limit; num++) {
		            int sum = 0;
		            for (int i = 1; i <= num / 2; i++) {
		                if (num % i == 0) {
		                    sum += i;
		                }
		            }

		            if (sum == num) {
		                System.out.println(num + " is a perfect number.");
		            }
		        }
		    }
		}

