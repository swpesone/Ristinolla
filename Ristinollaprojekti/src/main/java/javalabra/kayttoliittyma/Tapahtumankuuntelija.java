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

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!this.peli.vuoro(i, j)) {
            //System.out.println("nappia painettu");
            //System.out.println(this.peli.getMerkki(i, j));
            //peli ei pääty, vaihda napin merkki
            if (this.peli.getMerkki(i, j) == 1) {
                nappi.setText("X");
            } else if (this.peli.getMerkki(i, j) == -1) {
                nappi.setText("0");
            }
            nappi.repaint();
        } else {
            //peli päättyy

        }
    }

}

//        JButton painettu = (JButton) ae.getSource();
//       if () {
//            painettu.setText("x");
//        } else {
//            painettu.setText("0");
//        }
