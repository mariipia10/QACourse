/*
 * 
 * 
 */
package secondHomework;

/**
 *
 * @author piahe
 */
public class Flight implements Identifiable<Integer> {

    private FlightRoute flightRoute;
    private int id;
    private int arriveTime;
    private int departureTime;
    private Airplane airplane;
    private int availableSeats;

    public Flight(FlightRoute flightRoute, int id, int arriveTime, int departureTime, Airplane airplane, int availableSeats) {
        this.flightRoute = flightRoute;
        this.id = id;
        this.arriveTime = arriveTime;
        this.departureTime = departureTime;
        this.airplane = airplane;
        this.availableSeats = availableSeats;
    }

    public boolean hasCapacity() {
        return availableSeats >= airplane.getCapacity();
    }

    public double getPrice() {
        return flightRoute.getPrice();
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + this.arriveTime;
        hash = 37 * hash + this.departureTime;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Flight other = (Flight) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.arriveTime != other.arriveTime) {
            return false;
        }
        return this.departureTime == other.departureTime;
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
