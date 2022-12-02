/*
 * 
 * 
 */
package secondHomework;

/**
 *
 * @author piahe
 */
public class Airplane extends Transport{
    private final static int MAX_CAPACITY=150;
    public Airplane(int id, int capacity) {
        super(MAX_CAPACITY, capacity);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    

    @Override
    public boolean hasCapacity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
