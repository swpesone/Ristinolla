
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
 * Luokka sisältää pelaajien vuoroihin liittyviä ja voitontarkistukseen
 * tapahtumankuuntelijassa tarvittavia metodeja
 */
public class Peli {

    Ruudukko ruudut;
    Pelaaja pelaaja1;
    Pelaaja pelaaja2;
    Pelaaja vuorossa;

    public Peli(int x, int y, String nimi1, String nimi2) {
        this.ruudut = new Ruudukko(x, y);
        this.pelaaja1 = new Pelaaja(nimi1, 1);
        this.pelaaja2 = new Pelaaja(nimi2, 2);
        this.vuorossa = pelaaja1;
    }

    public int getMerkki(int x, int y) {
        return this.ruudut.getMerkki(x, y);
    }

    public Ruudukko getRuudut() {
        return this.ruudut;
    }

    public Pelaaja getPelaaja() {
        return this.vuorossa;
    }

    public Pelaaja getPelaaja2() {
        return this.pelaaja2;
    }

    /**
     * Metodi tarkistaa, kumpi pelaaja on vuorossa, ja vaihtaa sitten vuorossa
     * olevan pelaajan
     */
    public void vaihdaVuoro() {
        if (vuorossa.getMerkki() == 1) {
            this.vuorossa = this.pelaaja2;
        } else {
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
            ruudut.setMerkki(x, y, vuorossa.getMerkki());
            if (!ruudut.onkoVoittoa(x, y)) {
                this.vaihdaVuoro();
            } else {   
                //käyttöliittymälle tieto voitosta, peli päättyy
                return true;
            }
        }
        return false;
    }

    /**
     * Metodi tarkistaa, onko ruudukossa vielä tyhjiä ruutuja, joihin ei ole
     * asetettu merkkiä, jäljellä
     *
     * @return palauttaa true, jos tyhjiä ruutuja on jäljellä ja false, jos
     * tyhjiä ruutuja ei ole jäljellä
     */
    public boolean onkoTyhjia() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ruudut.getMerkki(i, j) == 0) {
                    return true;
                }
            }
        }
        return false;

    }

}
