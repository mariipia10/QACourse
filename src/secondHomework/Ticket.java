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
public class Ticket {

    int id;
    double totalPrice;
    public List<Flight> flights;
    Passanger passanger;
    boolean hasLayover;
    public Ticket(int id, double price, Flight flight, Passanger passanger) {
        setId(id);
        setTotalPrice(price);
        setPassanger(passanger);
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    

    private void setPassanger(Passanger passanger) {
        this.passanger = passanger;
    }

    public int getId() {
        return id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }


    public Passanger getPassanger() {
        return passanger;
    }

}
