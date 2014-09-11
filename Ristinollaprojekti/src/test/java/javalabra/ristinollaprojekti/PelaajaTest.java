package javalabra.ristinollaprojekti;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class PelaajaTest {
    
   
   
    
    public PelaajaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
     @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   
//     @Test
//     public void hello() {}
     
    @Test
    public void getNimiAntaaOikeanNimen() {
         Pelaaja pelaaja1 = new Pelaaja("saara", 1);
        
        assertEquals("saara", pelaaja1.getNimi());
    }
    
    @Test
    public void getMerkkiAntaaOikeanMerkin() {
        Pelaaja pelaaja2 = new Pelaaja("otto", 0);
        
        assertEquals(0, pelaaja2.getMerkki());
    }
    
//    @Test
//    public void setNimiToimii() {
//        Pelaaja pelaaja3 = new Pelaaja("joku", -1);
//        String uusiNimi = "";
//        assertEquals("uusiNimi", pelaaja3.setNimi(uusiNimi));
//    }
}
