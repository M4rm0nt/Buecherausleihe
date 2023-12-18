import java.util.Scanner;

public class Main {
    private static Bibliothek bibliothek = new Bibliothek();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Buch buch1 = new Buch("buch1", "Ich", "0987654321");
        Buch buch2 = new Buch("buch2", "Du", "0987654322");
        Buch buch3 = new Buch("buch3", "Er", "0987654323");
        Buch buch4 = new Buch("buch4", "Sie", "0987654324");
        Buch buch5 = new Buch("buch5", "Es", "0987654325");

        bibliothek.buchHinzufuegen(buch1);
        bibliothek.buchHinzufuegen(buch2);
        bibliothek.buchHinzufuegen(buch3);
        bibliothek.buchHinzufuegen(buch4);
        bibliothek.buchHinzufuegen(buch5);

        boolean beenden = false;
        while (!beenden) {
            System.out.println("\n--- Bibliothek-Menü ---");
            System.out.println("1 - Alle Bücher anzeigen");
            System.out.println("2 - Buch ausleihen");
            System.out.println("3 - Buch zurückgeben");
            System.out.println("4 - Programm beenden");
            System.out.print("Wählen Sie eine Option: ");

            int auswahl = scanner.nextInt();
            scanner.nextLine();

            switch (auswahl) {
                case 1 -> bibliothek.alleBuecherAnzeigen();
                case 2 -> buchAusleihen();
                case 3 -> buchZurueckgeben();
                case 4 -> beenden = true;
                default -> System.out.println("Ungültige Auswahl. Bitte versuchen Sie es erneut.");
            }
        }
    }

    private static void buchAusleihen() {
        System.out.print("Geben Sie den Titel des Buches ein, das Sie ausleihen möchten: ");
        String titel = scanner.nextLine();
        Buch buch = bibliothek.buchAusleihen(titel);
        if (buch != null) {
            System.out.println("Sie haben das Buch '" + buch.getTitel() + "' ausgeliehen.");
        }
    }

    private static void buchZurueckgeben() {
        System.out.print("Geben Sie den Titel des Buches ein, das Sie zurückgeben möchten: ");
        String titel = scanner.nextLine();
        Buch buch = bibliothek.buchAusleihen(titel);
        if (buch != null) {
            bibliothek.buchZurueckgeben(buch);
            System.out.println("Sie haben das Buch '" + buch.getTitel() + "' zurückgegeben.");
        }
    }
}