package tn.esprit.twin.projetspringclasse.services.Chef;

import tn.esprit.twin.projetspringclasse.models.ChefCuisinier;
import java.util.List;

public interface IchefS {
    List<ChefCuisinier> retrieveAllChefs();
    ChefCuisinier addChef(ChefCuisinier chef);
    List<ChefCuisinier> addChefs(List<ChefCuisinier> chefs);
    ChefCuisinier updateChef(ChefCuisinier chef);
    ChefCuisinier retrieveChef(Long id);
    void deleteChef(Long id);
}
