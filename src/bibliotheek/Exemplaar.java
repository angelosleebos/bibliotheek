package bibliotheek;

public class Exemplaar {
    public Boek boek;

    /// Voeg een nieuw boek toe
    public Exemplaar(Boek boek) {
        this.boek = boek;
        System.out.println("nieuw exemplaar -> " + boek.titel + " van " + boek.auteur.naam + " in het " + boek.taal);
    }

    // Voeg een bestaand boek toe
    public Exemplaar(Exemplaar exemplaar) {
        boek = exemplaar.boek;
        System.out.println("kopie van exemplaar -> " + boek.titel + " van " + boek.auteur.naam + " in het " + boek.taal);
    }

    public String print() {
        String strBoekGegevens = "exemplaar -> " + boek.titel + " van " + boek.auteur.naam + " in het " + boek.taal;
        System.out.println(strBoekGegevens);
        return strBoekGegevens;
    }
}

