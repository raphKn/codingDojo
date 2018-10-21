package testdatabuilder;

import java.util.Arrays;
import java.util.List;
import verein.mannschaft.Freizeitmannschaft;
import verein.mannschaft.LeistungsTyp;
import verein.spieler.Spieler;
import verein.trainer.Trainer;

public class FreizeitMannschaftTestdataBuilder {

    private LeistungsTyp leistungsTyp = LeistungsTyp.ANFAENGER;
    private List<Spieler> spieler = Arrays.asList(
        createSpieler(),
        createSpieler(),
        createSpieler(),
        createSpieler(),
        createSpieler()
    );
    private Trainer trainer = null;

    private Spieler createSpieler() {
        return new SpielerTestdataBuilder().build();
    }

    public Freizeitmannschaft build() {
        Freizeitmannschaft freizeitmannschaft = new Freizeitmannschaft(leistungsTyp);
        freizeitmannschaft.addTrainingszeit(new TrainingszeitTestdataBuilder().build());
        spieler.forEach(freizeitmannschaft::addSpieler);
        freizeitmannschaft.setTrainer(trainer);
        return freizeitmannschaft;
    }

    public FreizeitMannschaftTestdataBuilder trainer(Trainer trainer) {
        this.trainer = trainer;
        return this;
    }

}
