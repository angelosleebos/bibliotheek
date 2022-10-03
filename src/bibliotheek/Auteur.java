package bibliotheek;

/*
 * Auteur klasse voor het aanmaken van een nieuwe auteur
 */
public class Auteur {
    String naam;
    Boolean prijs;

    /**
     * Auteur constructor waarvan de naam en of deze wel of geen prijs heeft gewonnen wordt bijgehouden
     * @param naam Naam van de auteur
     * @param prijs Wel of niet in het bezit van een boeken prijs
     */
    Auteur(String naam, Boolean prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }
}

