package test;

import bibliotheek.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Test class voor het testen van de methode telExemplaren
 */

public class BibliotheekTest {
	Bibliotheek biebtest = new Bibliotheek("Heerlen");
	Bibliotheek biebleeg = new Bibliotheek("lege bibliotheek");

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

	/**
	 * Testen van telexemplaren waarbij er een aantal is meegeven bij het toevoegen
	 * van een boek
	 */
	@Test
	public void test1() {
		biebtest.voegToe(b1, 3);
		assertEquals(3, biebtest.telExemplaren(b1));
	}

	/**
	 * Testen van telexemplaren waarbij er een aantal is meegeven bij het toevoegen
	 * van een boek
	 */
	@Test
	public void test2() {
		biebtest.voegToe(b5, 10);
		assertEquals(10, biebtest.telExemplaren(b5));
	}

	/**
	 * Testen van telexemplaren waarbij er een aantal is meegeven bij het toevoegen
	 * van een boek
	 */
	@Test
	public void test3() {
		biebtest.voegToe(b6, 4);
		assertEquals(4, biebtest.telExemplaren(b6));
	}

	/**
	 * Testen van telexemplaren waarbij er een enkele exemplaar meerdere keren zijn
	 * toegevoegd
	 */
	@Test
	public void test4() {
		biebtest.voegToe(b6);
		biebtest.voegToe(b6);
		biebtest.voegToe(b6);
		biebtest.voegToe(b6);
		assertEquals(4, biebtest.telExemplaren(b6));
	}

	/**
	 * Testen van een boek dat niet aanwezig is in de bibliotheek met verschillende
	 * boeken
	 */
	@Test
	public void test5() {
		biebtest.voegToe(b1, 3);
		biebtest.voegToe(b2, 2);
		biebtest.voegToe(b3, 1);
		assertEquals(0, biebtest.telExemplaren(b4));
	}

	/**
	 * telt een boek object waarvan de taal verschilt
	 */
	@Test
	public void test6() {
		biebtest.voegToe(b5, 3);
		biebtest.voegToe(b6, 4);
		assertEquals(4, biebtest.telExemplaren(b6));
	}

	/**
	 * Testen van een lege bibliotheek
	 */
	@Test
	public void test7() {
		assertEquals(0, biebtest.telExemplaren(b3));
	}

	/**
	 * Test waarbij de exemplaren niet allemaal achterelkaar geplaats zijn in de
	 * bieb
	 */
	@Test
	public void test8() {
		biebtest.voegToe(b1, 2); // Nooit meer slapen
		biebtest.voegToe(b2, 2); // Onder professoren
		biebtest.voegToe(b1, 3); // Nooit meer slapen
		biebtest.voegToe(b4, 2); // Het laatste bevel
		biebtest.voegToe(b2, 3); // Onder professoren
		biebtest.voegToe(b1); // Nooit meer slapen
		assertEquals(6, biebtest.telExemplaren(b1));

	}
}
