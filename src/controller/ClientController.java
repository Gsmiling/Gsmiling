package controller;
import java.util.ArrayList;
import java.util.List;
import model.Client;
import provider.ClientProvider;

public class ClientController {
    private ClientProvider clientProvider;
    List<Client> clients = new ArrayList<>();

    public ClientController() {
        this.clientProvider = ClientProvider.getInstance();
        updateClientTable(null);
    }

    public boolean addClient(Client client) {
            // Ajoutez le client à la base de données via le ClientProvider
            if (clientProvider.add(client)) {

            // Mettez à jour la vue avec la nouvelle liste de clients
            updateClientTable(client);
            return true;

              
            }
            return false;
     
    }

    // Autres méthodes du contrôleur

    private void updateClientTable(Client client) {
        // Mettez à jour la table des clients dans la vue
        if(client != null){
            clients.add(0, client);
        } else {
        
        clients = clientProvider.getAllClients();
            
        }
        
    }
    
    public List<Client> getClients() {
        return clients;
    }
    public boolean editClient(Client client){
        if(clientProvider.update(client)){
            updateClientTable(null);
            return true;
        }
        
        return false;
    }
    
    public boolean deleteClient(Client client){
        if(clientProvider.delete(client)){
            //clients.removeIf(name -> name.getId())
           clientProvider.delete(client);
        updateClientTable(null);
        return true;
    }
        return false;
    }

}