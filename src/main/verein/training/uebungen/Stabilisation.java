package verein.training.uebungen;

import verein.mannschaft.Freizeitmannschaft;
import verein.mannschaft.Jugendmannschaft;
import verein.mannschaft.SeniorenMannschaft;
import verein.training.EinfacherTrainingsplan;
import verein.training.Material;
import verein.training.Trainingsplan;
import verein.utils.SetFactory;

public class Stabilisation implements Uebung {

    @Override
    public Trainingsplan calculateTrainingsplan(Jugendmannschaft mannschaft) {
        return createTrainingWithBaellen(mannschaft.getSpielerAnzahl());
    }

    @Override
    public Trainingsplan calculateTrainingsplan(Freizeitmannschaft freizeitmannschaft) {
        int anzahl = freizeitmannschaft.getSpielerAnzahl();
        return freizeitmannschaft.getTrainer()
            .map((t) -> createTrainingWithBaellen(anzahl + 1))
            .orElse(createTrainingWithBaellen(anzahl));
    }

    @Override
    public Trainingsplan calculateTrainingsplan(SeniorenMannschaft seniorenMannschaft) {
        return createTrainingWithBaellen(seniorenMannschaft.getSpielerAnzahl());
    }

    private Trainingsplan createTrainingWithBaellen(int menge) {
        return new EinfacherTrainingsplan(SetFactory.asSet(new Material("Ball", menge)), (menge) * 2);
    }

}
