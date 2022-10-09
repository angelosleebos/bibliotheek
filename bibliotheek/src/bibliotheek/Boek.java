package bibliotheek;

/*
 * Klasse voor het aanmaken van een nieuw boek object 
 */
public class Boek {
    private String titel;
    private String taal;
    private Auteur auteur;



    /**
     * Constructor voor een nieuw boek object waarvan de Taal bekend is
     * @param titel De titel van het boek
     * @param taal De taal van het boek
     * @param auteur De auteur van het boek
     */
    public Boek(String titel, String taal, Auteur auteur) {
        this.titel = titel;
        this.taal = taal;
        this.auteur = auteur;
    }

    /**
     * Constructor voor een nieuw boek waarvan de Taal niet bekend is
     * @param titel De titel van het boek
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

    public String getTitel() {
        return titel;
    }

    public String getTaal() {
        return taal;
    }

    public Auteur getAuteur() {
        return auteur;
    }
}
