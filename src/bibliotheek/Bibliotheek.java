package bibliotheek;

import java.util.ArrayList;

/*
 * Deze klasse representeert een Bibliotheek object, 
 */
public class Bibliotheek {

    private ArrayList<Exemplaar> boekenLijst;

    Bibliotheek(String naam) {
        System.out.println(naam + " is geopend!");
        boekenLijst = new ArrayList<Exemplaar>();
    }

    
    /** 
     * Hulp methode voor het zoeken vaan een boek binnen de Bibliotheek arraylist
     * @param boek Boek object waarop de zoekopdracht uitgevoerd wordt
     * @return Exemplaar geeft een Exemplaar object terug.
     */
    private Exemplaar findBoek(Boek boek) {
        int i;
        Exemplaar e;
        for (i = 0; i < boekenLijst.size(); i++) {
            e = boekenLijst.get(i);
            if (e.boek.titel == boek.titel) {
                if (e.boek.auteur.naam == boek.auteur.naam) {
                    if (e.boek.taal == boek.taal)
                        return e;
                }
            }
        }
        return null;
    }

    
    /** 
     * Methode voor het toevoegen van een boek aan de boekenlijst 
     * @param boek Het toe te voegen boek object als parameter
     */
    public void voegToe(Boek boek) {
        Exemplaar exemplaar = findBoek(boek);
        if (exemplaar == null) {
            exemplaar = new Exemplaar(boek);
        } else {
            exemplaar = new Exemplaar(exemplaar);
        }

        boekenLijst.add(exemplaar);
    }

    
    /** 
     * Methode voor het toevoegen van een boek met verschillende aantallen van hetzelfde boek
     * @param boek Het toe te voegen boek object als parameter
     * @param aantal Het aantal boeken welke toegevoegd gaat worden aan de bibliotheek
     */
    public void voegToe(Boek boek, int aantal) {
        int i;

        for (i = 0; i < aantal; i++) {
            voegToe(boek);
        }
    }

    
    /** 
     * Methode voor het printen van alle exemplaren uit de bibliotheek waarvan de taal als zoekwoord wordt gebruikt
     * @param taal Taal parameter van het boek, default is Nederlands
     */
    public void toonCollectie(String taal) {
        int i;
        Boek boek;

        for (i = 0; i < boekenLijst.size(); i++) {
            boek = boekenLijst.get(i).boek;
            if (boekenLijst.get(i).boek.taal.equals(taal)) {
                System.out.println("exemplaar -> " + boek.titel + " van " + boek.auteur.naam + " in het " + boek.taal);
            }
        }
    }

    /**
     * Methode voor het tonen van alle boeken uit de boekenlijst
     */
    public void toonCollectie() {
        int i;
        Boek boek;

        for (i = 0; i < boekenLijst.size(); i++) {
            boek = boekenLijst.get(i).boek;
            System.out.println("exemplaar -> " + boek.titel + " van " + boek.auteur.naam + " in het " + boek.taal);
        }
    }

    
    /** 
     * Methode voor het tellen van de exemplaren van een bepaald boek object
     * @param boek Als parameter van deze methode wordt een boek object meegegeven
     * @return String Het aantal getelde boeken terug gegeven als String 
     */
    public String telExemplaren(Boek boek) {
        int aantal = 0;
        for (int i = 0; i < boekenLijst.size(); i++) {
            if (boekenLijst.get(i).boek.equals(boek)) {
                aantal++;
            }
        }
        String s = String.valueOf(aantal);
        return s;
    }

    
    /** 
     * Methode voor het printen van alle auteurs met wel of niet een prijs op zak 
     * @param heeftPrijsGewonnen Met als parameter een booblean heeft prijs gewonnen
     */
    public void printAuteurs(boolean heeftPrijsGewonnen) {
        for (int i = 0; i < boekenLijst.size(); i++) {
            if (boekenLijst.get(i).boek.auteur.prijs.equals(heeftPrijsGewonnen)) {
                System.out.println(boekenLijst.get(i).boek.auteur.naam);
            }
        }
    }
}
