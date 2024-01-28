package provider;

import java.sql.Date;
import model.IdentifiedObject;
import model.Reservation;
import java.text.SimpleDateFormat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ReservationStatement;

public class ReservationProvider implements ProviderMethod {
    public static ReservationProvider instance;
    static private Provider provider;

    private ReservationProvider() {

    }

    public static ReservationProvider getInstance() {
        if (instance == null) {
            provider = Provider.getInstance();
            instance = new ReservationProvider();
        }
        return instance;
    }

    @Override
    public boolean add(IdentifiedObject object) {
        if (!(object instanceof Reservation)) {
            return false;
        }
        

     String sql = "INSERT INTO reservation (id_client, id_room, date_arrival, date_departure, date_reservation, status) VALUES (?, ?, ?, ?, ?, ?)";

    try {
        PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
        Reservation reservation = (Reservation) object;
        
        // Convertissez les java.util.Date en java.sql.Date
        java.sql.Date sqlDateArrivee = new java.sql.Date(reservation.getDateArrivee().getTime());
        java.sql.Date sqlDateDepart = new java.sql.Date(reservation.getDateDepart().getTime());
        java.sql.Date sqlDateReservation = new java.sql.Date(reservation.getDateReservation().getTime());
        
        preparedStatement.setString(1, reservation.getClientId());
        preparedStatement.setString(2, reservation.getRoomId());
        preparedStatement.setDate(3, sqlDateArrivee);
        preparedStatement.setDate(4, sqlDateDepart);
        preparedStatement.setDate(5, sqlDateReservation);
        preparedStatement.setString(6, reservation.getReservationStatement().toString());

        int rowsInserted = preparedStatement.executeUpdate();

        return rowsInserted > 0; // Vérifiez si une ligne a été insérée avec succès
    } catch (SQLException e) {
        e.printStackTrace(); // Imprimez la trace de la pile pour le débogage
    }

    return false;
    }

    @Override
    public boolean delete(IdentifiedObject object) {
        if (!(object instanceof Reservation)) {
            return false;
        }

        String sql = "DELETE FROM reservation WHERE id = ?";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            Reservation reservation = (Reservation) object;
            preparedStatement.setInt(1, reservation.getId());

            int rowsDeleted = preparedStatement.executeUpdate();

            return rowsDeleted > 0; // Vérifie si une ligne a été supprimée avec succès
        } catch (SQLException e) {
        }

        return false;
    }

    @Override
    public boolean update(IdentifiedObject object) {
        if (!(object instanceof Reservation)) {
            return false;
        }

        String sql = "UPDATE reservation SET date_arrival = ?, date_departure = ?, date_reservation = ?, status = ? WHERE id = ?";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            Reservation reservation = (Reservation) object;
            java.sql.Date sqlDateArrivee = new java.sql.Date(reservation.getDateArrivee().getTime());
            java.sql.Date sqlDateDepart = new java.sql.Date(reservation.getDateDepart().getTime());
            java.sql.Date sqlDateReservation = new java.sql.Date(reservation.getDateReservation().getTime());
            preparedStatement.setInt(5, reservation.getId());
            preparedStatement.setDate(1, sqlDateArrivee);
            preparedStatement.setDate(2, sqlDateDepart);
            preparedStatement.setDate(3, sqlDateReservation);
            preparedStatement.setString(4, reservation.getReservationStatement().toString());

            int rowsUpdated = preparedStatement.executeUpdate();

            return rowsUpdated > 0; // Vérifie si une ligne a été mise à jour avec succès
        } catch (SQLException e) {e.printStackTrace();
        }

        return false;
    }

    @Override
    public IdentifiedObject getElementById(Object id) {
        if (!(id instanceof Integer)) {
            return null;
        }

        String sql = "SELECT * FROM reservation ";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, (int) id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Reservation reservation = new Reservation(
                        resultSet.getInt("id"),
                        resultSet.getString("id_room"),
                        resultSet.getString("id_client"),
                        resultSet.getDate("date_arrival"),
                        resultSet.getDate("date_departure"),
                        resultSet.getDate("date_reservation"),
                        ReservationStatement.fromString(resultSet.getString("status"))
                        
                       
                );
                return reservation;
            }
        } catch (SQLException e) {
        }

        return null;
    }
     public List<Reservation> getAllReservations(){
       String sql = "SELECT reservation.id, room.num_room, client.client_name ,reservation.date_arrival, reservation.date_departure,reservation.date_reservation, reservation.status"
               + "  FROM reservation INNER JOIN client ON client.id = reservation.id_client INNER JOIN room ON room.id = reservation.id_room ";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Reservation> listeReservations = new ArrayList<>();

            while (resultSet.next()) {
                Reservation reservation = new Reservation(
                        resultSet.getInt("id"), 
                        resultSet.getString("num_room"),
                        resultSet.getString("client_name"),
                        resultSet.getDate("date_arrival"),
                        resultSet.getDate("date_departure"),
                        resultSet.getDate("date_reservation"),
                        ReservationStatement.fromString(resultSet.getString("status"))
                );
                System.out.println("provider.ReservationProvider.getAllReservations()"+ reservation);
                listeReservations.add(reservation);
            }

            return new ArrayList<>(listeReservations);
        } catch (SQLException e) { e.printStackTrace();
        }

        return new ArrayList<>();
    }
    
    
    
    @Override
    public List<IdentifiedObject> getAll() {
       
        List<IdentifiedObject> obj  = new ArrayList<>();
                obj.addAll(getAllReservations());
        return obj;
    }


    
   
}
