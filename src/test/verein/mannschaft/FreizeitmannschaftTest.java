package verein.mannschaft;

import org.junit.Test;
import testdatabuilder.FreizeitMannschaftTestdataBuilder;
import testdatabuilder.TrainerTestdataBuilder;
import verein.training.Trainingsplan;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FreizeitmannschaftTest {

    @Test
    public void getWarmlaufenMitTrainer() {
        Freizeitmannschaft freizeitmannschaftMitTrainer = new FreizeitMannschaftTestdataBuilder()
                .trainer(new TrainerTestdataBuilder().build())
                .build();

        Trainingsplan warmlaufen = freizeitmannschaftMitTrainer.getWarmlaufen();
        assertThat(warmlaufen.toString(), is("Trainingsplan{materialListe=[], dauerInMinuten=35}"));
    }

    @Test
    public void getWarmlaufenOhneTrainer() {
        Freizeitmannschaft freizeitmannschaftOhneTrainer = new FreizeitMannschaftTestdataBuilder()
                .build();

        Trainingsplan warmlaufen = freizeitmannschaftOhneTrainer.getWarmlaufen();
        assertThat(warmlaufen.toString(), is("Trainingsplan{materialListe=[], dauerInMinuten=20}"));
    }

    @Test
    public void getDoppelpass() {
        Freizeitmannschaft freizeitmannschaftMit5Spielern = new FreizeitMannschaftTestdataBuilder()
                .build();

        Trainingsplan doppelpass = freizeitmannschaftMit5Spielern.getDoppelpass();
        assertThat(doppelpass.toString(),
                is("Trainingsplan{materialListe=[Material{bezeichnung='Stangen', menge=5}, Material{bezeichnung='Ball', menge=5}], dauerInMinuten=25}"));
    }
}