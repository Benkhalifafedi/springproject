package tn.esprit.twin.projetspringclasse.services.Client;

import org.springframework.stereotype.Service;
import tn.esprit.twin.projetspringclasse.models.Client;
import tn.esprit.twin.projetspringclasse.repository.ClientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientSer implements IclientS {

    private final ClientRepository clientRepository;

    public ClientSer(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> addClient(List<Client> clients) {
        List<Client> saved = new ArrayList<>();
        for (Client c : clients) {
            saved.add(clientRepository.save(c));
        }
        return saved;
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
