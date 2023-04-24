import java.util.Objects;

/**
 * KLASA BOSLUGUJE KONSTRUKTOR, GETERRY ORAZ TO STRINGA
 * @AUTHOR: Mateusz Mniak
 */

public class Uczen {
    // POLA KLASY
    String imie;
    String naziwsko;
    int idLicznik = 0;
    int id;


    // KONSTRUKTOR
    public Uczen(String imie, String naziwsko) {
        idLicznik++;
        id = idLicznik;
        this.imie = imie;
        this.naziwsko = naziwsko;
    }

    public Uczen(Uczen kopia){
        this.imie = kopia.imie;
        this.naziwsko = kopia.naziwsko;
    }


    // GETERY
    public String getImie() {
        return imie;
    }
    public String getNaziwsko() {
        return naziwsko;
    }


    // EQUALS I HASHCODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczen uczen = (Uczen) o;
        return id == uczen.id && Objects.equals(imie, uczen.imie) && Objects.equals(naziwsko, uczen.naziwsko);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imie, naziwsko, id);
    }


    // TOSTRING
    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", naziwsko='" + naziwsko + '\'' +
                ", id=" + id +
                '}';
    }
}
