/*
 * 
 * 
 */
package secondHomework;

/**
 *
 * @author piahe
 */
public class Route {

    String fromCountry;
    String toCountry;

    public Route(String fromCountry, String toCountry) {
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

    private void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

}
