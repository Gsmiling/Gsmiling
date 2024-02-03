package controller;

import java.util.ArrayList;
import java.util.List;
import model.Service;
import provider.ServiceProvider;

public class ServiceController {
     private ServiceProvider serviceProvider;
    List<Service> services = new ArrayList<>();

    public ServiceController() {
        this.serviceProvider = serviceProvider.getInstance();
        updateServiceTable(null);
    }

    public boolean addService(Service service) {
            // Ajoutez le client à la base de données via le ClientProvider
            if (serviceProvider.add(service)) {

            // Mettez à jour la vue avec la nouvelle liste de clients
            updateServiceTable(service);
            return true;

              
            }
            return false;
     
    }

    // Autres méthodes du contrôleur

    private void updateServiceTable(Service service) {
        // Mettez à jour la table des clients dans la vue
        if(service != null){
            services.add(0, service);
        } else {
        
        services = serviceProvider.getAllServices();
            
        }
        
    }
    
    public List<Service> getServices() {
        return services;
    }
    public boolean editService(Service service){
        if(serviceProvider.update(service)){
            updateServiceTable(null);
            return true;
        }
        
        return false;
    }
    
    public boolean deleteService(Service service){
        if(serviceProvider.delete(service)){
            //clients.removeIf(name -> name.getId())
           serviceProvider.delete(service);
        updateServiceTable(null);
        return true;
    }
        return false;
    }
    
}
