package SB;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    //@Autowired
    //private ClientRepository clientRepository;
    
    private final ClientRepository clientRepository;
    //?
    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
       this.clientRepository = clientRepository;
    }

    @Override
    public void create(Client client) {
        System.out.print("public void create(Client client) ");
        clientRepository.save(client);
    }

    @Override
    public List<Client>  readAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client read(int id) {
        return clientRepository.getOne(id);
    }

    @Override
    public boolean update(Client client, int id) {
        if (clientRepository.existsById(id)) {
            client.setId(id);
            clientRepository.save(client);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
