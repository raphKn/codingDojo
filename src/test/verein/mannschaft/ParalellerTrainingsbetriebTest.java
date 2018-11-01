package verein.mannschaft;

import org.junit.Test;
import testdatabuilder.FreizeitMannschaftTestdataBuilder;
import testdatabuilder.JugendMannschaftTestdataBuilder;
import verein.training.Trainingsplan;
import verein.training.uebungen.Doppelpass;
import verein.training.uebungen.SerielleUebungen;
import verein.training.uebungen.Stabilisation;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParalellerTrainingsbetriebTest {

    @Test
    public void JugendWithFreizeit() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder().build();
        Freizeitmannschaft freizeitmannschaft = new FreizeitMannschaftTestdataBuilder().build();

        GemeinsameTrainierende gemeinsameTrainierende = new GemeinsameTrainierende();

        gemeinsameTrainierende.addMannschaft(jugendmannschaft);
        gemeinsameTrainierende.addMannschaft(freizeitmannschaft);

        Trainingsplan trainingsplan = gemeinsameTrainierende.getTrainingsplan(new Doppelpass());

        assertThat(trainingsplan.toString(),
            is("Trainingsplan{materialListe=[Material{bezeichnung='Ball', menge=7}, Material{bezeichnung='Stangen', menge=5}], dauerInMinuten=25}"));
    }

    @Test
    public void JugendWithFreizeitWarmlaufenDoppelpass() {
        Jugendmannschaft jugendmannschaft = new JugendMannschaftTestdataBuilder().build();
        Freizeitmannschaft freizeitmannschaft = new FreizeitMannschaftTestdataBuilder().build();

        GemeinsameTrainierende paralellerTrainingsbetrieb = new GemeinsameTrainierende();
        paralellerTrainingsbetrieb.addMannschaft(jugendmannschaft);
        paralellerTrainingsbetrieb.addMannschaft(freizeitmannschaft);

        SerielleUebungen trainingsplaene = new SerielleUebungen();
        trainingsplaene.addUebung(new Doppelpass());
        trainingsplaene.addUebung(new Stabilisation());

        Trainingsplan accept = paralellerTrainingsbetrieb.getTrainingsplan(trainingsplaene);

        assertThat(accept.toString(),
            is("Trainingsplan{materialListe=[Material{bezeichnung='Ball', menge=17}, Material{bezeichnung='Stangen', menge=5}], dauerInMinuten=39}"));
    }
}