public class Buch {
    private String titel;
    private String autor;
    private String isbn;
    private boolean verfuegbarkeit;

    public Buch(String titel, String autor, String isbn) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
        this.verfuegbarkeit = true;
    }

    public void informationAnzeigen() {
        System.out.println("Titel: " + titel + ", Autor: " + autor + ", ISBN: " + isbn + ", Verfügbar: " + verfuegbarkeit);
    }

    public boolean istVerfuegbar() {
        return verfuegbarkeit;
    }

    public void ausleihen() {
        if(verfuegbarkeit) {
            verfuegbarkeit = false;
        } else {
            System.out.println(titel + " ist bereits ausgeliehen.");
        }
    }

    public void zurueckgeben() {
        verfuegbarkeit = true;
    }

    public String getTitel() {
        return titel;
    }
}