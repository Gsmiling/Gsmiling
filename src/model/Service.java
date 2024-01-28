 package model;

public class Service extends IdentifiedObject {
    private String designation;
    String description;
    public Service(int id, String designation, String description){
        this.designation = designation;
        this.id = id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
