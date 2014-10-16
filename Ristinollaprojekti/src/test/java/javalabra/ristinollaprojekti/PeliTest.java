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
public class PeliTest {

    Peli peli1;

    public PeliTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        peli1 = new Peli(3, 3, "eka", "toka");

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
    }

    @Test
    public void vuoroEiTyhjaRuutuEiVoiAsettaa() {
        this.peli1.getRuudut().setMerkki(0, 0, 1);
        this.peli1.getRuudut().setMerkki(1, 0, 1);
        this.peli1.getRuudut().setMerkki(2, 0, 2);
        this.peli1.getRuudut().setMerkki(0, 1, 2);
        this.peli1.getRuudut().setMerkki(1, 1, 1);
        this.peli1.getRuudut().setMerkki(2, 1, 1);
        this.peli1.getRuudut().setMerkki(0, 2, 1);
        this.peli1.getRuudut().setMerkki(1, 2, 2);
        this.peli1.getRuudut().setMerkki(2, 2, 2);

        boolean vastaus = this.peli1.vuoro(2, 2);

        assertFalse(vastaus);
    }

    @Test
    public void vuoroTyhja() {
        this.peli1.getRuudut().setMerkki(0, 0, 1);
        this.peli1.getRuudut().setMerkki(1, 0, 1);
        this.peli1.getRuudut().setMerkki(2, 0, 2);
        this.peli1.getRuudut().setMerkki(0, 1, 2);
        this.peli1.getRuudut().setMerkki(1, 1, 1);
        this.peli1.getRuudut().setMerkki(2, 1, 1);
        this.peli1.getRuudut().setMerkki(0, 2, 1);
        this.peli1.getRuudut().setMerkki(1, 2, 2);
        this.peli1.getRuudut().setMerkki(2, 2, 0);

        boolean vastaus = this.peli1.vuoro(2, 2);

        assertTrue(vastaus);
    }
     @Test
    public void vuoroTyhjaTuleeVoitto() {
        this.peli1.getRuudut().setMerkki(0, 0, 1);
        this.peli1.getRuudut().setMerkki(1, 0, 1);
        this.peli1.getRuudut().setMerkki(2, 0, 2);
        this.peli1.getRuudut().setMerkki(0, 1, 2);
        this.peli1.getRuudut().setMerkki(1, 1, 1);
        this.peli1.getRuudut().setMerkki(2, 1, 1);
        this.peli1.getRuudut().setMerkki(0, 2, 1);
        this.peli1.getRuudut().setMerkki(1, 2, 2);
        this.peli1.getRuudut().setMerkki(2, 2, 1);

        boolean vastaus = this.peli1.vuoro(2, 2);

        assertFalse(vastaus);
    }

    @Test
    public void vaihdaVuoroVaihtaaPelaajan1() {
        //Pelaaja vuorossa = this.peli1.pelaaja1;
        peli1.vaihdaVuoro();

        assertEquals(this.peli1.pelaaja2, peli1.getPelaaja());
    }

    @Test
    public void vaihdaVuoroVaihtaaPelaajanKahdesti() {
        Pelaaja vuorossa = this.peli1.pelaaja1;
        peli1.vaihdaVuoro();
        peli1.vaihdaVuoro();
        assertEquals(vuorossa, peli1.getPelaaja());
    }

    @Test
    public void vaihdaVuoroVaihtaaPelaajan2() {
        Pelaaja vuorossa = this.peli1.pelaaja2;
        peli1.vaihdaVuoro();

        assertEquals(vuorossa, peli1.getPelaaja());
    }

    @Test
    public void onkoTyhjiaEi() {
        this.peli1.getRuudut().setMerkki(0, 0, 1);
        this.peli1.getRuudut().setMerkki(1, 0, 1);
        this.peli1.getRuudut().setMerkki(2, 0, 2);
        this.peli1.getRuudut().setMerkki(0, 1, 2);
        this.peli1.getRuudut().setMerkki(1, 1, 1);
        this.peli1.getRuudut().setMerkki(2, 1, 1);
        this.peli1.getRuudut().setMerkki(0, 2, 1);
        this.peli1.getRuudut().setMerkki(1, 2, 2);
        this.peli1.getRuudut().setMerkki(2, 2, 2);

        boolean vastaus = peli1.onkoTyhjia();

        assertFalse(vastaus);

    }

    @Test
    public void onkoTyhjiaOn() {
        this.peli1.getRuudut().setMerkki(0, 0, 0);
        this.peli1.getRuudut().setMerkki(1, 0, 0);
        this.peli1.getRuudut().setMerkki(2, 0, 0);
        this.peli1.getRuudut().setMerkki(0, 1, 1);
        this.peli1.getRuudut().setMerkki(1, 1, 2);
        this.peli1.getRuudut().setMerkki(2, 1, 1);
        this.peli1.getRuudut().setMerkki(0, 2, 2);
        this.peli1.getRuudut().setMerkki(1, 2, 1);
        this.peli1.getRuudut().setMerkki(2, 2, 2);

        boolean vastaus = peli1.onkoTyhjia();

        assertTrue(vastaus);

    }

    @Test
    public void onkoTyhjiaKaikki() {
        this.peli1.getRuudut().setMerkki(0, 0, 0);
        this.peli1.getRuudut().setMerkki(1, 0, 0);
        this.peli1.getRuudut().setMerkki(2, 0, 0);
        this.peli1.getRuudut().setMerkki(0, 1, 0);
        this.peli1.getRuudut().setMerkki(1, 1, 0);
        this.peli1.getRuudut().setMerkki(2, 1, 0);
        this.peli1.getRuudut().setMerkki(0, 2, 0);
        this.peli1.getRuudut().setMerkki(1, 2, 0);
        this.peli1.getRuudut().setMerkki(2, 2, 0);

        boolean vastaus = peli1.onkoTyhjia();

        assertTrue(vastaus);
    }

    @Test
    public void onkoTyhjiaYksi() {
        this.peli1.getRuudut().setMerkki(0, 0, 1);
        this.peli1.getRuudut().setMerkki(1, 0, 1);
        this.peli1.getRuudut().setMerkki(2, 0, 2);
        this.peli1.getRuudut().setMerkki(0, 1, 2);
        this.peli1.getRuudut().setMerkki(1, 1, 2);
        this.peli1.getRuudut().setMerkki(2, 1, 1);
        this.peli1.getRuudut().setMerkki(0, 2, 1);
        this.peli1.getRuudut().setMerkki(1, 2, 2);
        this.peli1.getRuudut().setMerkki(2, 2, 0);

        boolean vastaus = peli1.onkoTyhjia();

        assertTrue(vastaus);

    }

}
