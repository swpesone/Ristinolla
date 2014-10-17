/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabra.ristinollaprojekti;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Saara
 */
public class RuudukkoTest {

    Ruudukko ruudukko1;

    public RuudukkoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ruudukko1 = new Ruudukko(3, 3);
    }

    @After
    public void tearDown() {
    }
//
//     TODO add test methods here.
//     The methods must be annotated with annotation @Test. For example:
//    
//     @Test
//     public void hello() {}

    @Test
    public void onkoVoittoaMerkkiUlkopuolellaYPlus() {
        ruudukko1.setMerkki(0, 0, 1);
        ruudukko1.setMerkki(0, 1, 1);
        ruudukko1.setMerkki(0, 2, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(0, 3);

        assertFalse(vastaus);
    }

    @Test
    public void onkoVoittoaMerkkiUlkopuolellaXPlus() {
        ruudukko1.setMerkki(0, 0, 1);
        ruudukko1.setMerkki(0, 1, 1);
        ruudukko1.setMerkki(0, 2, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(3, 0);

        assertFalse(vastaus);
    }

    @Test
    public void onkoVoittoaMerkkiUlkopuolellaYMiinus() {
        ruudukko1.setMerkki(0, 0, 1);
        ruudukko1.setMerkki(0, 1, 1);
        ruudukko1.setMerkki(0, 2, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(0, -1);

        assertFalse(vastaus);
    }

    @Test
    public void onkoVoittoaMerkkiUlkopuolellaXMiinus() {
        ruudukko1.setMerkki(0, 0, 1);
        ruudukko1.setMerkki(0, 1, 1);
        ruudukko1.setMerkki(0, 2, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(-1, 0);

        assertFalse(vastaus);
    }

    @Test
    public void onkoVoittoaSarakkeessa1() {
        ruudukko1.setMerkki(0, 0, 1);
        ruudukko1.setMerkki(0, 1, 1);
        ruudukko1.setMerkki(0, 2, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(0, 1);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaSarakkeessa2() {
        ruudukko1.setMerkki(1, 0, 1);
        ruudukko1.setMerkki(1, 1, 1);
        ruudukko1.setMerkki(1, 2, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(1, 1);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaSarakkeessa3() {
        ruudukko1.setMerkki(2, 0, 1);
        ruudukko1.setMerkki(2, 1, 1);
        ruudukko1.setMerkki(2, 2, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(2, 1);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaRivilla1() {
        ruudukko1.setMerkki(0, 0, 1);
        ruudukko1.setMerkki(1, 0, 1);
        ruudukko1.setMerkki(2, 0, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(1, 0);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaRivilla2() {
        ruudukko1.setMerkki(0, 1, 1);
        ruudukko1.setMerkki(1, 1, 1);
        ruudukko1.setMerkki(2, 1, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(1, 1);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaRivilla3() {
        ruudukko1.setMerkki(0, 2, 1);
        ruudukko1.setMerkki(1, 2, 1);
        ruudukko1.setMerkki(2, 2, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(1, 2);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaLaskevassaDiagonaalissa() {
        ruudukko1.setMerkki(0, 0, 1);
        ruudukko1.setMerkki(1, 1, 1);
        ruudukko1.setMerkki(2, 2, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(1, 1);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaLaskevassaDiagonaalissaYlavas() {
        ruudukko1.setMerkki(0, 0, 1);
        ruudukko1.setMerkki(1, 1, 1);
        ruudukko1.setMerkki(2, 2, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(0, 0);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaLaskevassaDiagonaalissaAlaoik() {
        ruudukko1.setMerkki(0, 0, 1);
        ruudukko1.setMerkki(1, 1, 1);
        ruudukko1.setMerkki(2, 2, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(2, 2);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaNousevassaDiagonaalissa() {
        ruudukko1.setMerkki(0, 2, 1);
        ruudukko1.setMerkki(1, 1, 1);
        ruudukko1.setMerkki(2, 0, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(1, 1);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaNousevassaDiagonaalissaAlavas() {
        ruudukko1.setMerkki(0, 2, 1);
        ruudukko1.setMerkki(1, 1, 1);
        ruudukko1.setMerkki(2, 0, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(0, 2);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaNousevassaDiagonaalissaYlaoik() {
        ruudukko1.setMerkki(0, 2, 1);
        ruudukko1.setMerkki(1, 1, 1);
        ruudukko1.setMerkki(2, 0, 1);

        boolean vastaus = ruudukko1.onkoVoittoa(2, 0);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaOn() {
        ruudukko1.setMerkki(0, 0, 1);
        ruudukko1.setMerkki(1, 0, 2);
        ruudukko1.setMerkki(2, 0, 1);
        ruudukko1.setMerkki(0, 1, 1);
        ruudukko1.setMerkki(1, 1, 1);
        ruudukko1.setMerkki(2, 1, 1);
        ruudukko1.setMerkki(0, 2, 2);
        ruudukko1.setMerkki(1, 2, 1);
        ruudukko1.setMerkki(2, 2, 2);

        boolean vastaus = ruudukko1.onkoVoittoa(1, 1);

        assertTrue(vastaus);
    }

    @Test
    public void onkoVoittoaEi() {
        ruudukko1.setMerkki(0, 0, 1);
        ruudukko1.setMerkki(1, 0, 2);
        ruudukko1.setMerkki(2, 0, 1);
        ruudukko1.setMerkki(0, 1, 1);
        ruudukko1.setMerkki(1, 1, 2);
        ruudukko1.setMerkki(2, 1, 1);
        ruudukko1.setMerkki(0, 2, 2);
        ruudukko1.setMerkki(1, 2, 1);
        ruudukko1.setMerkki(2, 2, 2);

        boolean vastaus = ruudukko1.onkoVoittoa(1, 1);

        assertFalse(vastaus);
    }

    @Test
    public void getMerkkiPalauttaaOikein() {
        ruudukko1.setMerkki(1, 1, 1);

        assertEquals(1, ruudukko1.getMerkki(1, 1));
    }

    @Test
    public void getMerkkiPalauttaaVaarillaArvoilla() {
        ruudukko1.setMerkki(1, 1, 1);

        assertEquals(-2, ruudukko1.getMerkki(-4, 5));
    }
   
}
