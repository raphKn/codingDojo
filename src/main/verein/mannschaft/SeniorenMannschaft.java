package verein.mannschaft;

import verein.training.Material;
import verein.training.Trainingsplan;
import verein.utils.SetFactory;

public class SeniorenMannschaft extends Mannschaft {
    public SeniorenMannschaft(LeistungsTyp leistungsTyp) {
        super(leistungsTyp);
    }

    @Override
    Trainingsplan getWarmlaufen() {
        return new Trainingsplan(SetFactory.emptySet(), 40);
    }

    @Override
    Trainingsplan getDoppelpass() {
        Material baelle = new Material("Ball", getSpielerAnzahl() / 2);
        return new Trainingsplan(SetFactory.asSet(baelle), 15);
    }
}
