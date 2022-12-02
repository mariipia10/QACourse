/*
 * 
 * 
 */

package secondHomework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author piahe
 */
public class Airport {
    public List<Flight> flights;

    public Airport(List<Flight> flights) {
        this.flights = new ArrayList<>();
    }
    
    public boolean addFlight(Flight flight){
        return this.flights.add(flight);
    }
    public boolean addFlights(List<Flight> flights){
        return this.flights.addAll(flights);
    }
}
