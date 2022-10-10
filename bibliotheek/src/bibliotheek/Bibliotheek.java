package bibliotheek;

import java.util.ArrayList;

/*
 * Deze klasse representeert een Bibliotheek object, 
 */
public class Bibliotheek {

    private ArrayList<Exemplaar> boekenLijst;

    // public ArrayList<Exemplaar> getBoekenLijst() {
    // return boekenLijst;
    // }

    public Bibliotheek(String naam) {
        System.out.println(naam + " is geopend!");
        boekenLijst = new ArrayList<Exemplaar>();
    }

    /**
     * Hulp methode voor het zoeken vaan een boek binnen de Bibliotheek arraylist
     * 
     * @param boek Boek object waarop de zoekopdracht uitgevoerd wordt
     * @return Exemplaar geeft een Exemplaar object terug.
     */

    private Exemplaar findBoek(Boek boek) {
        for (Exemplaar e : boekenLijst) {
            if (e.getBoek().getTitel().equals(boek.getTitel())) {
                if (e.getBoek().getAuteur().getNaam().equals(boek.getAuteur().getNaam())) {
                    if (e.getBoek().getTaal().equals(boek.getTaal())) {
                        return e;
                    }
                }
            }
        }
        return null;
    }

    // findboek wordt telkens opnieuw aangevraagd voor hetzelfde boek bij meedere
    // aantallen
    private Exemplaar createExemplaar(Boek boek) {
        Exemplaar exemplaar = findBoek(boek);
        if (exemplaar == null) {
            exemplaar = new Exemplaar(boek);
        } else {
            exemplaar = new Exemplaar(exemplaar);
        }
        return exemplaar;
    }

    // TODO: Kan ik van bovenstaande methode 1 methode van maken?

    /**
     * Methode voor het toevoegen van een boek aan de boekenlijst
     * 
     * @param boek Het toe te voegen boek object als parameter
     */
    public void voegToe(Boek boek) {
        boekenLijst.add(createExemplaar(boek));
    }

    /**
     * Methode voor het toevoegen van een boek met verschillende aantallen van
     * hetzelfde boek
     * 
     * @param boek   Het toe te voegen boek object als parameter
     * @param aantal Het aantal boeken welke toegevoegd gaat worden aan de
     *               bibliotheek
     */
    public void voegToe(Boek boek, int aantal) {
        for (int i = 0; i < aantal; i++) {
            boekenLijst.add(createExemplaar(boek));
        }
    }

    /**
     * Methode voor het printen van alle exemplaren uit de bibliotheek waarvan de
     * taal als zoekwoord wordt gebruikt
     * 
     * @param taal Taal parameter van het boek, default is Nederlands
     */
    public void toonCollectie(String taal) {
        for (Exemplaar e : boekenLijst) {
            if (e.getBoek().getTaal().equals(taal)) {
                System.out.print("exemplaar -> ");
                e.getBoek().print();
            }
        }
    }

    /**
     * Methode voor het tonen van alle boeken uit de boekenlijst
     */
    public void toonCollectie() {
        for (Exemplaar e : boekenLijst) {
            System.out.print("exemplaar -> ");
            e.getBoek().print();
        }
    }

    /**
     * Methode voor het tellen van de exemplaren van een bepaald boek object
     * 
     * @param boek Als parameter van deze methode wordt een boek object meegegeven
     * @return String Het aantal getelde boeken terug gegeven als String
     */

    // TODO: Dit klopt dus wel??? "Het tellen van exemplaren gaat niet goed omdat je
    // je niet houdt aan de beschrijving daarvan in de opdracht"
    // TODO: wat gebeurd er als twee verschillende auteurs dezelfde titels
    // gebruiken? -> Werkt prima met optie 1..?
    // TODO: Optie 1
    // public int telExemplaren(Boek boek) {
    // int aantal = 0;
    // for (int i = 0; i < boekenLijst.size(); i++) {
    // if (boekenLijst.get(i).getBoek().equals(boek)) {
    // aantal++;
    // }
    // }
    // return aantal;
    // }

    // TODO: Optie 2

    public int telExemplaren(Boek boek) {
        int aantal = 0;
        for (Exemplaar e : boekenLijst) {
            // for (int i = 0; i < boekenLijst.size(); i++) {
            if (e.getBoek().getTitel().equals(boek.getTitel())) {
                if (e.getBoek().getTaal().equals(boek.getTaal())) {
                    if (e.getBoek().getAuteur().getNaam().equals(boek.getAuteur().getNaam())) {
                        aantal++;
                    }
                }
            }
        }
        return aantal;
    }

    // public int telExemplaren(Boek boek) {
    // int aantal = 0;
    // for (Exemplaar k : boekenLijst){
    // // for (int i = 0; i < boekenLijst.size(); i++) {
    // if (boekenLijst.get().getBoek().getTitel().equals(boek.getTitel())) {
    // if (boekenLijst.get(i).getBoek().getTaal().equals(boek.getTaal())) {
    // if
    // (boekenLijst.get(i).getBoek().getAuteur().getNaam().equals(boek.getAuteur().getNaam()))
    // {
    // aantal++;
    // }
    // }
    // }
    // }
    // return aantal;
    // }

    // TODO: Optie 3:

    // public int telExemplaren(Boek boek) {
    // Exemplaar boektel = findBoek(boek);
    // int aantal = 0;
    // for (int i = 0; i < boekenLijst.size(); i++) {
    // if (boektel.getBoek().equals(boek)) {
    // aantal++;
    // }
    // }
    // return aantal;
    // }

    /**
     * Methode voor het printen van alle auteurs met wel of niet een prijs op zak
     * 
     * @param heeftPrijsGewonnen Met als parameter een booblean heeft prijs gewonnen
     */
    public void printAuteurs(boolean heeftPrijsGewonnen) {
        for (Exemplaar e : boekenLijst) {
            if (e.getBoek().getAuteur().getPrijs().equals(heeftPrijsGewonnen)) {
                System.out.println(e.getBoek().getAuteur().getNaam());
            }
        }
    }

    public void printAuteurs() {
        for (Exemplaar e : boekenLijst) {
            if (e.getBoek().getAuteur().getPrijs().equals(true)) {
                System.out.println(e.getBoek().getAuteur().getNaam());
            }
        }
    }
}
