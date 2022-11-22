/*
 * 
 * 
 */

package secondHomework;

/**
 *
 * @author piahe
 */
public class Ticket {
    int id;
    double price;
    Flight flight;
    Passanger passanger;

    public Ticket(int id, double price, Flight flight, Passanger passanger) {
        this.id = id;
        this.price = price;
        this.flight = flight;
        this.passanger = passanger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passanger getPassanger() {
        return passanger;
    }

    public void setPassanger(Passanger passanger) {
        this.passanger = passanger;
    }
    
    

}
