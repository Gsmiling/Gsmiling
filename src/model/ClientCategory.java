
package model;

public enum ClientCategory {
    PRIVATECLIENTS,
    BUSINESSCLIENTS,
    CLIENTGROUP,
    VIPCLIENTS,
    UNKNOWN;
    
    @Override
     public String toString() {
          switch (this) {
            case PRIVATECLIENTS:
                return "CLIENT PRIVE";
            case BUSINESSCLIENTS:
                return "CLIENT AFFAIRE";
            case CLIENTGROUP:
                return "CLIENT GROUPE";
            case VIPCLIENTS:
                return "CLIENT VIP";
            default:
                return "UNKOWN";
        }
          
    }

    public static ClientCategory fromString(String clientCategory ){
        if (clientCategory == null) {
            return null;
        }

        switch (clientCategory.toUpperCase()) {
            case "CLIENT PRIVE":
                return ClientCategory.PRIVATECLIENTS;
            case "CLIENT AFFAIRE":
                return ClientCategory.BUSINESSCLIENTS;
            case "CLIENT GROUPE":
                return ClientCategory.CLIENTGROUP;
            case "CLIENT VIP":
                return ClientCategory.VIPCLIENTS;    
            default:
                return UNKNOWN;
        }
    }

}
