**Testeistä:**

Kohtalaisen kokemattomana JUnit-testaajana käytin usein toimintojen testaamiseen välitulostuksia ja ajoin ohjelmaa
uudelleen ja uudelleen nähdäkseni, missä on vielä korjattavaa ja mikä toimii halutulla tavalla. Esimerkiksi Peli-luokan 
vuoro(int x, int y)-metodia on testattu näin. Tulostin mm. getMerkki()-metodilla vuorossa olevan pelaajan merkin ja ruudussa olevan merkin nähdäkseni, toimiiko merkin asettaminen ruutuun.

Myös käyttöliittymää on testattu käsin, kuten ohjeiden mukaan tulikin toimia. Tässä välitulostukset auttoivat selvittämään muutaman kiusallisen bugin. Lisäksi metodin eri osien toiminnan tarkastelu helpottui huomattavasti, samoin virheiden löytäminen.

Luokkia Pelaaja ja Ruutu en testannut, sillä niiden metodit ovat yksinkertaisia settereitä ja gettereitä.

**Cobertura:**

Settereitä ja gettereitä lukuun ottamatta Cobertura jäi näyttämään punaista Peli-luokassa vaihdaVuoro()-metodin else-ehdossa, useista yrityksistä huolimatta en saanut conditional coveragea yli 50 prosentin. Vuoronvaihto kuitenkin ohjelmassa toimii, joten en pitänyt tätä merkityksellisenä.

Ruudukko-luokassa niin ikään conditional coverage jäi 50 prosenttiin for-ehtojen kohdalla.

**Bugeista:**

Pelin loppumiseen liittyvä kauneusvirhe asettunee jonnekin bugin ja keskeneräisyyden välimaastoon. Kun peli loppuu
1. pelaajan (merkki X) voittoon ja sulkee popupin, klikkaamalla peliruutuja kaikki merkit muuttuvat X:ksi ja jokaisen 
jälkeen tulee ilmoitus X:n voitosta. Kun taas peli päättyy 2. pelaajan (merkki 0) voittoon ja sulkee popupin, klikatessa
ruudut muuttuvat vuorotellen risteiksi ja nolliksi ja peli on mahdollista lopettaa jommankumman voittoon tai tasapeliin.
Ainakin tyylikkäämpi ratkaisu olisi jonkinlainen pelin nollautuminen aina pelin päättyessä tms. ratkaisu, joka ei jättäisi peliä pelattavaksi vielä voiton jälkeen.
