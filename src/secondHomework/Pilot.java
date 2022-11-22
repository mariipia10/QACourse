/*
 * 
 * 
 */

package secondHomework;

/**
 *
 * @author piahe
 */
public class Pilot extends Employees {

    public Pilot(String surname, Flight flight) {
        super(surname, flight);
    }

    @Override
    public void startWorking() {
        System.out.println("I'm setting up the controls of the plane to takeoff... ");
    }

}
