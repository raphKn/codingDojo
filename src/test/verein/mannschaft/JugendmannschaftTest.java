package verein.mannschaft;

import org.junit.Test;
import testdatabuilder.JugendMannschaftTestdataBuilder;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static verein.mannschaft.Altersklasse.A_Jugend;
import static verein.mannschaft.Altersklasse.B_Jugend;
import static verein.mannschaft.Altersklasse.C_Jugend;
import static verein.mannschaft.Altersklasse.D_Jugend;

public class JugendmannschaftTest {

    @Test
    public void getWarmlaufenAjugend() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder().altersklasse(A_Jugend).build();

        assertThat(jugendmannschaft.getWarmlaufen().toString(), is("Trainingsplan{materialListe=[], dauerInMinuten=30}"));
    }

    @Test
    public void getWarmlaufenBjugend() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder().altersklasse(B_Jugend).build();

        assertThat(jugendmannschaft.getWarmlaufen().toString(), is("Trainingsplan{materialListe=[], dauerInMinuten=25}"));
    }

    @Test
    public void getWarmlaufenCjugend() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder().altersklasse(C_Jugend).build();

        assertThat(jugendmannschaft.getWarmlaufen().toString(), is("Trainingsplan{materialListe=[], dauerInMinuten=20}"));
    }

    @Test
    public void getWarmlaufenDjugend() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder().altersklasse(D_Jugend).build();

        assertThat(jugendmannschaft.getWarmlaufen().toString(), is("Trainingsplan{materialListe=[], dauerInMinuten=15}"));
    }

/*    @Test
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
    }*/
}