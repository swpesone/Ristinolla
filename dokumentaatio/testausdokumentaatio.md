Testeistä:

Kohtalaisen kokemattomana jUnit-testaajana käytin usein toimintojen testaamiseen välitulostuksia ja ajoin ohjelmaa
uudelleen ja uudelleen nähdäkseni, missä on vielä korjattavaa ja mikä toimii halutulla tavalla. Esimerkiksi Peli-luokan 
vuoro(int x, int y)-metodia on testattu näin. Tulostin mm. getMerkki()-metodilla vuorossa olevan pelaajan merkin ja ruudussa olevan merkin nähdäkseni, toimiiko merkin asettaminen ruutuun.

Myös käyttöliittymää on testattu käsin, kuten ohjeiden mukaan tulikin toimia. Tässä välitulostukset auttoivat selvittämään 
muutaman kiusallisen bugin. Lisäksi metodin eri osien toiminnan tarkastelu helpottui huomattavasti, samoin virheiden 
löytäminen.

Luokkia Pelaaja ja Ruutu en testannut, sillä niiden metodit ovat yksinkertaisia settereitä ja gettereitä.

Cobertura:
Mitkä prosentit, mikä jäi punaiseksi

Bugeista:

Mainittu käyttöliittymän metodin bugi aiheutti voittorivin kolmannen merkin asettamiseen ongelman, ensimmäinen klikkaus 
ei muuttanut merkkiä, vaan vasta toinen. Uskallan kuitenkin väittää, että tämä on nyt historiaa. 

Pelin loppumiseen liittyvä kauneusvirhe asettunee jonnekin bugin ja keskeneräisyyden välimaastoon. Kun peli loppuu
1. pelaajan (merkki X) voittoon ja sulkee popupin, klikkaamalla peliruutuja kaikki merkit muuttuvat X:ksi ja jokaisen 
jälkeen tulee ilmoitus X:n voitosta. Kun taas peli päättyy 2. pelaajan (merkki 0) voittoon ja sulkee popupin, klikatessa
ruudut muuttuvat vuorotellen risteiksi ja nolliksi ja peli on mahdollista lopettaa jommankumman voittoon tai tasapeliin.
Ainakin tyylikkäämpi ratkaisu olisi jonkinlainen pelin nollautuminen aina pelin päättyessä tms. ratkaisu, joka ei jättäisi
peliä pelattavaksi vielä voiton jälkeen.

Kirjoita testausdokumentaatio

    Vapaaehtoinen
    Testausdokumentaatio korvaa yksikkötestauksen puutteita maksimissaan +2 pistettä
    Kirjoita esimerkiksi seuraavista
        Mitä et testannut automaattisesti?
        Miten näitä on testattu käsin?
        Raportoi myös mahdolliset bugit
