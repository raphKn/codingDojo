package verein.mannschaft;

import java.util.ArrayList;
import java.util.List;
import verein.mannschaft.altersklasse.Altersklasse;
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
        return new Trainingsplan(SetFactory.emptySet(), altersklasse.getWarmlaufdauer());
    }

    @Override
    Trainingsplan getDoppelpass() {
        int trainerAnzahl = getTrainerAnzahlForDoppelpass();

        return new Trainingsplan(SetFactory.asSet(new Material("Ball", (getSpielerAnzahl() + trainerAnzahl) / 3)),
            25);
    }

    private int getTrainerAnzahlForDoppelpass() {
        if (altersklasse.isTrainerTeilnehmerBeiDopperlpass()) {
            return getTrainerAnzahl();
        }
        return 0;
    }

    public void setAltersklasse(Altersklasse altersklasse) {
        this.altersklasse = altersklasse;
    }
}
