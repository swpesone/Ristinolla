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
 * Luokka alustaa yhden peliruudukon ruudun
 */
public class Ruutu {

    int merkki;

    public Ruutu() {
        this.merkki = 0;
    }

    public boolean setMerkki(int merkki) {
        if (this.merkki == 0) {
            this.merkki = merkki;
            return true;
        } else {       //jos ei tyhjä ruutu -> ei voi asettaa merkkiä
            return false;
        }
    }

    public int getMerkki() {
        return this.merkki;
    }
}
