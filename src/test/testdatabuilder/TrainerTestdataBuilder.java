package testdatabuilder;

import verein.trainer.Trainer;

import static verein.trainer.Traininerslizenz.C_Trainer;

public class TrainerTestdataBuilder {

    public Trainer build() {
        Trainer trainer = new Trainer();
        trainer.setVorname("Trainer");
        trainer.setNachname("Mustermann");
        trainer.setTraininerslizenz(C_Trainer);
        return trainer;
    }

}