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
 * Luokka toimii ristinollapelin ruudukkona eli pelilautana
 */
public class Ruudukko {

    Ruutu[][] ruudut;
    int x;
    int y;

    public Ruudukko(int x, int y) {
        this.x = x;
        this.y = y;
        this.ruudut = new Ruutu[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                this.ruudut[i][j] = new Ruutu(); //ruutu on aluksi 0
            }
        }
    }

  
    public int getMerkki(int x, int y) {
        if (0 <= x && x < this.x && 0 <= y && y < this.y) {
            return this.ruudut[x][y].getMerkki();
        }
        return -2;
    }
    
      public boolean setMerkki(int x, int y, int merkki) {
        if (0 <= x && x < this.x && 0 <= y && y < this.y) {
            return this.ruudut[x][y].setMerkki(merkki);
        }
        return false;
    }


    /**
     * Metodi tarkistaa jokaisen merkin asettamisen jälkeen, onko jollain
     * rivillä, sarakkeessa tai diagonaalissa voittoa.
     *
     * @param x merkin x-koordinaatti, kertoo missä kohdassa ruudukkoa merkki on
     * leveyssuunnassa
     *
     * @param y merkin y-koordinaatti, kertoo missä kohdassa ruudukkoa merkki on
     * pystysuunnassa
     *
     * @return palauttaa false jos ei ole voittoa, true jos on voitto
     */
    public boolean onkoVoittoa(int x, int y) {
        if (!(0 <= x && x < this.x && 0 <= y && y < this.y)) { //jos menee yli ruudukon -> false
            return false;
        }
        //vaakarivi
        for (int i = 0; i < 3; i++) {
            if (this.getMerkki(i, y) == this.getMerkki(x, y)) {
                if (i == 2) {          //jos päästään indeksin 2 samalla merkillä -> voitto
                    return true;
                }
            } else {
                break;  //jos rivillä eri merkki, katkaistaan
            }
        }
        //pystyrivi
        for (int i = 0; i < 3; i++) {
            if (this.getMerkki(x, i) == this.getMerkki(x, y)) {
                if (i == 2) {
                    return true;
                }
            } else {
                break;
            }
        }
        //laskeva diagonaali 
        for (int j = 0; j < 3; j++) {
            if (this.getMerkki(j, j) == this.getMerkki(x, y)) {
                if (j == 2) {
                    return true;
                }
            } else {
                break;
            }
        }
        //nouseva diagonaali
        for (int k = 2; k >= 0; k--) {
            if (this.getMerkki(k, 2 - k) == this.getMerkki(x, y)) {
                if (k == 0) {
                    return true;
                }
            } else {
                break;
            }
        }
        return false;

    }
}
