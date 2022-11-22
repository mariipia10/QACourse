/*
 * 
 * 
 */

package secondHomework;

/**
 *
 * @author piahe
 */
public abstract class Employees {
    private String surname;
    private Flight flight;

    public Employees(String surname,Flight flight) {
        this.surname = surname;
        setFlight(flight);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setFlight(Flight flight){
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
    
    public abstract void startWorking();

}
