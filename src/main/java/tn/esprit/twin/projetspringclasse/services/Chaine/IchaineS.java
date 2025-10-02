package tn.esprit.twin.projetspringclasse.services.Chaine;

import tn.esprit.twin.projetspringclasse.models.ChaineRestauration;
import java.util.List;

public interface IchaineS {
    List<ChaineRestauration> retrieveAllChaines();
    ChaineRestauration addChaine(ChaineRestauration chaine);
    List<ChaineRestauration> addChaines(List<ChaineRestauration> chaines);
    ChaineRestauration updateChaine(ChaineRestauration chaine);
    ChaineRestauration retrieveChaine(Long id);
    void deleteChaine(Long id);
}
