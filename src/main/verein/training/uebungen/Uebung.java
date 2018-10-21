package verein.training.uebungen;

import verein.mannschaft.Freizeitmannschaft;
import verein.mannschaft.Jugendmannschaft;
import verein.mannschaft.SeniorenMannschaft;
import verein.training.Trainingsplan;

public interface Uebung {
    Trainingsplan calculateTrainingsplan(Jugendmannschaft jugendmannschaft);

    Trainingsplan calculateTrainingsplan(Freizeitmannschaft freizeitmannschaft);

    Trainingsplan calculateTrainingsplan(SeniorenMannschaft seniorenMannschaft);
}
