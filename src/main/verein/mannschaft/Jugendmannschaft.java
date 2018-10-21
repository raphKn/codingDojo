package verein.mannschaft;

import java.util.ArrayList;
import java.util.List;
import verein.mannschaft.altersklasse.Altersklasse;
import verein.trainer.Trainer;
import verein.training.Trainingsplan;
import verein.training.uebungen.Uebung;

public class Jugendmannschaft extends Mannschaft {
    private List<Trainer> trainerteam = new ArrayList<>();
    private Liga liga;
    private Altersklasse altersklasse;

    public Jugendmannschaft(LeistungsTyp leistungsTyp) {
        super(leistungsTyp);
    }

    public Altersklasse getAltersklasse() {
        return altersklasse;
    }

    public void setAltersklasse(Altersklasse altersklasse) {
        this.altersklasse = altersklasse;
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

    @Override
    Trainingsplan getTrainingsplan(Uebung uebung) {
        return uebung.calculateTrainingsplan(this);
    }

    public int getTrainerAnzahlForDoppelpass() {
        if (altersklasse.isTrainerTeilnehmerBeiDopperlpass()) {
            return getTrainerAnzahl();
        }
        return 0;
    }
}
