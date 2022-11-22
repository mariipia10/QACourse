/*
 * 
 * 
 */
package secondHomework;

/**
 *
 * @author piahe
 */
public class Stewardess extends Employee {

    public Stewardess(String surname, Flight flight) {
        super(surname, flight);
    }

    @Override
    public void startWorking() {
        System.out.println("I'm  showing the safety procedures...");
    }

}
