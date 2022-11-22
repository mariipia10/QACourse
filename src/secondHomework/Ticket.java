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
        setId(id);
        setPrice(price);
        setFlight(flight);
        setPassanger(passanger);
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setFlight(Flight flight) {
        this.flight = flight;
    }

    private void setPassanger(Passanger passanger) {
        this.passanger = passanger;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passanger getPassanger() {
        return passanger;
    }

}
