package Thema6;

import utils.IO;

public class Aufg6_1Temperaturen {

	public static void main(String[] args) {
							//Tag0	T1		t2 ....
		double[][] temp = { { 20.5, 22.3, 19.8, 21.0, 23.1, 20.4, 18.7 }, // Stadt 1
							{ 15.5, 17.2, 16.3, 14.8, 15.7, 16.0, 14.9 }, // Stadt 2
							{ 18.2, 19.1, 17.8, 20.3, 21.5, 19.7, 18.9 }  // Stadt 3
		};

		for (int stadt = 0; stadt < temp.length; stadt++) {
			double sum = 0;
			for (int tag = 0; tag < temp[stadt].length; tag++) {
				sum += temp[stadt][tag];
			}
			double durchschnitt = sum / temp[stadt].length;
			System.out.println("Durchschnittstemperatur für Stadt " + (stadt + 1) + ": " + IO.round(durchschnitt, 2)+"°C");
		}
	}
}