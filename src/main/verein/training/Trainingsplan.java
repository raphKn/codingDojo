package verein.training;

import java.util.Set;

public abstract class Trainingsplan {

    public abstract Set<Material> getMaterialListe();

    public abstract int getDauerInMinuten();

    @Override
    public String toString() {
        return "Trainingsplan{" +
            "materialListe=" + getMaterialListe() +
            ", dauerInMinuten=" + getDauerInMinuten() +
            '}';
    }
}
