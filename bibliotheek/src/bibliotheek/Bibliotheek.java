package bibliotheek;

import java.util.ArrayList;

/*
 * Klasse die verantwoordelijk is voor het beheer van boeken
 */
public class Bibliotheek {

    private ArrayList<Exemplaar> boekenlijst = new ArrayList<>();

    public Bibliotheek(String naam) {
        System.out.println(naam + " is geopend!");
    }

    /**
     * Hulp methode voor het zoeken vaan een boek binnen de Bibliotheek arraylist
     * 
     * @param boek Boek object waarop de zoekopdracht uitgevoerd wordt
     * @return Exemplaar geeft een Exemplaar object terug als deze gevonden is, zo
     *         niet geeft het null terug.
     */
    private Exemplaar findBoek(Boek boek) {
        for (Exemplaar e : boekenlijst) {
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

    /**
     * Hulpmethode voor het toevoegen van een nieuw of een kopie van exemplaar van
     * een boek
     * 
     * @param boek boek met boekobjecten
     * @return het aangemaakte exemplaar of een kopie daarvan.
     */
    private Exemplaar createExemplaar(Boek boek) {
        Exemplaar exemplaar = findBoek(boek);
        if (exemplaar == null) {
            exemplaar = new Exemplaar(boek);
        } else {
            exemplaar = new Exemplaar(exemplaar);
        }
        return exemplaar;
    }

    /**
     * Methode voor het toevoegen van een boek aan de boekenlijst
     * 
     * @param boek Het toe te voegen boek object als parameter
     */
    public void voegToe(Boek boek) {
        boekenlijst.add(createExemplaar(boek));
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
            boekenlijst.add(createExemplaar(boek));
        }
    }

    /**
     * Toont de collectie waarvan de boeken in een bepaalde taal zijn geschreven
     * 
     * @param taal String de taal van het boek, default is Nederlands
     */
    public void toonCollectie(String taal) {
        for (Exemplaar e : boekenlijst) {
            if (e.getBoek().getTaal().equals(taal)) {
                System.out.print("exemplaar -> ");
                e.getBoek().print();
            }
        }
    }

    /**
     * Toont alle boeken uit de boekenlijst / bibliotheek
     */
    public void toonCollectie() {
        for (Exemplaar e : boekenlijst) {
            System.out.print("exemplaar -> ");
            e.getBoek().print();
        }
    }

    /**
     * Telt alle exemplaren van een bepaalde boek
     * 
     * @param boek boek parameter van deze methode wordt een boek object meegegeven
     * @return int aantal boeken
     */

    // TODO: Welke van de onderstaande 3 oplossingen zijn het beste
    public int telExemplaren1(Boek boek) {
        int aantal = 0;
        for (Exemplaar e : boekenlijst) {
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

    public int telExemplaren2(Boek boek) {
        int aantal = 0;
        Boek b = null;
        for (Exemplaar e : boekenlijst) {
            b = e.getBoek();
            String titel = b.getTitel();
            String taal = b.getTaal();
            Auteur auteur = b.getAuteur();
            if (titel.equals(boek.getTitel())) {
                if (taal.equals(boek.getTaal())) {
                    if (auteur.equals(boek.getAuteur())) {
                        aantal++;
                    }
                }
            }
        }
        return aantal;
    }

    public int telExemplaren3(Boek boek) {
        int aantal = 0;
        Boek b = null;
        for (Exemplaar e : boekenlijst) {
            b = e.getBoek();
            if (b.equals(boek)) {
                aantal++;
            }
        }
        return aantal;
    }

    /**
     * Geeft de auteurs die wel of niet een prijs op zak hebben
     * 
     * @param heeftPrijsGewonnen een booblean of een auteur wel of geen prijs heeft
     *                           gewonnen
     */
    public void printAuteurs(boolean heeftPrijsGewonnen) {
        for (Exemplaar e : boekenlijst) {
            String auteurNaam = e.getBoek().getAuteur().getNaam();
            if (e.getBoek().getAuteur().getPrijs().equals(heeftPrijsGewonnen)) {
                System.out.println(auteurNaam);
            }
        }
    }

    /**
     * Geeft alle auteurs aanwezig in een bibliotheek met een prijs op zak
     */
    public void printAuteurs() {
        for (Exemplaar e : boekenlijst) {
            if (e.getBoek().getAuteur().getPrijs().equals(true)) {
                System.out.println(e.getBoek().getAuteur().getNaam());
            }
        }
    }
}
