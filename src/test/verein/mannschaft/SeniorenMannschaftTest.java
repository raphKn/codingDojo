package verein.mannschaft;

import org.junit.Test;
import testdatabuilder.SeniorenMannschaftTestdataBuilder;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SeniorenMannschaftTest {

    @Test
    public void getWarmlaufen() {
        SeniorenMannschaft build = new SeniorenMannschaftTestdataBuilder().build();
        assertThat(build.getWarmlaufen().toString(), is("Trainingsplan{materialListe=[], dauerInMinuten=40}"));
    }

    @Test
    public void getDoppelpass() {
        SeniorenMannschaft build = new SeniorenMannschaftTestdataBuilder().build();
        assertThat(build.getDoppelpass().toString(), is("Trainingsplan{materialListe=[Material{bezeichnung='Ball', menge=5}], dauerInMinuten=15}"));
    }

    /*@Test
    public void getStabilisation() {
        SeniorenMannschaft build = new SeniorenMannschaftTestdataBuilder().build();
        assertThat(build.getTrainingsplan(new Stabilisation()).toString(), is("Trainingsplan{materialListe=[Material{bezeichnung='Ball', menge=11}], dauerInMinuten=22}"));
    }*/
}