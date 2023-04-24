import java.util.Random;
import java.util.Scanner;

/**
 * KLASA WYSWIETLA EFEKTY DZIALANIE CALEGO PROJEKTU
 * @AUTHOR: Mateusz Mniak
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ListaUczniow lista = new ListaUczniow();

        String imie, nazwisko;

        for(int i = 0;i<5; i++){
            imie = "";
            nazwisko = "";
            System.out.println("Uczeń nr."+i+" :");
            System.out.print("Imie:");
            imie = scanner.nextLine();
            System.out.print("Nazwisko: ");
            nazwisko = scanner.nextLine();

            lista.dodaj(imie, nazwisko);

        }

        lista.dodaj("mateusz1", "mani");
        lista.dodaj("Adam", "Kar");
        lista.dodaj("Michal", "Cieciora");

        lista.wys();
        lista.usun("a", "a");
        lista.wys();
    }
}