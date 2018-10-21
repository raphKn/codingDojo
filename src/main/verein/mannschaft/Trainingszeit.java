package verein.mannschaft;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Trainingszeit {
    private final LocalTime beginn;
    private final LocalTime ende;

    public Trainingszeit(LocalTime beginn, LocalTime ende) {
        this.beginn = beginn;
        this.ende = ende;
    }

    public LocalTime getBeginn() {
        return beginn;
    }

    public LocalTime getEnde() {
        return ende;
    }

    public long getDauerInMinutes() {
        return ende.until(beginn, ChronoUnit.MINUTES);
    }
}
