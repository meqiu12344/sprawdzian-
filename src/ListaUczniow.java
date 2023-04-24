import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * KLASA PRZEPROWADZA WSZYSTKIE DZIAŁANIA NA LISCIE UCZNIOW TAKIE JAK DODAWANIE CZY USUWANIE
 * @AUTHOR: Mateusz Mniak
 */

public class ListaUczniow {
    private Map<String, String> UczenStos = new HashMap<>();

    public void dodaj(String imie, String nazwisko){
        UczenStos.put(imie, nazwisko);
    }

    public void wys(){
        System.out.println(UczenStos.toString());
    }

    public void usun(String imie, String nazwisko){
        UczenStos.remove(imie, nazwisko);
    }
    /*
    public void losuj(int n){
        Random rand = new Random();
        int[] idLos = new int[n];
        int los;

        for(int i = 0; i<n; i++){
            los = rand.nextInt(UczenStos.size());
            for(int x: idLos){
                if(x != los){
                    System.out.println();
                    idLos[i] = ;
                }
            }
        }
    }
     */
}
