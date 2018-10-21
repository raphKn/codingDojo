package verein.mannschaft;

import java.util.Optional;
import verein.trainer.Trainer;
import verein.training.Material;
import verein.training.Trainingsplan;
import verein.utils.SetFactory;

public class Freizeitmannschaft extends Mannschaft {

    private Trainer trainer;

    public Freizeitmannschaft(LeistungsTyp leistungsTyp) {
        super(leistungsTyp);
    }

    Trainingsplan getWarmlaufen() {
        return getTrainer().map((t) -> new Trainingsplan(SetFactory.emptySet(), 35)
        ).orElse(new Trainingsplan(SetFactory.emptySet(), 20));
    }

    @Override
    Trainingsplan getDoppelpass() {
        return new Trainingsplan(
            SetFactory.asSet(new Material("Stangen", 5), new Material("Ball", getSpielerAnzahl())),
            getSpielerAnzahl() * 5);
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
