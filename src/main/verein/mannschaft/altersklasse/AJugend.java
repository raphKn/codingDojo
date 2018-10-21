package verein.mannschaft.altersklasse;

public class AJugend implements Altersklasse{
    @Override
    public int getWarmlaufdauer() {
        return 30;
    }

    @Override
    public boolean isTrainerTeilnehmerBeiDopperlpass() {
        return false;
    }
}
