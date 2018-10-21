package verein.mannschaft;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import testdatabuilder.JugendMannschaftTestdataBuilder;
import testdatabuilder.TrainerTestdataBuilder;
import verein.mannschaft.altersklasse.AJugend;
import verein.mannschaft.altersklasse.BJugend;
import verein.mannschaft.altersklasse.CJugend;
import verein.mannschaft.altersklasse.DJugend;
import verein.trainer.Trainer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JugendmannschaftTest {

    @Test
    public void getWarmlaufenAjugend() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder().altersklasse(new AJugend()).build();

        assertThat(jugendmannschaft.getWarmlaufen().toString(), is("Trainingsplan{materialListe=[], dauerInMinuten=30}"));
    }

    @Test
    public void getWarmlaufenBjugend() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder().altersklasse(new BJugend()).build();

        assertThat(jugendmannschaft.getWarmlaufen().toString(), is("Trainingsplan{materialListe=[], dauerInMinuten=25}"));
    }

    @Test
    public void getWarmlaufenCjugend() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder().altersklasse(new CJugend()).build();

        assertThat(jugendmannschaft.getWarmlaufen().toString(), is("Trainingsplan{materialListe=[], dauerInMinuten=20}"));
    }

    @Test
    public void getWarmlaufenDjugend() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder().altersklasse(new DJugend()).build();

        assertThat(jugendmannschaft.getWarmlaufen().toString(), is("Trainingsplan{materialListe=[], dauerInMinuten=15}"));
    }

    @Test
    public void getDoppelpassForJugendMitTeilnehmendemTrainer() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder()
            .altersklasse(new BJugend())
            .trainerteam(createThreeTrainerTrainerteam())
            .build();

        assertThat(jugendmannschaft.getDoppelpass().toString(), is("Trainingsplan{materialListe=[Material{bezeichnung='Ball', menge=2}], dauerInMinuten=25}"));
    }

    @Test
    public void getDoppelpassForJugendOhneTeilnehmendemTrainer() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder()
            .altersklasse(new CJugend())
            .trainerteam(createThreeTrainerTrainerteam())
            .build();

        assertThat(jugendmannschaft.getDoppelpass().toString(), is("Trainingsplan{materialListe=[Material{bezeichnung='Ball', menge=3}], dauerInMinuten=25}"));
    }

    private List<Trainer> createThreeTrainerTrainerteam() {
        Trainer trainer = new TrainerTestdataBuilder().build();
        return Arrays.asList(trainer, trainer, trainer);
    }
}