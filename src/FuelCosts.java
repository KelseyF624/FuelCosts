import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FuelCosts {
    public static void main(String[] args) {
        do {
            System.out.println("Please enter the number of gallons of gas in the tank.");
            Scanner scanner = new Scanner(System.in);
            int gallons = scanner.nextInt();
            scanner.close();
            if (gallons < 0)
                System.out.println("Invalid gallons");
        }while (gallons > 0);
        do {
            System.out.println("Please enter the fuel efficiency in miles per gallon.");
            Scanner scanner = new Scanner(System.in);
            int fuelEfficiency = scanner.nextInt();
            scanner.close();
            if (fuelEfficiency < 0)
                System.out.println("Invalid fuel efficiency");
        }while (fuelEfficiency > 0);
        do {
            System.out.println("Please enter the price of gas per gallon.");
            Scanner scanner = new Scanner(System.in);
            int gasPrice = scanner.nextInt();
            scanner.close();
            if (gasPrice < 0)
                System.out.println("Invalid gas");
        }while (gasPrice > 0);
        int drive100 = gallons / 100 * gasPrice;
        int distanceWithFuel = gallons / 100 * fuelEfficiency;
        System.out.println("The cost to drive 100 miles is " + drive100);
        System.out.println("The total distance with the fuel is " + distanceWithFuel);
    }
}