/*
 * 
 * 
 */
package secondHomework;

/**
 *
 * @author piahe
 */
public class FlightRoute {

    private String fromCountry;
    private String toCountry;
    private Double price;
    
    public FlightRoute(String fromCountry, String toCountry) {
        setFromCountry(fromCountry);
        setToCountry(toCountry);
    }

    public String getFromCountry() {
        return fromCountry;
    }

    private void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getToCountry() {
        return toCountry;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

}
