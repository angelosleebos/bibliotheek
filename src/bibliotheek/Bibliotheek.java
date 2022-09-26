package bibliotheek;

import java.util.ArrayList;

public class Bibliotheek {
    private String bibliotheekNaam;
    private Boek boek;
    private int aantalExemplaren;
    private ArrayList<Exemplaar> boekenLijst;
    private String boekTitel;
    private String boekTaal;
    private Auteur boekAuteur;
    private Exemplaar exemplaar;
    private Exemplaar exemplaarKopie;
    private Exemplaar exemplaarNieuw;

    // Class constructor for Boek
    // Een constructor met titel, taal, en auteur.
    public Bibliotheek(String bibliotheekNaam) {
        this.bibliotheekNaam = bibliotheekNaam;
        boekenLijst = new ArrayList<Exemplaar>();

        System.out.println(bibliotheekNaam + " is goepend!");
    }

    // Met deze methode wordt één exemplaar van het boek toegevoegd aan de
    // boekenlijst
    public void voegToe(Boek boek) {
        this.boek = boek;
        boekTaal = boek.getBoekTaal();
        boekTitel = boek.getBoekTitel();
        // String boekTaal = boek.getBoekTaal();
        boekAuteur = boek.getReferentieAuteur();

        // Exemplaar exemplaarNieuw = new Exemplaar(boek); // boek
        // Exemplaar exemplaarKopie = new Exemplaar(exemplaar); // exemplaar

        // check elk object in de arraylist of deze bestaat
        for (int i = 0; i < boekenLijst.size(); i++) {
            // checken of naam, taal en auteur boek al bestaat in de boekenlijst
            if (boekenLijst.get(i).getReferentieBoek().getBoekTitel().equals(boekTitel)
                    && boekenLijst.get(i).getReferentieBoek().getReferentieAuteur().equals(boekAuteur)
                    && boekenLijst.get(i).getReferentieBoek().getBoekTaal().equals(boekTaal)) {
                exemplaarKopie = new Exemplaar(boek);
                boekenLijst.add(exemplaarKopie);
            } else {
                // als deze niet bestaat voeg exemplaar toe
                exemplaarNieuw = new Exemplaar(exemplaar);
                boekenLijst.add(exemplaarNieuw);
            }
        }
    }

    // voegt meerdere exemplaren van een boek toe aan een boekenlijst
    public void voegToe(Boek boek, int aantalExemplaren) {
        this.boek = boek;
        this.aantalExemplaren = aantalExemplaren;
        Exemplaar exemplaarMeerdere = new Exemplaar(boek); // exemplaar
        // Geeft de gegevens van het boek terug
        String strBoekGegevens = boekTitel + " van " + boekAuteur + " in het " + boekTaal;
        System.out.println(strBoekGegevens);
        for (int i = 0; i < aantalExemplaren; i++) {
            boekenLijst.add(exemplaarMeerdere);
        }
    }

    public void toonCollectie(String boekTaal) {
        this.boekTaal = boekTaal;
        for (int i = 0; i < boekenLijst.size(); i++) {
            // checken of naam, taal en auteur boek al bestaat in de boekenlijst
            if (boekenLijst.get(i).getReferentieBoek().getBoekTaal().equals(boekTaal)) {
                System.out.println(boekenLijst.get(i).getReferentieBoek().getBoekTitel());
            }
        }
    }

    public void toonCollectie() {
        for (int i = 0; i < boekenLijst.size(); i++) {
            // checken of naam, taal en auteur boek al bestaat in de boekenlijst
            System.out.println(boekenLijst.get(i).getReferentieBoek().getBoekTitel());
        }
    }

    public String telExemplaren(Boek boek) {
        this.boek = boek;
        int aantalExemplarenInDeBieb = 10;
        // for (int i = 0; i < boekenLijst.size(); i++) {
        // // checken of naam, taal en auteur boek al bestaat in de boekenlijst
        // if (boekenLijst.get(i).getReferentieBoek().getBoekTaal().equals(boek)) {
        // aantalExemplarenInDeBieb++;
        // System.out.println(boekenLijst.get(i).getReferentieBoek().getBoekTaal());
        // }
        // }
        String s = String.valueOf(aantalExemplarenInDeBieb);
        return s;
    }

    public void printAuteurs(boolean heeftPrijsGewonnen) {
        // als heeftPrijsGewonnen = true is print alle auteurs welke een prijs heeft
        // gewonnen
        // anders de auteurs die geen prijs hebben gewonnen.
        for (int i = 0; i < boekenLijst.size(); i++) {
            // checken of naam, taal en auteur boek al bestaat in de boekenlijst
            if (boekenLijst.get(i).getReferentieBoek().getReferentieAuteur().heeftPrijsGewonnen() == true) {
                System.out.println(boekenLijst.get(i).getReferentieBoek().getReferentieAuteur().getAuteurNaam());
            } else if(boekenLijst.get(i).getReferentieBoek().getReferentieAuteur().heeftPrijsGewonnen() == false) {
                System.out.println(boekenLijst.get(i).getReferentieBoek().getReferentieAuteur().getAuteurNaam());
            }
        }
    }
}
