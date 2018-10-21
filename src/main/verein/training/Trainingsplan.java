package verein.training;

import java.util.Set;

public class Trainingsplan {
    private Set<Material> materialListe;
    private int dauerInMinuten;

    public Trainingsplan(Set<Material> materialListe, int dauerInMinuten) {
        this.materialListe = materialListe;
        this.dauerInMinuten = dauerInMinuten;
    }

    public Set<Material> getMaterialListe() {
        return materialListe;
    }

    public int getDauerInMinuten() {
        return dauerInMinuten;
    }

    @Override
    public String toString() {
        return "Trainingsplan{" +
            "materialListe=" + materialListe +
            ", dauerInMinuten=" + dauerInMinuten +
            '}';
    }
}
