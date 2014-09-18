/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javalabra.ristinollaprojekti;

/**
 *
 * @author Saara
 */
public class Peli {
    Ruudukko ruudut;
    //pelaajat miten?
    
    public Peli(int x, int y, Pelaaja pelaaja1, Pelaaja pelaaja2) {
        this.ruudut = new Ruudukko(x,y);
    }
}
