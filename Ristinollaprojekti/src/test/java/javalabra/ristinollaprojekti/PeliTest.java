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
    Ruudukko ruudukko1;

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
        ruudukko1 = new Ruudukko(3, 3);
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
    public void vaihdaVuoroVaihtaaOikein() {
        peli1.vaihdaVuoro();
        
    }

    @Test
    public void vuoroToimii() {
        
    }
    
//    @Test
//    public void onkoOhiOn() {
//        ruudukko1.setMerkki(0, 0, 1);
//        ruudukko1.setMerkki(1, 0, 2);
//        ruudukko1.setMerkki(2, 0, 1);
//        ruudukko1.setMerkki(0, 1, 1);
//        ruudukko1.setMerkki(1, 1, 2);
//        ruudukko1.setMerkki(2, 1, 1);
//        ruudukko1.setMerkki(0, 2, 2);
//        ruudukko1.setMerkki(1, 2, 1);
//        ruudukko1.setMerkki(2, 2, 2);
//        
//        boolean vastaus = peli1.onkoOhi();
//        
//        assertTrue(vastaus);
//        
//    }
    
    @Test
    public void onkoOhiEi() {
        ruudukko1.setMerkki(0, 0, 0);
        ruudukko1.setMerkki(1, 0, 0);
        ruudukko1.setMerkki(2, 0, 0);
        ruudukko1.setMerkki(0, 1, 1);
        ruudukko1.setMerkki(1, 1, 2);
        ruudukko1.setMerkki(2, 1, 1);
        ruudukko1.setMerkki(0, 2, 2);
        ruudukko1.setMerkki(1, 2, 1);
        ruudukko1.setMerkki(2, 2, 2);
        
        boolean vastaus = peli1.onkoOhi();
        
        assertFalse(vastaus);
        
    }

}
