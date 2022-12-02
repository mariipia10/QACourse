/*
 * 
 * 
 */

package secondHomework;

/**
 *
 * @author piahe
 */
public abstract class Transport {
    int id;
    int capacity;

    public abstract boolean hasCapacity();
    public Transport(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    
    

}
