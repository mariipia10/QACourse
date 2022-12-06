/*
 * 
 * 
 */
package secondHomework;

/**
 *
 * @author piahe
 */
public class Main {
    public static void main(String[] args) {
    FlightRoute fr1= new FlightRoute("Argentina", "France",true);
    FlightRoute fr2 = new FlightRoute("France","Argentina",true);
    FlightRoute fr3 = new FlightRoute ("Argentina","Brasil",false);
    FlightRoute fr4 = new FlightRoute ("Brasil","Argentina",false);
    
    fr1.addLayover("Chile");
    fr2.addLayover("Paraguay");
    //Flight(FlightRoute flightRoute, int id, int arriveTime, int departureTime, Airplane airplane, int availableSeats) {

    Flight fl1 = new Flight(fr4, 1, 2054, 0205, new Airplane(2, 100), 50);
    Airport ezeiza = new Airport();
    ezeiza.addFlight(fl1);
    }
}
