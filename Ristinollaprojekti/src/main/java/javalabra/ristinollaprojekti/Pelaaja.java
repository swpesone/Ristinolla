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
public class Pelaaja {
    String nimi;
    int merkki;
    
    public Pelaaja(String nimi, int merkki) {
        this. nimi = nimi;
        this.merkki = 0;
    }
    
    public void setNimi(String uusiNimi) {
        this.nimi = uusiNimi;
    }
    
    public void setMerkki(int uusiMerkki) {
        this.merkki = uusiMerkki;
    }
    
      public String getNimi() {
        return this.nimi;
    }
    
    public int getMerkki() {
        return this.merkki;
    }
   
}
