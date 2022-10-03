package bibliotheek;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Test class voor het testen van de methode telExemplaren
 */

public class BibliotheekTest {
	Bibliotheek biebtest = new Bibliotheek("Gemeentelijke bibliotheek Heerlen");
	Auteur a1 = new Auteur("Willem Frederik Hermans", true);
	Auteur a4 = new Auteur("Walter Isaacson", false);
	Boek b1 = new Boek("Nooit meer slapen", "Nederlands", a1);
    Boek b5 = new Boek("Einstein", "Engels", a4);
    Boek b6 = new Boek("Einstein", "Nederlands", a4);

	@Test
	public void test1() {
		biebtest.voegToe(b1, 3);
		assertEquals("3", biebtest.telExemplaren(b1) );
	} 

	@Test
	public void test2() {
		biebtest.voegToe(b5, 10);
		assertEquals("10", biebtest.telExemplaren(b5) );
	} 

	@Test
	public void test3() {
		biebtest.voegToe(b6, 4);
		assertEquals("4", biebtest.telExemplaren(b6) );
	}    
}
