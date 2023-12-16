import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        int[] brojevi = new int[10];
        int suma = 0;

        System.out.println("Unesite 10 brojeva:");

        // Unos 10 brojeva od strane korisnika
        for (int i = 0; i < 10; i++) {
            brojevi[i] = skener.nextInt();
        }
        
        // Provjera da li su brojevi djeljivi i sa 2 i sa 3 i njihovo sabiranje
        for (int broj : brojevi) {
            if (broj % 2 == 0 && broj % 3 == 0) {
                suma += broj;
            }
        }

        System.out.println("Suma brojeva koji su djeljivi i sa 2 i sa 3 je: " + suma);

        skener.close();
    }
}
