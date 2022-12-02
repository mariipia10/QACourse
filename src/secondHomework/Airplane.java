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

    @Override
    public int getCapacity() {
        return this.capacity;
    }

   

}
