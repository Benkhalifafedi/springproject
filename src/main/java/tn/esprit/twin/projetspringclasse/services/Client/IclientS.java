package tn.esprit.twin.projetspringclasse.services.Client;

import tn.esprit.twin.projetspringclasse.models.Client;
import java.util.List;

public interface IclientS {

    List<Client> retrieveAllClients();

    Client addClient(Client client);

    List<Client> addClient(List<Client> clients);

    Client updateClient(Client client);

    Client retrieveClient(Long id);

    void deleteClient(Long id);
}
