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

    int[][] ruudut = {{0, 0, 0},
    {0, 0, 0},
    {0, 0, 0}};

    public Ruudukko() {
//        int[] rivi1 = ruudut[0];
//        int[] rivi2 = ruudut[1];
//        int[] rivi3 = ruudut[2];
        //int ruutu = ruudut[int x][int y]; 
    }
    
    public int getMerkki(int x, int y) {
        return ruudut[x][y];
    }

    public void setMerkkiRistiksi(int x, int y) {
        ruudut[x][y] = 1;
    }

    public void setMerkkiNollaksi(int x, int y) {
        ruudut[x][y] = -1;
    }

    // diagonaali alavasemmalta ylös : (x,y), x ja y aluksi nollia, x++ ja y++
    // diagonaali ylävasemmalta alas: (y,y), x=0 ja y=3, x++ ja y--;
    // rivi: 
    //sarake: 

}
