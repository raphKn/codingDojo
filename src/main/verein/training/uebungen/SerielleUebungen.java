package verein.training.uebungen;

import java.util.ArrayList;
import java.util.List;
import verein.mannschaft.Freizeitmannschaft;
import verein.mannschaft.Jugendmannschaft;
import verein.mannschaft.Mannschaft;
import verein.mannschaft.SeniorenMannschaft;
import verein.training.SeriellerTrainingsplan;
import verein.training.Trainingsplan;

public class SerielleUebungen implements Uebung {

    private List<Uebung> uebungen = new ArrayList();

    public void addUebung(Uebung uebung) {
        uebungen.add(uebung);
    }

    @Override
    public Trainingsplan calculateTrainingsplan(Jugendmannschaft mannschaft) {
        return getSammelTrainingseinheit(mannschaft);
    }

    private Trainingsplan getSammelTrainingseinheit(Mannschaft mannschaft) {
        SeriellerTrainingsplan reihenTrainingseinheit = new SeriellerTrainingsplan();
        uebungen.forEach((tp) -> reihenTrainingseinheit.addTrainingsplan(mannschaft.getTrainingsplan(tp)));
        return reihenTrainingseinheit;
    }

    @Override
    public Trainingsplan calculateTrainingsplan(Freizeitmannschaft freizeitmannschaft) {
        return getSammelTrainingseinheit(freizeitmannschaft);
    }

    @Override
    public Trainingsplan calculateTrainingsplan(SeniorenMannschaft seniorenMannschaft) {
        return getSammelTrainingseinheit(seniorenMannschaft);
    }
}
