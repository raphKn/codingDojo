package testdatabuilder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import verein.mannschaft.Altersklasse;
import verein.mannschaft.Jugendmannschaft;
import verein.mannschaft.LeistungsTyp;
import verein.mannschaft.Liga;
import verein.mannschaft.TrainingszeitTestdataBuilder;
import verein.spieler.Spieler;
import verein.trainer.Trainer;

public class JugendMannschaftTestdataBuilder {

    private LeistungsTyp leistungsTyp = LeistungsTyp.ANFAENGER;
    private Liga liga = new Liga("Kreisliga");
    private List<Trainer> trainerteam = Collections.singletonList(new TrainerTestdataBuilder().build());
    private List<Spieler> spieler = Arrays.asList(
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler()
    );
    private Altersklasse altersklasse = Altersklasse.A_Jugend;

    public Jugendmannschaft build() {
        Jugendmannschaft jugendmannschaft = new Jugendmannschaft(leistungsTyp);
        jugendmannschaft.setLiga(liga);
        jugendmannschaft.setTrainerteam(trainerteam);
        jugendmannschaft.addTrainingszeit(new TrainingszeitTestdataBuilder().build());
        jugendmannschaft.setAltersklasse(altersklasse);
        spieler.forEach(jugendmannschaft::addSpieler);
        return jugendmannschaft;
    }

    public JugendMannschaftTestdataBuilder altersklasse(Altersklasse altersklasse) {
        this.altersklasse = altersklasse;
        return this;
    }

    private Spieler createSpieler() {
        return new SpielerTestdataBuilder().build();
    }
}
