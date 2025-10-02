package tn.esprit.twin.projetspringclasse.services.Comm;

import org.springframework.stereotype.Service;
import tn.esprit.twin.projetspringclasse.models.Commande;
import tn.esprit.twin.projetspringclasse.repository.CommandeRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommandeSer implements IcommS {

    private final CommandeRepo commandeRepository;

    public CommandeSer(CommandeRepo commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public List<Commande> retrieveAllCommandes() {
        return (List<Commande>) commandeRepository.findAll();
    }

    @Override
    public Commande addCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> addCommandes(List<Commande> commandes) {
        List<Commande> saved = new ArrayList<>();
        for (Commande c : commandes) {
            saved.add(commandeRepository.save(c));
        }
        return saved;
    }

    @Override
    public Commande updateCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande retrieveCommande(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCommande(Long id) {
        commandeRepository.deleteById(id);
    }
}
