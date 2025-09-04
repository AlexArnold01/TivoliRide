import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height in centimeters: ");
        double height = input.nextDouble();

        TivoliRide ride = new TivoliRide(height);
        String result = ride.getEligibilityMessage();
        System.out.println(result);

        input.close();
    }
}
