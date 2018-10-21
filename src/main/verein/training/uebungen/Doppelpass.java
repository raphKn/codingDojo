package verein.training.uebungen;

import verein.mannschaft.Freizeitmannschaft;
import verein.mannschaft.Jugendmannschaft;
import verein.mannschaft.SeniorenMannschaft;
import verein.training.EinfacherTrainingsplan;
import verein.training.Material;
import verein.training.Trainingsplan;
import verein.utils.SetFactory;

public class Doppelpass implements Uebung {
    @Override
    public Trainingsplan calculateTrainingsplan(Jugendmannschaft jugendmannschaft) {

        int trainerAnzahl = jugendmannschaft.getTrainerAnzahlForDoppelpass();

        return new EinfacherTrainingsplan(SetFactory.asSet(new Material("Ball", (jugendmannschaft.getSpielerAnzahl() + trainerAnzahl) / 3)),
            25);
    }

    @Override
    public Trainingsplan calculateTrainingsplan(Freizeitmannschaft freizeitmannschaft) {
        return new EinfacherTrainingsplan(
            SetFactory.asSet(new Material("Stangen", 5), new Material("Ball", freizeitmannschaft.getSpielerAnzahl())),
            freizeitmannschaft.getSpielerAnzahl() * 5);
    }

    @Override
    public Trainingsplan calculateTrainingsplan(SeniorenMannschaft seniorenMannschaft) {
        return new EinfacherTrainingsplan(SetFactory.asSet(new Material("Ball", seniorenMannschaft.getSpielerAnzahl() / 2)), 15);
    }
}
