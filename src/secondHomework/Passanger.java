/*
 * 
 * 
 */
package secondHomework;

import secondHomework.interfacebla.Identifiable;

/**
 *
 * @author piahe
 */
public final class Passanger implements Identifiable<String> {
    
    private String name;
    private String surname;
    private String passport;

    public Passanger(String surname, String passport) {
        this.surname = surname;
        this.passport = passport;
    }

    @Override
    public String getID() {
        return this.passport;
    }

    @Override
    public void setID(String x) {
        this.passport = x;
    }

    @Override
    public String toString() {
        return "Passanger{" + "name=" + name + ", surname=" + surname + ", passport=" + passport + '}';
    }

}
