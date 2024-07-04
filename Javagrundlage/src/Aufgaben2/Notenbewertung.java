package grundlage;

import java.util.Scanner;

public class Notenbewertung {

	public static void main(String[] args) {
	
/* 
Entwickeln Sie ein Java-Programm, das je nach gegebenem Notenbereich einer Prüfung
eine entsprechende Bewertung ausgibt: 1.0-1.4: ’Sehr gut’, 1.5-2.4 ’Gut’, 2.5-3.4: ’Befriedigend’,
3.5-4.0: ’Ausreichend’, 4.1-5.0: ’Nicht bestanden’, sonst: ’Ungültige Note’.
 */

				Scanner scanner = new Scanner(System.in);
				System.out.println("Bitte geben sie ihre Note ein: ");
				System.out.println("Gegebenenfalls benutze ein ',' und kein '.' du honk!");
				double note = scanner.nextDouble();
				if (note >= 1.0 && note <= 1.4)	{
					System.out.println("Ihre Note ist sehr gut!"); 		}
					
				else if (note >= 1.5 && note <= 2.4) {
					System.out.println("Ihre Note ist gut!"); 			}
				
				else if (note >= 2.5 && note <= 3.4) {
					System.out.println("Ihre Note ist befriedigend!"); 			}
				
				else if (note >= 3.5 && note <= 4.0) {
					System.out.println("Ihre Note ist Ausreichend!"); 			}
				
				else if (note >= 4.1 && note <= 5.0) {
					System.out.println("SIE HABEN NICHT BESTANDEN! (zu lesen wie [du kommst hier nicht vorbei!]"); 			}
				
				else {
					System.out.println("ungültige Note. Vielen dank für ihre Teilnahme.");
				}
	
				scanner.close();
	}

}
