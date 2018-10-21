package verein.training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;

public class SeriellerTrainingsplan extends Trainingsplan {

    List<Trainingsplan> trainingsplaene = new ArrayList<>();

    @Override
    public Set<Material> getMaterialListe() {
        HashSet<Material> materials = new HashSet<>();
        trainingsplaene.forEach((te) -> materials.addAll(te.getMaterialListe()));

        filterMateriallisteForMaximumOfEach(materials);
        return materials;
    }

    private void filterMateriallisteForMaximumOfEach(HashSet<Material> materials) {
        materials.removeIf(material -> {
            OptionalInt max = materials.stream().filter(material1 -> material1.getBezeichnung().equals(material.getBezeichnung())).mapToInt(Material::getMenge).max();
            return max.isPresent() && max.getAsInt() > material.getMenge();
        });
    }

    @Override
    public int getDauerInMinuten() {
        return trainingsplaene.stream().mapToInt(Trainingsplan::getDauerInMinuten).sum();
    }

    public void addTrainingsplan(Trainingsplan trainingsplan) {
        trainingsplaene.add(trainingsplan);
    }
}
