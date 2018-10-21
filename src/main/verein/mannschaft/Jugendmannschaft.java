package verein.mannschaft;

import java.util.ArrayList;
import java.util.List;
import verein.UnsupportedTrainingsinheitException;
import verein.trainer.Trainer;
import verein.training.Material;
import verein.training.Trainingsplan;
import verein.utils.SetFactory;

public class Jugendmannschaft extends Mannschaft {
    private List<Trainer> trainerteam = new ArrayList<>();
    private Liga liga;
    private Altersklasse altersklasse;

    public Jugendmannschaft(LeistungsTyp leistungsTyp) {
        super(leistungsTyp);
    }

    public List<Trainer> getTrainerteam() {
        return trainerteam;
    }

    public void setTrainerteam(List<Trainer> trainerteam) {
        this.trainerteam = trainerteam;
    }

    public int getTrainerAnzahl() {
        return trainerteam.size();
    }

    public void addTrainer(Trainer trainer) {
        this.trainerteam.add(trainer);
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Trainingsplan getWarmlaufen() {
        switch (altersklasse) {
            case A_Jugend:
                return new Trainingsplan(SetFactory.emptySet(), 30);
            case B_Jugend:
                return new Trainingsplan(SetFactory.emptySet(), 25);
            case C_Jugend:
                return new Trainingsplan(SetFactory.emptySet(), 20);
            case D_Jugend:
                return new Trainingsplan(SetFactory.emptySet(), 15);
        }
        throw new UnsupportedTrainingsinheitException("Warmlaufen ist für diese AK nicht verfügbar");
    }

    @Override
    Trainingsplan getDoppelpass() {
        return new Trainingsplan(SetFactory.asSet(new Material("Ball", (getSpielerAnzahl() + getTrainerAnzahl()) / 3)),
            25);
    }

    public void setAltersklasse(Altersklasse altersklasse) {
        this.altersklasse = altersklasse;
    }
}
