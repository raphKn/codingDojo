package verein.mannschaft.altersklasse;

public class CJugend implements Altersklasse {
    @Override
    public int getWarmlaufdauer() {
        return 20;
    }

    @Override
    public boolean isTrainerTeilnehmerBeiDopperlpass() {
        return true;
    }
}
