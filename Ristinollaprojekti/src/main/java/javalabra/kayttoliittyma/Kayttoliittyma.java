/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabra.kayttoliittyma;

/**
 *
 * @author Saara
 */
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javalabra.ristinollaprojekti.Peli;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Peli peli;

    public Kayttoliittyma() {
    }

    @Override
    public void run() {
        frame = new JFrame("Ristinolla");
        frame.setPreferredSize(new Dimension(500, 500));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.peli = new Peli(3, 3, "nimi1", "nimi2");
        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * Metodi tekee 3x3-layoutin, ruutuihin JButtonit ja asettaa niille 
     * tapahtumankuuntelijat
     */
    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(3, 3);
        container.setLayout(layout);

        JButton[][] napit = new JButton[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton nappi = new JButton("");
                napit[i][j] = nappi;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Tapahtumankuuntelija kuuntelija = new Tapahtumankuuntelija(peli, napit[i][j], i, j);
                napit[i][j].addActionListener(kuuntelija);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                container.add(napit[i][j]);
            }
        }
    }

    public JFrame getFrame() {
        return frame;
    }

}
