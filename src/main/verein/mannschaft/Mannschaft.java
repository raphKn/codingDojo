package verein.mannschaft;

import java.util.ArrayList;
import java.util.List;
import verein.spieler.Spieler;
import verein.training.Trainingsplan;
import verein.training.uebungen.Uebung;

public abstract class Mannschaft {
    private List<Spieler> spielende = new ArrayList<>();
    private List<Trainingszeit> trainingszeiten = new ArrayList<>();
    private LeistungsTyp leistungsTyp;

    Mannschaft(LeistungsTyp leistungsTyp) {
        this.leistungsTyp = leistungsTyp;
    }

    public List<Spieler> getSpielende() {
        return spielende;
    }

    public void addSpieler(Spieler spieler) {
        spielende.add(spieler);
    }

    public void removeSpieler(Spieler spieler) {
        spielende.remove(spieler);
    }

    public List<Trainingszeit> getTrainingszeit() {
        return trainingszeiten;
    }

    public void addTrainingszeit(Trainingszeit addTrainingszeit) {
        trainingszeiten.add(addTrainingszeit);
    }

    public void removeSpieler(Trainingszeit trainingszeit) {
        trainingszeiten.remove(trainingszeit);
    }

    public LeistungsTyp getLeistungsTyp() {
        return leistungsTyp;
    }

    public int getSpielerAnzahl() {
        return spielende.size();
    }

    public abstract Trainingsplan getTrainingsplan(Uebung uebung);

}
