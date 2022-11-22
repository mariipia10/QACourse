/*
 * 
 * 
 */

package secondHomework;

/**
 *
 * @author piahe
 */
public class Prices {
    private String location;
    private String shortname;

    public Prices(String location, String shortname) {
        this.location = location;
        this.shortname = shortname;
    }

    @Override
    public String toString() {
        return "Airport"+ shortname +" is located in "  + location + ".";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }
 

}
