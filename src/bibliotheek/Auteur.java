package bibliotheek;

public class Auteur {
    private String auteurNaam;
    private boolean prijsGewonnen;
    // Deze klasse representeert een auteur. Van een auteur wordt de naam vastgelegd
    // en of deze auteur ooit een literaire prijs heeft gewonnen.
    // String auteurNaam
    // Boolean LiterairePrijsGewonnen

    public String getAuteurNaam() {
        return auteurNaam;
    }

    public void setAuteurNaam(String auteurNaam) {
        this.auteurNaam = auteurNaam;
    }

    public boolean heeftPrijsGewonnen() {
        return prijsGewonnen;
    }

    public void setPrijsGewonnen(boolean prijsGewonnen) {
        this.prijsGewonnen = prijsGewonnen;
    }

    public Auteur(String auteurNaam, boolean prijsGewonnen) {
        this.auteurNaam = auteurNaam;
        this.prijsGewonnen = prijsGewonnen;
    }
}
