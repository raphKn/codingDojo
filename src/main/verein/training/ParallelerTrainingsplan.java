package verein.training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParallelerTrainingsplan extends Trainingsplan {

    List<Trainingsplan> trainingsplaene = new ArrayList<>();

    @Override
    public Set<Material> getMaterialListe() {
        List<Material> materials = new ArrayList<>();
        trainingsplaene.forEach((trainingsplan) -> materials.addAll(trainingsplan.getMaterialListe()));

        Set<Material> reducedMaterials = new HashSet<>();

        for (int index = 0; index < materials.size(); index++) {
            String bezeichnung = materials.get(index).getBezeichnung();

            if (reducedMaterials.stream().noneMatch(material -> material.getBezeichnung().equals(bezeichnung))) {
                int sum = materials.stream().filter(material -> material.getBezeichnung().equals(bezeichnung)).mapToInt(Material::getMenge).sum();
                reducedMaterials.add(new Material(bezeichnung, sum));
            }

        }
        return reducedMaterials;
    }

    @Override
    public int getDauerInMinuten() {
        return trainingsplaene.stream().mapToInt(Trainingsplan::getDauerInMinuten).max().orElseGet(() -> 0);
    }

    public void addTrainingsplan(Trainingsplan trainingsplan) {
        trainingsplaene.add(trainingsplan);
    }
}
