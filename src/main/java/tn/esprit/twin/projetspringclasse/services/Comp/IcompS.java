package tn.esprit.twin.projetspringclasse.services.Comp;

import tn.esprit.twin.projetspringclasse.models.Composant;
import java.util.List;

public interface IcompS {

    List<Composant> retrieveAllComposants();

    Composant addComposant(Composant composant);

    List<Composant> addComposants(List<Composant> composants);

    Composant updateComposant(Composant composant);

    Composant retrieveComposant(Long id);

    void deleteComposant(Long id);
}
