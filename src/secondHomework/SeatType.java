/*
 * 
 * 
 */
package secondHomework;

/**
 *
 * @author piahe
 */
public enum SeatType {
    ECONOMY(50),
    PREMIUM_ECONOMY(75),
    BUSINESS(100),
    FIRST_CLASS(150);
    
    private double basePrice;

    private SeatType(double basePrice) {
        this.basePrice = basePrice;
    }
    
    public double getBasePrice() {
        return this.basePrice;
    }
}
