package verein.mannschaft;

import java.util.Optional;
import verein.trainer.Trainer;
import verein.training.Trainingsplan;
import verein.training.uebungen.Uebung;

public class Freizeitmannschaft extends Mannschaft {

    private Trainer trainer;

    public Freizeitmannschaft(LeistungsTyp leistungsTyp) {
        super(leistungsTyp);
    }

    @Override
    Trainingsplan getTrainingsplan(Uebung uebung) {
        return uebung.calculateTrainingsplan(this);
    }

    public Optional<Trainer> getTrainer() {
        if (trainer == null) {
            return Optional.empty();
        }
        return Optional.of(trainer);
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void removeTrainer() {
        this.trainer = null;
    }

}
