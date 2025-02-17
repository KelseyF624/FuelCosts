import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        double gallons;
        do {
            System.out.println("Please enter the number of gallons of gas in the tank.");
            Scanner scanner = new Scanner(System.in);
            gallons = scanner.nextDouble();
            scanner.close();
            if (gallons < 0)
                System.out.println("Invalid gallons");
        }while (gallons > 0);
        double fuelEfficiency;
        do {
            System.out.println("Please enter the fue l efficiency in miles per gallon.");
            Scanner scanner = new Scanner(System.in);
            fuelEfficiency = scanner.nextDouble();
            scanner.close();
            if (fuelEfficiency < 0)
                System.out.println("Invalid fuel efficiency");
        }while (fuelEfficiency > 0);
        double gasPrice;
        do {
            System.out.println("Please enter the price of gas per gallon.");
            Scanner scanner = new Scanner(System.in);
            gasPrice = scanner.nextDouble();
            scanner.close();
            if (gasPrice < 0)
                System.out.println("Invalid gas");
        }while (gasPrice > 0);
        double drive100 = gallons / 100 * gasPrice;
        double distanceWithFuel = gallons / 100 * fuelEfficiency;
        System.out.println("The cost to drive 100 miles is " + drive100);
        System.out.println("The total distance with the fuel is " + distanceWithFuel);
    }
}