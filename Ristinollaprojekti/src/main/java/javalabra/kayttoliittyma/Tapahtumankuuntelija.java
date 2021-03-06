   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabra.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javalabra.ristinollaprojekti.Peli;
import javax.swing.*;

/**
 *
 * @author Saara
 */
public class Tapahtumankuuntelija implements ActionListener {

    private Peli peli;
    private JButton nappi;
    private int i;
    private int j;

    public Tapahtumankuuntelija(Peli peli, JButton nappi, int i, int j) {
        this.peli = peli;
        this.nappi = nappi;
        this.i = i;
        this.j = j;
    }

    /**
     * Metodi muuttaa pelilaudan tyhjän ruudun joko ristiksi tai nollaksi
     */
    public void muutaNappi() {
        if (this.peli.getMerkki(i, j) == 1) {
            nappi.setText("X");
        } else if (this.peli.getMerkki(i, j) == 2) {
            nappi.setText("0");
        }
        nappi.repaint();
    }

    /**
     * Metodi muuttaa pelilaudan merkit oikeassa kohdassa ja näyttää sopivan
     * popup-ikkunan pelin päättyessä
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        //jos ei ole voittoa
        if (!this.peli.vuoro(i, j)) {
            //jos peli ei ole ohi
            if (peli.onkoTyhjia()) {
                //peli ei pääty, vaihda napin merkki:
                this.muutaNappi();
                //jos peli on ohi    
            } else {
                this.muutaNappi();
                JOptionPane.showMessageDialog(null, "Ei voittoa", "Peli päättyi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            //jos on voitto    
        } else {
            //peli on ohi
            System.out.println("nappia painettu");
            this.muutaNappi();
            JOptionPane.showMessageDialog(null, "Voittaja: " + peli.getMerkki(i, j)
                    + ". pelaaja", "Peli päättyi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
