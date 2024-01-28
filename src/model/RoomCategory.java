package model;

public class RoomCategory extends IdentifiedObject {
    protected Location location;
    protected Characteristic characteristic;
    protected RoomType roomType;
    public RoomCategory(int id, Location location, Characteristic characteristic, RoomType roomtype){
       
       this.characteristic = characteristic;
       this.roomType = roomtype;
       this.location = location;
       this.id = id;
    }

   
 
    public Location getLocation() {
        return location;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
