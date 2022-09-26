package bibliotheek;

// Class Boek
public class Boek {
    private String boekTitel;
    private String boekTaal = "Nederlands";
    private Auteur referentieAuteur;

    // Class constructor for Boek
    // Een constructor met titel, taal, en auteur.
    public Boek(String boekTitel, String boekTaal, Auteur referentieAuteur) {
        this.boekTitel = boekTitel;
        this.boekTaal = boekTaal;
        this.referentieAuteur = referentieAuteur;
    }

    // Een constructor met alleen titel en auteur. In dit geval krijgt taal de
    // defaultwaarde “Nederlands”.
    public Boek(String boekTitel, Auteur referentieAuteur) {
        this.boekTitel = boekTitel;
        this.referentieAuteur = referentieAuteur;
    }

    public String print() {
        // Geeft de gegevens van het boek terug
        String strBoekGegevens = boekTitel + " van " + referentieAuteur.getAuteurNaam() + " in het " + boekTaal;
        System.out.println(strBoekGegevens);
        return strBoekGegevens;
    }

    // get and set attribute values
    public String getBoekTitel() {
        return boekTitel;
    }

    public void setBoekTitel(String boekTitel) {
        this.boekTitel = boekTitel;
    }

    public String getBoekTaal() {
        return boekTaal;
    }

    public void setBoekTaal(String boekTaal) {
        this.boekTaal = boekTaal;
    }

    public Auteur getReferentieAuteur() {
        return referentieAuteur;
    }

    public void setReferentieAuteur(Auteur referentieAuteur) {
        this.referentieAuteur = referentieAuteur;
    }
}
