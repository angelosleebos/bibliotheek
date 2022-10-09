package bibliotheek;

/*
 * Auteur klasse voor het aanmaken van een nieuwe auteur
 */
public class Auteur {
    private String naam;
    private Boolean prijs;

    /**
     * Auteur constructor waarvan de naam en of deze wel of geen prijs heeft gewonnen wordt bijgehouden
     * @param naam Naam van de auteur
     * @param prijs Wel of niet in het bezit van een boeken prijs
     */
    public Auteur(String naam, Boolean prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public Boolean getPrijs() {
        return prijs;
    }
}

