package SingletonZadaniePoczta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Poczta poczta = new Poczta();

        boolean isWorking = true;
        while (isWorking) {
            String line = sc.nextLine().trim().toLowerCase();

            if (line.startsWith("quit")) {
                break;
            } else if (line.startsWith("automat")) {
               int numerek = poczta.pobierzBiletZAutomatu();
                System.out.println("Automat bilet nr: " + numerek);
            } else if (line.startsWith("strona internetowa")) {
                int numerek = poczta.pobierzBiletZeStronyInternetowej();
                System.out.println("Strona internetowa, bilet ne: " + numerek);
            } else if (line.startsWith("rejestracja")) {
                int numerek = poczta.pobierzBiletZRejestracji();
                System.out.println("Rejestracja bilet nr: " + numerek);
            }
    }
    }
}
