/*
 * 
 * 
 */

package secondHomework;

/**
 *
 * @author piahe
 */
public class Airplanes {
    private int id;
    private int capacity;

    public Airplanes(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
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
    public int hashCode() {
        return super.hashCode(); 
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
    }

    @Override
    public String toString() {
        return "Airplanes{" + "id=" + id + ", capacity=" + capacity + '}';
    }
    

}
