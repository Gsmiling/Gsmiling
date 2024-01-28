package model;

public enum Characteristic {
    VENTILATED,
    CONDITIONNED,
    UNKNOWN; 
    
     public String toString() {
        
          switch (this) {
            case VENTILATED:
                return "VENTILATION";
            case CONDITIONNED:
                return "CLIMATISATION";
            default:
                return "UNKNOWN";
        }
    }

    public static Characteristic fromString(String ch) {
        if (ch == null) {
            return null;
        }

        switch (ch.toUpperCase()) {
            case "VENTILATION":
                return Characteristic.VENTILATED;
            case "CLIMATISATION":
                return Characteristic.CONDITIONNED;
           
            default:
               return UNKNOWN;
        }
    }

}
