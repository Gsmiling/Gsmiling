
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Reservation;
import provider.ReservationProvider;


public class ReservationController {
    private ReservationProvider reservationProvider;
    List<Reservation> reservations = new ArrayList<>();

    public ReservationController() {
        this.reservationProvider = ReservationProvider.getInstance();
        updateReservationTable(null);
    }

    public boolean addReservation(Reservation reservation) {
            // Ajoutez le client à la base de données via le ClientProvider
            if (reservationProvider.add(reservation)) {

            // Mettez à jour la vue avec la nouvelle liste de clients
            updateReservationTable(reservation);
            return true;

              
            }
            return false;
     
    }

    // Autres méthodes du contrôleur

    private void updateReservationTable(Reservation reservation) {
        // Mettez à jour la table des clients dans la vue
        if(reservation != null){
            reservations.add(0, reservation);
        } else {
        
        reservations = reservationProvider.getAllReservations();
            
        }
        
    }
    
    public List<Reservation> getReservations() {
        return reservations;
    }
    public boolean editReservation(Reservation reservation){
        if(reservationProvider.update(reservation)){
            updateReservationTable(null);
            return true;
        }
        
        return false;
    }
    
    public boolean deleteReservation(Reservation reservation){
        if(reservationProvider.delete(reservation)){
            //clients.removeIf(name -> name.getId())
           reservationProvider.delete(reservation);
        updateReservationTable(null);
        return true;
    }
        return false;
    }
    
}
