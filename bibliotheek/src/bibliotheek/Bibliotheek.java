package bibliotheek;

import java.util.ArrayList;

/*
 * Klasse die verantwoordelijk is voor het beheer van boeken
 */
public class Bibliotheek {

    private ArrayList<Exemplaar> boekenlijst = new ArrayList<>();

    /**
     * Bibliotheek constructor met gegeven naam van de bibliotheek
     * 
     * @param naam van de Bibliotheek
     */
    public Bibliotheek(String naam) {
        System.out.println(naam + " is geopend!");
    }

    /**
     * Methode voor het toevoegen van een boek aan de boekenlijst
     * 
     * @param boek Het toe te voegen boek object als parameter
     */
    public void voegToe(Boek boek) {
        Exemplaar exemplaar = createExemplaar(boek);
        boekenlijst.add(exemplaar);
    }

    /**
     * Methode voor het toevoegen van een boek met verschillende aantallen van
     * hetzelfde boek
     * 
     * @param boek   Het toe te voegen boek object
     * @param aantal Het aantal boeken welke toegevoegd gaat worden aan de
     *               bibliotheek
     */
    public void voegToe(Boek boek, int aantal) {
        for (int i = 0; i < aantal; i++) {
            Exemplaar exemplaar = createExemplaar(boek);
            boekenlijst.add(exemplaar);
        }
    }

    /**
     * Hulpmethode voor het toevoegen van een nieuw of een kopie van exemplaar van
     * een boek
     * 
     * @param boek boek met boekobjecten
     * @return het aangemaakte exemplaar of een kopie daarvan.
     */
    private Exemplaar createExemplaar(Boek boek) {
        Exemplaar exemplaar = null;
        Exemplaar gevondenExemplaar = findBoek(boek);

        // Creëert een nieuw Exemplaar op basis van een Boek of Exemplaar object
        if (gevondenExemplaar == null) {
            exemplaar = new Exemplaar(boek);
        } else {
            exemplaar = new Exemplaar(gevondenExemplaar);
        }
        return exemplaar;
    }

    /**
     * Hulpmethode voor het vinden van een boek in de boekenlijst
     * 
     * @param boek het boek wat opgezocht diend te worden
     * @return gevondenExemplaar Het exemplaar dat is gevonden in de boekenlijst
     */
    private Exemplaar findBoek(Boek boek) {
        Boek gevondenBoek = null;
        Exemplaar gevondenExemplaar = null;

        String titel = boek.getTitel();
        String taal = boek.getTaal();
        Auteur auteur = boek.getAuteur();

        for (Exemplaar e : boekenlijst) {
            gevondenBoek = e.getBoek();
            if (gevondenBoek.getTitel().equals(titel)) {
                if (gevondenBoek.getTaal().equals(taal)) {
                    if (gevondenBoek.getAuteur().equals(auteur)) {
                        gevondenExemplaar = e;
                    }
                }
            }
        }
        return gevondenExemplaar;
    }

    /**
     * Toont de collectie waarvan de boeken in een bepaalde taal zijn geschreven
     * 
     * @param taal String de taal van het boek, default is Nederlands
     */
    public void toonCollectie(String taal) {
        for (Exemplaar e : boekenlijst) {
            Boek boek = e.getBoek();
            if (boek.getTaal().equals(taal)) {
                System.out.print("exemplaar -> ");
                boek.print();
            }
        }
    }

    /**
     * Toont alle boeken uit de boekenlijst / bibliotheek
     */
    public void toonCollectie() {
        for (Exemplaar e : boekenlijst) {
            Boek boek = e.getBoek();
            System.out.print("exemplaar -> ");
            boek.print();
        }
    }

    /**
     * Telt alle exemplaren van een bepaalde boek
     * 
     * @param boek Boek van deze methode wordt een boek object meegegeven
     * @return int aantal boeken
     */

    public int telExemplaren(Boek boek) {
        int aantal = 0;
        Boek gevondenBoek = null;
        String titel = boek.getTitel();
        String taal = boek.getTaal();
        Auteur auteur = boek.getAuteur();

        for (Exemplaar e : boekenlijst) {
            gevondenBoek = e.getBoek();
            if (gevondenBoek.getTitel().equals(titel)) {
                if (gevondenBoek.getTaal().equals(taal)) {
                    if (gevondenBoek.getAuteur().equals(auteur)) {
                        aantal++;
                    }
                }
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
            Auteur auteur = e.getBoek().getAuteur();
            String auteurNaam = auteur.getNaam();
            if (auteur.getPrijs().equals(heeftPrijsGewonnen)) {
                System.out.println(auteurNaam);
            }
        }
    }

    /**
     * Geeft alle auteurs aanwezig in een bibliotheek met een prijs op zak
     */
    public void printAuteurs() {
        for (Exemplaar e : boekenlijst) {
            Auteur auteur = e.getBoek().getAuteur();
            String auteurNaam = auteur.getNaam();
            if (auteur.getPrijs().equals(true)) {
                System.out.println(auteurNaam);
            }
        }
    }
}
