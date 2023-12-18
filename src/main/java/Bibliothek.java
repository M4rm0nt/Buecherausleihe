import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private List<Buch> buecher;

    public Bibliothek() {
        buecher = new ArrayList<>();
    }

    public void alleBuecherAnzeigen() {
        for (Buch buch : buecher) {
            buch.informationAnzeigen();
        }
    }

    public Buch buchAusleihen(String titel) {
        for (Buch buch : buecher) {
            if (buch.getTitel().equals(titel) && buch.istVerfuegbar()) {
                buch.ausleihen();
                return buch;
            }
        }
        System.out.println("Buch nicht verfügbar oder nicht gefunden.");
        return null;
    }

    public void buchZurueckgeben(Buch buch) {
        if (buch != null) {
            buch.zurueckgeben();
        }
    }
}