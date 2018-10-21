package testdatabuilder;

import java.util.Arrays;
import java.util.List;
import verein.mannschaft.LeistungsTyp;
import verein.mannschaft.SeniorenMannschaft;
import verein.mannschaft.TrainingszeitTestdataBuilder;
import verein.spieler.Spieler;

public class SeniorenMannschaftTestdataBuilder {

    private LeistungsTyp leistungsTyp = LeistungsTyp.ANFAENGER;
    private List<Spieler> spieler = Arrays.asList(
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler(),
            createSpieler()
    );

    public SeniorenMannschaft build() {
        SeniorenMannschaft seniorenMannschaft = new SeniorenMannschaft(leistungsTyp);
        seniorenMannschaft.addTrainingszeit(new TrainingszeitTestdataBuilder().build());
        spieler.forEach(seniorenMannschaft::addSpieler);
        return seniorenMannschaft;
    }

    private Spieler createSpieler() {
        return new SpielerTestdataBuilder().build();
    }
}
