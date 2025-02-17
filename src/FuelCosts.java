import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        double gallons;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please enter the number of gallons of gas in the tank.");
            gallons = input.nextDouble();
            if (gallons <= 0){
                System.out.println("Invalid gallons.");}
        }while (gallons <= 0);
        double fuelEfficiency;
        do {
            System.out.println("Please enter the fuel efficiency in miles per gallon.");
            fuelEfficiency = input.nextDouble();
            if (fuelEfficiency <= 0){
                System.out.println("Invalid fuel efficiency");}
        }while (fuelEfficiency <= 0);
        double gasPrice;
        do {
            System.out.println("Please enter the price of gas per gallon.");
            gasPrice = input.nextDouble();
            if (gasPrice <= 0){
                System.out.println("Invalid gas");}
        }while (gasPrice <= 0);
        input.close();
        double drive100 = (100/fuelEfficiency) * gasPrice;
        double distanceWithFuel = gallons * fuelEfficiency;
        System.out.println("The cost to drive 100 miles is " + drive100);
        System.out.println("The total distance with the fuel is " + distanceWithFuel);
    }
}