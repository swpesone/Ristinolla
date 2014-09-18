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
public class Ruudukko {

    Ruutu[][] ruudut;
    int x;
    int y;

    public Ruudukko(int x, int y) {
        this.x = 3;
        this.y = 3;
        this.ruudut = new Ruutu[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                this.ruudut[i][j] = new Ruutu(); //ruutu on aluksi 0
            }
        }
    }
    
    public boolean setMerkki(int x, int y, int merkki) {
        if (0 <= x && x < this.x && 0 <= y && y < this.y) { //miten < ja <= ?
            return this.ruudut[x][y].setMerkki(merkki);
        }
        return false;
    }

    public int getMerkki(int x, int y) {
        if (0 <= x && x < this.x && 0 <= y && y < this.y) {
            return this.ruudut[x][y].getMerkki();
        }
        return 0;
    }
}
