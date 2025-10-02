package tn.esprit.twin.projetspringclasse.services.Chaine;

import tn.esprit.twin.projetspringclasse.models.ChaineRestauration;
import tn.esprit.twin.projetspringclasse.repository.ChaineRestaurationRepo;

import java.util.List;

public class ChaineRestSer implements IchaineS{

    private ChaineRestaurationRepo chaineRepository;

    @Override
    public List<ChaineRestauration> retrieveAllChaines() {
        return chaineRepository.findAll();
    }

    @Override
    public ChaineRestauration addChaine(ChaineRestauration chaine) {
        return chaineRepository.save(chaine);
    }

    @Override
    public List<ChaineRestauration> addChaines(List<ChaineRestauration> chaines) {
        return chaineRepository.saveAll(chaines);
    }

    @Override
    public ChaineRestauration updateChaine(ChaineRestauration chaine) {
        return chaineRepository.save(chaine);
    }

    @Override
    public ChaineRestauration retrieveChaine(Long id) {
        return chaineRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteChaine(Long id) {
        chaineRepository.deleteById(id);
    }
}
