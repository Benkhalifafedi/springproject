package tn.esprit.twin.projetspringclasse.services.Comm;

import tn.esprit.twin.projetspringclasse.models.Commande;
import java.util.List;

public interface IcommS {

    List<Commande> retrieveAllCommandes();

    Commande addCommande(Commande commande);

    List<Commande> addCommandes(List<Commande> commandes);

    Commande updateCommande(Commande commande);

    Commande retrieveCommande(Long id);

    void deleteCommande(Long id);
}
