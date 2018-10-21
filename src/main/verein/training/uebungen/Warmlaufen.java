package verein.training.uebungen;

import verein.mannschaft.Freizeitmannschaft;
import verein.mannschaft.Jugendmannschaft;
import verein.mannschaft.SeniorenMannschaft;
import verein.training.EinfacherTrainingsplan;
import verein.training.Trainingsplan;
import verein.utils.SetFactory;

public class Warmlaufen implements Uebung {

    @Override
    public Trainingsplan calculateTrainingsplan(Jugendmannschaft jugendmannschaft) {
        return new EinfacherTrainingsplan(SetFactory.emptySet(), jugendmannschaft.getAltersklasse().getWarmlaufdauer());
    }

    @Override
    public Trainingsplan calculateTrainingsplan(Freizeitmannschaft freizeitmannschaft) {
        return freizeitmannschaft.getTrainer().map((t) -> new EinfacherTrainingsplan(SetFactory.emptySet(), 35)
        ).orElse(new EinfacherTrainingsplan(SetFactory.emptySet(), 20));
    }

    @Override
    public Trainingsplan calculateTrainingsplan(SeniorenMannschaft seniorenMannschaft) {
        return new EinfacherTrainingsplan(SetFactory.emptySet(), 40);
    }
}
