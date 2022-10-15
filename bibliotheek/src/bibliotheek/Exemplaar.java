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
        System.out.print("exemplaar -> ");
        boek.print();
    }

    /**
     * Methode voor het opvragen van het Boek
     * @return Boek boek van het exemplaar
     */
    public Boek getBoek() {
        return boek;
    }
}
