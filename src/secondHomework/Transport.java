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

    public abstract int getCapacity();
    public Transport(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    
    

}
