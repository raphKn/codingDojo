package verein.training;

import java.util.Set;

public class EinfacherTrainingsplan extends Trainingsplan {
    private Set<Material> materialListe;
    private int dauerInMinuten;

    public EinfacherTrainingsplan(Set<Material> materialListe, int dauerInMinuten) {
        this.materialListe = materialListe;
        this.dauerInMinuten = dauerInMinuten;
    }

    @Override
    public Set<Material> getMaterialListe() {
        return materialListe;
    }

    @Override
    public int getDauerInMinuten() {
        return dauerInMinuten;
    }
}
