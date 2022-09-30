package bibliotheek;

import java.util.ArrayList;

public class Bibliotheek {

    private ArrayList<Exemplaar> boekenLijst;

    Bibliotheek(String naam) {
        System.out.println(naam + " is geopend!");
        boekenLijst = new ArrayList<Exemplaar>();
    }

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

    public void voegToe(Boek boek) {
        Exemplaar exemplaar = findBoek(boek);
        if (exemplaar == null) {
            exemplaar = new Exemplaar(boek);
        } else {
            exemplaar = new Exemplaar(exemplaar);
        }

        boekenLijst.add(exemplaar);
    }

    public void voegToe(Boek boek, int aantal) {
        int i;

        for (i = 0; i < aantal; i++) {
            voegToe(boek);
        }
    }

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

    public void toonCollectie() {
        int i;
        Boek boek;

        for (i = 0; i < boekenLijst.size(); i++) {
            boek = boekenLijst.get(i).boek;
            System.out.println("exemplaar -> " + boek.titel + " van " + boek.auteur.naam + " in het " + boek.taal);
        }
    }

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

    public void printAuteurs(boolean heeftPrijsGewonnen) {
        for (int i = 0; i < boekenLijst.size(); i++) {
            if (boekenLijst.get(i).boek.auteur.prijs.equals(heeftPrijsGewonnen)) {
                System.out.println(boekenLijst.get(i).boek.auteur.naam);
            }
        }
    }
}
