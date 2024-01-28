package model;

public enum ReservationStatement {
    RESERVATED,
    CONFIRMED,
    CANCELLED,
    UNKNOWN;
    
     public String toString() {
        
          switch (this) {
            case RESERVATED:
                return "RESERVE";
            case CONFIRMED:
                return "CONFIRME";
            case CANCELLED:
                return "ANNULE";
              
            default:
                return "UNKNOWN";
                
        }
    }

    public static ReservationStatement fromString(String reservation) {
        if (reservation == null) {
            return null;
        }

        switch (reservation.toUpperCase()) {
            case "RESERVE":
                return ReservationStatement.RESERVATED;
            case "CONFIRME":
                return ReservationStatement.CONFIRMED;
            case "ANNULE":
                return ReservationStatement.CANCELLED;
           
            default:
               return UNKNOWN;
        }
    }

}
