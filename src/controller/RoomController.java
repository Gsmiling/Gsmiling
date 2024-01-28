
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Room;
import provider.RoomProvider;


public class RoomController {
    private RoomProvider roomProvider;
    List<Room> rooms = new ArrayList<>();

    public RoomController() {
        this.roomProvider = roomProvider.getInstance();
        updateRoomTable(null);
    }

    public boolean addRoom(Room room) {
            // Ajoutez le client à la base de données via le ClientProvider
            if (roomProvider.add(room)) {

            // Mettez à jour la vue avec la nouvelle liste de clients
            updateRoomTable(room);
            return true;

              
            }
            return false;
     
    }

    // Autres méthodes du contrôleur

    private void updateRoomTable(Room room) {
        // Mettez à jour la table des clients dans la vue
        if(room != null){
            rooms.add(0, room);
        } else {
        
        rooms = roomProvider.getAllRooms();
            
        }
        
    }
    
    public List<Room> getRooms() {
        return rooms;
    }
    public boolean editRoom(Room room){
        if(roomProvider.update(room)){
            updateRoomTable(null);
            return true;
        }
        
        return false;
    }
    
    public boolean deleteRoom(Room room){
        if(roomProvider.delete(room)){
            //clients.removeIf(name -> name.getId())
           roomProvider.delete(room);
        updateRoomTable(null);
        return true;
    }
        return false;
    }

}

