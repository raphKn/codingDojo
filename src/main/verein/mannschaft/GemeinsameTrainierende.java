package verein.mannschaft;

import java.util.ArrayList;
import java.util.List;
import verein.training.ParallelerTrainingsplan;
import verein.training.Trainingsplan;
import verein.training.uebungen.Uebung;

public class GemeinsameTrainierende implements Trainierende {

    private List<Mannschaft> trainierende = new ArrayList<>();

    <T extends Mannschaft> void addMannschaft(T mannschaft) {
        trainierende.add(mannschaft);
    }

    @Override
    public Trainingsplan getTrainingsplan(Uebung uebung) {
        ParallelerTrainingsplan paralleleTrainingseinheiten = new ParallelerTrainingsplan();
        trainierende.forEach((trainerender) -> paralleleTrainingseinheiten.addTrainingsplan(trainerender.getTrainingsplan(uebung)));

        return paralleleTrainingseinheiten;
    }
}
