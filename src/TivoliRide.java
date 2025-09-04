public class TivoliRide {

    // attributes
    private double height;

    // constructor
    public TivoliRide(double height) {
        this.height = height;
    }

    // returns a message indicating ride eligibility
    public String getEligibilityMessage() {
        if (height >= 1.50) {
            return "Enjoy the ride! Please keep your arms and legs inside the ride at all times";
        } else {
            return "Sorry, you are not eligible for this ride. Come back when you are taller than 1,50m";
        }
    }
}


