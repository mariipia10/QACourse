/*
 * 
 * 
 */
package secondHomework;

import java.util.List;

/**
 *
 * @author piahe
 */
public interface IAirport {

    public Flight searchFlight(String from, String to);
    public void showFlights();
    
}
