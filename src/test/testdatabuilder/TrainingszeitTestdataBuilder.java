package testdatabuilder;

import java.time.LocalTime;
import verein.mannschaft.Trainingszeit;

public class TrainingszeitTestdataBuilder {

    private LocalTime beginn = LocalTime.parse("18:30:00");
    private LocalTime ende = LocalTime.parse("20:30:00");

    public Trainingszeit build() {
        return new Trainingszeit(beginn, ende);
    }
}
