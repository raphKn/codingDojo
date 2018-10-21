package testdatabuilder;

import verein.spieler.Spieler;

public class SpielerTestdataBuilder {

    public Spieler build() {
        Spieler spieler = new Spieler();
        spieler.setVorname("Spieler");
        spieler.setNachname("Mustermann");
        return spieler;
    }
}
