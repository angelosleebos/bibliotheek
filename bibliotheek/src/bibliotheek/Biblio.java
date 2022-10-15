package bibliotheek;

public class Biblio {

  public static void main(String[] args) {
    Auteur a1 = new Auteur("Willem Frederik Hermans", true);
    Auteur a2 = new Auteur("Joost Zwagerman", true);
    Auteur a3 = new Auteur("Pieter Aspe", false);
    Auteur a4 = new Auteur("Walter Isaacson", false);

    Boek b1 = new Boek("Nooit meer slapen", "Nederlands", a1);
    Boek b2 = new Boek("Onder professoren", a1);
    Boek b3 = new Boek("De buitenvrouw", a2);
    Boek b4 = new Boek("Het laatste bevel", a3);
    Boek b5 = new Boek("Einstein", "Engels", a4);
    Boek b6 = new Boek("Einstein", "Nederlands", a4);

    Bibliotheek bieb = new Bibliotheek("Gemeentelijke bibliotheek Heerlen");
    System.out.println();

    bieb.voegToe(b1, 3);
    bieb.voegToe(b2);
    bieb.voegToe(b3, 2);
    bieb.voegToe(b4);
    bieb.voegToe(b5, 2);
    bieb.voegToe(b3);

    System.out.println();
    System.out.println("Het assortiment van de bibliotheek bestaat uit:");
    bieb.toonCollectie();
    System.out.println();
    System.out.println("De exemplaren in het Engels zijn:");
    bieb.toonCollectie(new String("Engels"));
    System.out.println();
    System.out.println("Auteurs zonder een prijs zijn:");
    bieb.printAuteurs(false);
    System.out.println();
    System.out.println("Auteurs met een prijs zijn:");
    bieb.printAuteurs(true);
    System.out.println();
    System.out.print("Er zijn " + bieb.telExemplaren(b1) + " exemplaren van ");
    b1.print();
    System.out.print("Er zijn " + bieb.telExemplaren(b5) + " exemplaren van ");
    b5.print();
    System.out.print("Er zijn " + bieb.telExemplaren(b6) + " exemplaren van ");
    b6.print();
  }

}
