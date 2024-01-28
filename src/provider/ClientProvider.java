package provider;

import model.Client;
import model.IdentifiedObject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ClientCategory;

public class ClientProvider implements ProviderMethod {
    public static ClientProvider instance;
    static private Provider provider;

    private ClientProvider() {

    }

    public static ClientProvider getInstance() {
        if (instance == null) {
            provider = Provider.getInstance();
            instance = new ClientProvider();
        }
        return instance;
    }

    @Override
    public boolean add(IdentifiedObject object) {
        if (!(object instanceof Client)) {
            return false;
        }

        String sql = "INSERT INTO client (client_name, first_name, num_cart, nationality, phone_number, address, client_category, photo) VALUES (?, ?, ?, ?, ?,  ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            Client client = (Client) object;
            preparedStatement.setString(1, client.getNameCli());
            preparedStatement.setString(2, client.getFirstName());
            preparedStatement.setInt(3, client.getNumCart());
            preparedStatement.setString(4, client.getNationality());
            preparedStatement.setInt(5, client.getNumPhone());
            preparedStatement.setString(6, client.getAddress());
            preparedStatement.setString(7, client.getClientCategory().toString());
            preparedStatement.setBytes(8, client.getPhoto());
           



            return preparedStatement.executeUpdate() > 0; //rowsInserted > 0; // Vérifie si une ligne a été insérée avec succès
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(IdentifiedObject object) {
        if (!(object instanceof Client)) {
            return false;
        }

        String sql = "DELETE FROM client WHERE id = ?";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            Client client = (Client) object;
            preparedStatement.setInt(1, client.getId());

            int rowsDeleted = preparedStatement.executeUpdate();

            return rowsDeleted > 0; // Vérifie si une ligne a été supprimée avec succès
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean update(IdentifiedObject object) {
        if (!(object instanceof Client)) {
            return false;
        }

            Client client = (Client) object;
        String sql = "UPDATE client SET client_name = ?, first_name = ?, num_cart = ?, nationality = ?, phone_number = ?, client_category = ?, photo = ? WHERE id = ?";
        System.out.println("provider.ClientProvider.update() " + client.getId());

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            preparedStatement.setInt(8, client.getId());
            preparedStatement.setString(1, client.getNameCli());
            preparedStatement.setString(2, client.getFirstName());
            preparedStatement.setInt(3, client.getNumCart());
            preparedStatement.setString(4, client.getNationality());
            preparedStatement.setInt(5, client.getNumPhone());
            preparedStatement.setString(6, client.getClientCategory().toString());
            preparedStatement.setBytes(7, client.getPhoto());

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

        String sql = "SELECT * FROM client WHERE id = ?";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, (int) id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Client client = new Client(
                        resultSet.getInt("id"),
                        resultSet.getString("client_name"),
                        resultSet.getString("first_name"),
                        resultSet.getInt("num_cart"),
                        resultSet.getInt("phone_number"),
                        resultSet.getString("nationality"),
                        resultSet.getString("address"),
                        ClientCategory.valueOf(resultSet.getString("client_category")),
                        resultSet.getBytes("photo")
                        
                );
                return client;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Client> getAllClients() {
        String sql = "SELECT * FROM client";

        try {
            PreparedStatement preparedStatement = provider.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Client> listeClients = new ArrayList<>();

            while (resultSet.next()) {
                Client client = new Client(
                        resultSet.getInt("id"),
                        resultSet.getString("client_name"),
                        resultSet.getString("first_name"),
                        resultSet.getInt("num_cart"),
                        resultSet.getInt("phone_number"),
                        resultSet.getString("nationality"),
                        resultSet.getString("address"),
                        ClientCategory.fromString(resultSet.getString("client_category")),
                         resultSet.getBytes("photo")
                );
                System.out.println("provider.ClientProvider.getAllClients() " + client);
                listeClients.add(client);
            }

            return new ArrayList<>(listeClients);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }
    
    @Override
    public List<IdentifiedObject> getAll() {
        List<IdentifiedObject> obj  = new ArrayList<>();
                obj.addAll(getAllClients());
        return obj;
    }
}
