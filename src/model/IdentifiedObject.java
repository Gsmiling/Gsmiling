
package model;


public class IdentifiedObject {
    protected int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
      this.id = id;
    }
    
    public interface Selection{
        public void onSelected(IdentifiedObject object);
    }
}

    

