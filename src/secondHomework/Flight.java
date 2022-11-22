/*
 * 
 * 
 */
package secondHomework;

/**
 *
 * @author piahe
 */
public class Flight {

    private int number;
    private int arriveTime;
    private int departureTime;
    private Prices airportArrival;
    private Prices airportDeparture;

    public Flight(int number, int arriveTime, int departureTime, Prices airportArrival, Prices airportDeparture) {
        setNumber(number);
        setArriveTime(arriveTime);
        setDepartureTime(departureTime);
        setAirportArrival(airportArrival);
        setAirportDeparture(airportDeparture);
    }

    public int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    public int getArriveTime() {
        return arriveTime;
    }

    private void setArriveTime(int arriveTime) {
        this.arriveTime = arriveTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    private void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public Prices getAirportArrival() {
        return airportArrival;
    }

    private void setAirportArrival(Prices airportArrival) {
        this.airportArrival = airportArrival;
    }

    public Prices getAirportDeparture() {
        return airportDeparture;
    }

    private void setAirportDeparture(Prices airportDeparture) {
        this.airportDeparture = airportDeparture;
    }

    @Override
    public String toString() {
        return "Flight details:" + "number:" + number + ", arriveTime¨:" + arriveTime + ", departureTime:" + departureTime + ", airportArrival:" + airportArrival + ", airportDeparture:" + airportDeparture + '}';
    }

}
