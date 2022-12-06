/*
 * 
 * 
 */
package secondHomework;

import secondHomework.interfacebla.Identifiable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author piahe
 */
public class Ticket implements Identifiable<Integer> {

    private int id;
    private double totalPrice;
    private List<Flight> flights;
    private Passanger passanger;
    private boolean hasLayover;

    public Ticket(int id, double price, Flight flight, Passanger passanger) {
        setID(id);
        setTotalPrice(price);
        setPassanger(passanger);
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public Passanger getPassanger() {
        return passanger;
    }

    @Override
    public Integer getID() {
        return this.id;
    }

    @Override
    public void setID(Integer x) {
        this.id = x;
    }

}
