package provider;

import model.IdentifiedObject;
import model.Room; // Assurez-vous d'importer la classe Room ou le type d'objet approprié.

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Characteristic;
import model.Location;
import model.RoomType;

public class RoomProvider implements ProviderMethod {
    public static RoomProvider instance;
    static private Provider provider;

    private RoomProvider() {

    }

    public static RoomProvider getInstance() {
        if (instance == null) {
            provider = Provider.getInstance();
            instance = new RoomProvider();
        }
        return instance;
    }

    @Override
    public boolean add(IdentifiedObject object) {
        if (!(object instanceof Room)) { // Assurez-vous que Room correspond au type d'objet que vous manipulez.
            return false;
        }

        String sql = "INSERT INTO room (num_room, status, price,type,situation,characteristic) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            Room room = (Room) object;
            
            preparedStatement.setString(1, room.getNumeroChambre());
            preparedStatement.setString(2, room.getStatus());
            preparedStatement.setDouble(3, room.getPrix());
            preparedStatement.setString(4, room.getRoomType().toString());
            preparedStatement.setString(5, room.getLocation().toString());
            preparedStatement.setString(6, room.getCharacteristic().toString());
           
            int rowsInserted = preparedStatement.executeUpdate();

            return rowsInserted > 0; // Vérifie si une ligne a été insérée avec succès
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(IdentifiedObject object) {
        if (!(object instanceof Room)) {
            return false;
        }

        String sql = "DELETE FROM room WHERE id = ?";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            Room room = (Room) object;
            preparedStatement.setInt(1, room.getId());

            int rowsDeleted = preparedStatement.executeUpdate();

            return rowsDeleted > 0; // Vérifie si une ligne a été supprimée avec succès
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean update(IdentifiedObject object) {
        if (!(object instanceof Room)) {
            return false;
        }

        String sql = "UPDATE room SET num_room = ?, status = ?, price = ? ,type =?, situation=?,characteristic=? WHERE id = ?";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            Room room = (Room) object;
            preparedStatement.setInt(7, room.getId()); 
            preparedStatement.setString(1, room.getNumeroChambre());
            preparedStatement.setString(2, room.getStatus());
            preparedStatement.setDouble(3, room.getPrix());
             preparedStatement.setString(4, room.getRoomType().toString());
            preparedStatement.setString(5, room.getLocation().toString());
            preparedStatement.setString(6, room.getCharacteristic().toString());
           
            
            int rowsUpdated = preparedStatement.executeUpdate();

            return rowsUpdated > 0; // Vérifie si une ligne a été mise à jour avec succès
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public IdentifiedObject getElementById(Object id) {
        if (!(id instanceof Integer)) {
            return null;
        }

        String sql = "SELECT * FROM room WHERE id = ?";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, (int) id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Room room = new Room(
                     resultSet.getInt("id"),
                    resultSet.getString("num_room"),
                    resultSet.getDouble("price"),
                        Location.fromString(resultSet.getString("situation")),
                        Characteristic.fromString(resultSet.getString("characteristic")),
                        RoomType.fromString(resultSet.getString("type")),
                        resultSet.getString("status")
                );
                return room;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    public List<Room> getAllRooms(){
        String sql = "SELECT * FROM room ";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Room> listeRooms = new ArrayList<>();

            while (resultSet.next()) {
                Room room = new Room(
                    resultSet.getInt("id"),
                    resultSet.getString("num_room"),
                    resultSet.getDouble("price"),
                        Location.fromString(resultSet.getString("situation")),
                        Characteristic.fromString(resultSet.getString("characteristic")),
                        RoomType.fromString(resultSet.getString("type")),
                                resultSet.getString("status")
                );
                listeRooms.add(room);
            }

                return new ArrayList<>(listeRooms);
        }   catch (SQLException ex) {
                Logger.getLogger(RoomProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
         return new ArrayList<>();
    }
    
    
    @Override
    public List<IdentifiedObject> getAll() {
       
        List<IdentifiedObject> obj  = new ArrayList<>();
                obj.addAll(getAllRooms());
        return obj;
    }

}
