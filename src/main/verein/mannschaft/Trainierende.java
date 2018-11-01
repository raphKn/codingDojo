package verein.mannschaft;

import verein.training.Trainingsplan;
import verein.training.uebungen.Uebung;

public interface Trainierende {
    Trainingsplan getTrainingsplan(Uebung uebung);
}
