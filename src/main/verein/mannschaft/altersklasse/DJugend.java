package verein.mannschaft.altersklasse;

public class DJugend implements Altersklasse {
    @Override
    public int getWarmlaufdauer() {
        return 15;
    }

    @Override
    public boolean isTrainerTeilnehmerBeiDopperlpass() {
        return false;
    }
}
