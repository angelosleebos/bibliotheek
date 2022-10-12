package bibliotheek;

/*
 * Klasse voor het maken van een nieuw of kopie van een exemplaar
 */
public class Exemplaar {
    private Boek boek = null;

    /**
     * Constructor voor het maken van een nieuw exemplaar op basis van een boek
     * 
     * @param boek Boek object
     */
    // public Exemplaar(Boek boek) {
    // this.boek = boek;
    // System.out.println("nieuw exemplaar -> " + boek.getTitel() + " van " +
    // boek.getAuteur().getNaam() + " in het " + boek.getTaal());
    // }
    public Exemplaar(Boek boek) {
        this.boek = boek;
        System.out.print("nieuw exemplaar -> ");
        boek.print();
    }

    /**
     * Constructor voor het aanmaken van een kopie van een bestaand exemplaar
     * 
     * @param exemplaar Exemplaar object
     */
    public Exemplaar(Exemplaar exemplaar) {
        boek = exemplaar.boek;
        System.out.print("kopie van exemplaar -> ");
        boek.print();
    }

    /**
     * Methode voor het printen van de exemplaar gegevens
     */
    public void print() {
        // String boekGegevens = "exemplaar -> " + boek.getTitel() + " van " +
        // boek.getAuteur().getNaam() + " in het " + boek.getTaal();
        System.out.print("exemplaar -> ");
        boek.print();
    }

    public Boek getBoek() {
        return boek;
    }
}
