package tn.esprit.twin.projetspringclasse.services.Chef;

import tn.esprit.twin.projetspringclasse.models.ChefCuisinier;
import tn.esprit.twin.projetspringclasse.repository.ChefCuisinierRepo;

import java.util.List;

public class ChefCuisinierSer implements IchefS {

    private ChefCuisinierRepo chefRepository;


    @Override
    public List<ChefCuisinier> retrieveAllChefs() {
        return chefRepository.findAll();
    }

    @Override
    public ChefCuisinier addChef(ChefCuisinier chef) {
        return chefRepository.save(chef);
    }

    @Override
    public List<ChefCuisinier> addChefs(List<ChefCuisinier> chefs) {
        return chefRepository.saveAll(chefs);
    }

    @Override
    public ChefCuisinier updateChef(ChefCuisinier chef) {
        return chefRepository.save(chef);
    }

    @Override
    public ChefCuisinier retrieveChef(Long id) {
        return chefRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteChef(Long id) {
        chefRepository.deleteById(id);

    }
}
