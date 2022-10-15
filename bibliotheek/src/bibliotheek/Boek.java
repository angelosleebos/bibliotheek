package bibliotheek;

/*
 * Klasse die gegevens van een boek beheert.  
 */
public class Boek {
    private String titel = null;
    private String taal = null;
    private Auteur auteur = null;

    /**
     * Constructor voor een nieuw boek object waarvan de Taal bekend is
     * 
     * @param titel  De titel van het boek
     * @param taal   De taal van het boek
     * @param auteur De auteur van het boek
     */
    public Boek(String titel, String taal, Auteur auteur) {
        this.titel = titel;
        this.taal = taal;
        this.auteur = auteur;
    }

    /**
     * Constructor voor een nieuw boek waarvan de Taal niet bekend is
     * 
     * @param titel  De titel van het boek
     * @param auteur De auteur van het boek
     */
    public Boek(String titel, Auteur auteur) {
        this.titel = titel;
        this.auteur = auteur;
        taal = "Nederlands";
    }

    /**
     * Methode voor het printen van de gegevens van het boek
     */
    public void print() {
        // Geeft de gegevens van het boek terug
        // String boekGegevens = titel + " van " + auteur.getNaam() + " in het " + taal;
        System.out.println(titel + " van " + auteur.getNaam() + " in het " + taal);
    }

    /**
     * Methode voor het opvragen van de titel van het boek
     * @return String titel van het boek
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Methode voor het opvragen van de taal van het boek
     * @return String taal waarin het boek geschreven is
     */
    public String getTaal() {
        return taal;
    }

    /**
     * Methode voor het opvragen van de auteur van het boek
     * @return Auteur geeft een auteur terug
     */
    public Auteur getAuteur() {
        return auteur;
    }
}
