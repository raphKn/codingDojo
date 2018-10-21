package verein.mannschaft.altersklasse;

public class BJugend implements Altersklasse {
    @Override
    public int getWarmlaufdauer() {
        return 25;
    }

    @Override
    public boolean isTrainerTeilnehmerBeiDopperlpass() {
        return false;
    }
}
