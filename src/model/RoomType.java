package model;

public enum RoomType {
    SINGLE,
    DOUBLE,
    TRIPLE,
    UNKNOWN;
    
      public String toString() {
        

          switch (this) {
            case SINGLE:
                return "SINGLE";
            case DOUBLE:
                return "DOUBLE";
            case TRIPLE:
                return "TRIPLE";
            default:
                return "UNKNOWN";
        }
    }

    public static RoomType fromString(String roomTypeString) {
        if (roomTypeString == null) {
            return null;
        }

        switch (roomTypeString.toUpperCase()) {
            case "SINGLE":
                return RoomType.SINGLE;
            case "DOUBLE":
                return RoomType.DOUBLE;
            case "TRIPLE":
                return RoomType.TRIPLE;
            default:
                return UNKNOWN;
        }
    }

}
