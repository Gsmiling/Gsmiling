package model;

import java.util.Date;

public class Reservation extends IdentifiedObject{
    int r,c;
    String clientName;
    String roomId;
    private Date dateArrivee;
    private Date dateDepart;
    private Date dateReservation;
    private ReservationStatement reservationStatement;
    public  Reservation(int id, String roomId ,String clientId, Date dateArrivee, Date dateDepart, Date dateReservation, ReservationStatement reservationStatement){
        this.roomId = roomId;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.clientName = clientId;
        this.id = id;
        this.dateReservation = dateReservation;
        this.reservationStatement = reservationStatement;
    }
   
    public void setChambre(String roomId) {
        this.roomId = roomId;
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

    public String getRoomId() {
        return roomId;
    }

    public String getClientId() {
        return clientName;
    }

    public ReservationStatement getReservationStatement() {
        return reservationStatement;
    }

    public void setReservationStatement(ReservationStatement reservationStatement) {
        this.reservationStatement = reservationStatement;
    }
}
