import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj miejsce zamieszkania: ");
        String miejsce = sc.nextLine();
        System.out.println("Podaj wiek: ");
        int wiek = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj dzień tygodnia: ");
        String dzien = sc.nextLine();

        double a;
        a = 40;
        double b;
        b = 0;


        if (dzien.equals("Czwartek")) {
            a = 0;
            b = 100;
        } else {
            if (wiek <= 10) {
                a = 0;
                b = 100;
            } else if (wiek <= 18) {
                a = a * 0.5;
                b = b + 50;
                if (miejsce.equals("Warszawa")) {
                    a = 0.9 * a;
                    b = b + 10;
                }
            } else {
                a = a;
                b = b;
                if (miejsce.equals("Warszawa")) {
                    a = 0.9 * a;
                    b = b + 10;
                }
            }
        }





        System.out.println("Dane: " + miejsce + ", " + wiek + " lat, " + dzien + " Cena biletu: " + a + " PLN");
        System.out.println("Przecena: " + b + "%");

    }
}
