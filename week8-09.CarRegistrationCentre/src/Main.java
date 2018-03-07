
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write your main program here. Implementing your own classes will be useful.
        AirPort airport = new AirPort(reader);
        
        airport.airportService();
        
    }
}
