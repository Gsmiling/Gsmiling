package model;

public enum Location {
    SEAVIEW,
    INTERNALVIEW,
    STREETVIEW,
    GARDENVIEW,
    MOUNTAINVIEW,
    UNKNOWN;
    
     public String toString() {
       

          switch (this) {
            case SEAVIEW:
                return "VUE MER";
            case STREETVIEW:
                return "VUE RUE";
            case GARDENVIEW:
                return "VUE JARDIN";
            case MOUNTAINVIEW:
                return "VUE MONTAGNE";    
            default:
                return "UNKNOWN";
        }
    }

    public static Location fromString(String location) {
        if (location == null) {
            return null;
        }

        switch (location.toUpperCase()) {
            case "VUE MER":
                return Location.SEAVIEW;
            case "VUE RUE":
                return Location.STREETVIEW;
            case "VUE JARDIN":
                return Location.GARDENVIEW;
            case "VUE MONTAGNE":
                return Location.MOUNTAINVIEW;    
            default:
                return UNKNOWN;
        }
    }


}
