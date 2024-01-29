package model;

import java.util.Date;

public class Reservation extends IdentifiedObject{
    int r,c;
    String clientName;
    String roomNum;
    int roomId;
    private int clientId;
    private Date dateArrivee;
    private Date dateDepart;
    private Date dateReservation;
    private ReservationStatement reservationStatement;
    public  Reservation(int id, int clientId, int roomId, String roomNum ,String clientName, Date dateArrivee, Date dateDepart, Date dateReservation, ReservationStatement reservationStatement){
        this.roomNum = roomNum;
        this.roomId = roomId;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.clientName = clientName;
        this.id = id;
        this.clientId = clientId;
        this.dateReservation = dateReservation;
        this.reservationStatement = reservationStatement;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
   
    public void setChambre(String roomId) {
        this.roomNum = roomId;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Date getDateArrivee() {
        return  dateArrivee;
    }
    
    public Date getDateDepart() {
        return  dateDepart;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public String getClientName() {
        return clientName;
    }

    public ReservationStatement getReservationStatement() {
        return reservationStatement;
    }

    public void setReservationStatement(ReservationStatement reservationStatement) {
        this.reservationStatement = reservationStatement;
    }
}
