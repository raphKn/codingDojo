package verein.spieler;

public class Spieler {
    private String vorname;
    private String nachname;

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }
}
