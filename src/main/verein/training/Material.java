package verein.training;

public class Material {
    private String bezeichnung;
    private int menge;

    public Material(String bezeichnung, int menge) {
        this.bezeichnung = bezeichnung;
        this.menge = menge;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getMenge() {
        return menge;
    }

    @Override
    public String toString() {
        return "Material{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", menge=" + menge +
                '}';
    }
}
