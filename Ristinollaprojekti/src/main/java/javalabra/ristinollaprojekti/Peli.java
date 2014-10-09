
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
 * Luokka sisältää pelaajien vuoroihin liittyviä metodeja
 */
public class Peli {

    Ruudukko ruudut;
    Pelaaja pelaaja1;
    Pelaaja pelaaja2;
    Pelaaja vuorossa;

    public Peli(int x, int y, String nimi1, String nimi2) {
        this.ruudut = new Ruudukko(x, y);
        this.pelaaja1 = new Pelaaja(nimi1, 1);
        this.pelaaja2 = new Pelaaja(nimi2, -1);
        this.vuorossa = pelaaja1;
    }

    /**
     * Metodi tarkistaa, kumpi pelaaja on vuorossa ja vaihtaa sitten vuorossa
     * olevan pelaajan
     */
    public void vaihdaVuoro() {
        if (vuorossa.getMerkki() == 1) {
            this.vuorossa = this.pelaaja2;
        } else if (vuorossa.getMerkki() == -1) {
            this.vuorossa = this.pelaaja1;
        }
    }

    /**
     * Metodi käy läpi yhden vuoron ja sen aikana tarvittavat metodit: asettaa
     * oikean merkin, tarkistaa onko voittoa ja jos ei ole, vaihtaa vuoron. Jos
     * on voitto, peli päättyy.
     *
     * @param x ruudun x-koordinaatti
     * @param y ruudun y-koordinaatti
     * @return jos peli ei pääty vuoroon, palautetaan false, jos päättyy,
     * palautetaan true
     */
    public boolean vuoro(int x, int y) {
        if (this.getMerkki(x, y) == 0) {
            System.out.println(vuorossa.getMerkki());
            ruudut.setMerkki(x, y, vuorossa.getMerkki());
            System.out.println(ruudut.getMerkki(x, y));
            if (!ruudut.onkoVoittoa(x, y)) {
                this.vaihdaVuoro();
            } else {
                //käyttöliittymälle tieto voitosta, peli päättyy
                return true;
            }
        }
        return false;
    }

    public int getMerkki(int x, int y) {
        return this.ruudut.getMerkki(x, y);
    }

}
