package model;

public class Client extends IdentifiedObject {

    private  String clientName;
    private  String firstName;
    private  int numCart;
    private  int phoneNumber;
    private  String nationality;
    private  String address;
    private  ClientCategory clientCategory;
    private byte[] photo;



    public Client(int id, String nameCli, String firstName, int numCart, int phoneNumber, String nationality, String address, ClientCategory clientCategory,byte[] photo){
        this.clientName = nameCli;
        this.numCart = numCart;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.nationality = nationality;
        this.firstName = firstName;
        this.clientCategory = clientCategory;
        this.photo = photo;
        this.address = address;
        
 
    }
    public Client(){
        
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setNumCart(int numCart) {
        this.numCart = numCart;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
    public int getNumCart() {
        return numCart;
    }

    public String getNameCli() {
        return clientName;
    }
    public String getFirstName(){
        return firstName;
    }

    public int getNumPhone() {
        return phoneNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public ClientCategory getClientCategory() {
        return clientCategory;
    }
    public void setClientCategory(ClientCategory clientCategory) {
        this.clientCategory = clientCategory;
    }
    public byte[] getPhoto() {
        if (photo == null) {
            return new byte[0];
        }
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    
    @Override
    public String toString() {
        return "id " + id + "Name " + clientName + " firstname " + firstName + " " + "phone: " + phoneNumber + " nat: " + nationality + " category: " + clientCategory;
    }

}
