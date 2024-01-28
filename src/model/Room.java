package model;

public class Room extends RoomCategory {

        private  String numeroChambre;
        private double prix;
        private String status;
        private boolean disponible;
        

    public Room(int id, String numeroChambre, double prix, Location location, Characteristic characteristic, RoomType roomtype, String status) {
                    super(id, location, characteristic, roomtype);
                    this.numeroChambre = numeroChambre;
                    this.prix = prix;
                    this.status = status;

            }
    
   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNumeroChambre(String numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isDisponible() {
        return disponible;
    }
        public String getNumeroChambre(){
                return numeroChambre;
        }
        public double getPrix(){
                return prix;
        }

}
