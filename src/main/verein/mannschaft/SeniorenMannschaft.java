package verein.mannschaft;

import verein.training.Trainingsplan;
import verein.training.uebungen.Uebung;

public class SeniorenMannschaft extends Mannschaft {
    public SeniorenMannschaft(LeistungsTyp leistungsTyp) {
        super(leistungsTyp);
    }

    @Override
    Trainingsplan getTrainingsplan(Uebung uebung) {
        return uebung.calculateTrainingsplan(this);
    }
}
