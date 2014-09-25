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

/**
 * Luokka sisältää tiedot pelaajista
 */

public class Pelaaja {

    String nimi;
    int merkki;

    public Pelaaja(String nimi, int merkki) {
        this.nimi = "";
        this.merkki = 0;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setMerkki(int merkki) {
        this.merkki = merkki;
    }

    public int getMerkki() {
        return this.merkki;
    }

}
