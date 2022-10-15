package bibliotheek;

/*
 * Auteur klasse voor het aanmaken van een nieuwe auteur
 */
public class Auteur {
    private String naam = null;
    private Boolean prijs = null;

    /**
     * Auteur constructor waarvan de naam en of deze wel of geen prijs heeft
     * gewonnen wordt bijgehouden
     * 
     * @param naam  Naam van de auteur
     * @param prijs Wel of niet in het bezit van een boeken prijs
     */
    public Auteur(String naam, Boolean prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    /**
     * Methode voor het opvragen van de naam van een auteur
     * @return String naam van de auteur
     */
    public String getNaam() {
        return naam;
    }

    /**
     * methode voor het opvragen van de prijs van een auteur
     * @return boolean of de auteur een prijs gewonnen heeft
     */
    public Boolean getPrijs() {
        return prijs;
    }
}
