package bibliotheek;

/*
 * Klasse voor het maken van een nieuw of kopie van een exemplaar
 */
public class Exemplaar {
    public Boek boek;

    /**
     * Constructor voor het maken van een nieuw exemplaar op basis van een boek
     * @param boek Boek object 
     */
    public Exemplaar(Boek boek) {
        this.boek = boek;
        System.out.println("nieuw exemplaar -> " + boek.titel + " van " + boek.auteur.naam + " in het " + boek.taal);
    }

    /**
     * Constructor voor het aanmaken van een kopie van een bestaand exemplaar
     * @param exemplaar Exemplaar object
     */
    public Exemplaar(Exemplaar exemplaar) {
        boek = exemplaar.boek;
        System.out.println("kopie van exemplaar -> " + boek.titel + " van " + boek.auteur.naam + " in het " + boek.taal);
    }

    /**
     * Methode voor het printen van de exemplaar gegevens
     */
    public void print() {
        String boekGegevens = "exemplaar -> " + boek.titel + " van " + boek.auteur.naam + " in het " + boek.taal;
        System.out.println(boekGegevens);
    }
}

