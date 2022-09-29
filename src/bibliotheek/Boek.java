package bibliotheek;

public class Boek {
    String titel;
    String taal;
    Auteur auteur;

    Boek(String titel, String taal, Auteur auteur) {
        this.titel = titel;
        this.taal = taal;
        this.auteur = auteur;
    }

    Boek(String titel, Auteur auteur) {
        this.titel = titel;
        this.auteur = auteur;
        taal = "Nederlands";
    }

    public String print() {
        // Geeft de gegevens van het boek terug
        String strBoekGegevens = titel + " van " + auteur.naam + " in het " + taal;
        System.out.println(strBoekGegevens);
        return strBoekGegevens;
    }
}
