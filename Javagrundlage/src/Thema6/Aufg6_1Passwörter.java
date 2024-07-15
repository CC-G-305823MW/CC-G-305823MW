package Thema6;

public class Aufg6_1Passwörter {

    public static void main(String[] args) {
        String[] passwords = {"Pass1234", "123456", "Wasser123", "Feuer465Wasser", "123456789", "A123456789"};

        for (String password : passwords) {  // Geht das Array solange durch bis alle Passwörter geprüft wurden.
            if (isStrong(password)) {
                System.out.println(password + " is a strong password.");
            } else {
                System.out.println(password + " is a weak password.");
            }
        }
    }

    public static boolean isStrong(String password) {
        return password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[a-zA-Z].*");
   //								^min 8 Zeichen			^prüft auf Zahlen					^prüft auf Buchstaben groß und klein.
    
    }
}