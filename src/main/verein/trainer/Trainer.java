package verein.trainer;

public class Trainer {
    String vorname;
    String nachname;
    Traininerslizenz traininerslizenz;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Traininerslizenz getTraininerslizenz() {
        return traininerslizenz;
    }

    public void setTraininerslizenz(Traininerslizenz traininerslizenz) {
        this.traininerslizenz = traininerslizenz;
    }
}
