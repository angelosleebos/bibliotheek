package bibliotheek;

public class Exemplaar {
    private String exemplaarInfo;
    private String kopieExemplaarInfo;
    private Exemplaar referentieExemplaar = null;
    Boek referentieBoek;

    public Exemplaar(Boek referentieBoek) {
        this.referentieBoek = referentieBoek;
        String strReferentieBoek = referentieBoek.print();
        exemplaarInfo = "nieuw exemplaar -> " + " " + strReferentieBoek;
        System.out.println(exemplaarInfo);
    }

    public Exemplaar(Exemplaar referentieExemplaar) {
        this.referentieExemplaar = referentieExemplaar;
        String exemplaarInfo = referentieExemplaar.print();
        kopieExemplaarInfo = "Kopie van exemplaar -> " + " " + exemplaarInfo;
        System.out.println(kopieExemplaarInfo);
    }

    public String print() {
        // Geeft de gegevens van het boek terug
        String strBoekGegevens = "exemplaar -> " + " " + exemplaarInfo;
        System.out.println(strBoekGegevens);
        return strBoekGegevens;
    }

    // voor het ophalen van gegevens van de klasse exemplaar.
    public String getExemplaarInfo() {
        return exemplaarInfo;
    }

    public void setExemplaarInfo(String exemplaarInfo) {
        this.exemplaarInfo = exemplaarInfo;
    }

    public String getKopieExemplaarInfo() {
        return kopieExemplaarInfo;
    }

    public void setKopieExemplaarInfo(String kopieExemplaarInfo) {
        this.kopieExemplaarInfo = kopieExemplaarInfo;
    }

    public Exemplaar getReferentieExemplaar() {
        return referentieExemplaar;
    }

    public void setReferentieExemplaar(Exemplaar referentieExemplaar) {
        this.referentieExemplaar = referentieExemplaar;
    }

    public Boek getReferentieBoek() {
        return referentieBoek;
    }

    public void setReferentieBoek(Boek referentieBoek) {
        this.referentieBoek = referentieBoek;
    }
}
