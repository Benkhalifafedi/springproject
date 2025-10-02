package tn.esprit.twin.projetspringclasse.services.Comp;

import org.springframework.stereotype.Service;
import tn.esprit.twin.projetspringclasse.models.Composant;
import tn.esprit.twin.projetspringclasse.repository.ComposantRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComposantSer implements IcompS {

    private final ComposantRepo composantRepository;

    public ComposantSer(ComposantRepo composantRepository) {
        this.composantRepository = composantRepository;
    }

    @Override
    public List<Composant> retrieveAllComposants() {
        return composantRepository.findAll();
    }

    @Override
    public Composant addComposant(Composant composant) {
        return composantRepository.save(composant);
    }

    @Override
    public List<Composant> addComposants(List<Composant> composants) {
        List<Composant> saved = new ArrayList<>();
        for (Composant c : composants) {
            saved.add(composantRepository.save(c));
        }
        return saved;
    }

    @Override
    public Composant updateComposant(Composant composant) {
        return composantRepository.save(composant);
    }

    @Override
    public Composant retrieveComposant(Long id) {
        return composantRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteComposant(Long id) {
        composantRepository.deleteById(id);
    }
}
