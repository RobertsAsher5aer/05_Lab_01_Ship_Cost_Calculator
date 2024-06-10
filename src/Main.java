import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initiates scanner so we can get user input
        Scanner in = new Scanner(System.in);

        // Defines needed variables

        double shippingCost = 0.0;
        final double shipRate = 0.02;
        double finalCost = 0.0;

        System.out.print("Enter the price of your item: $");
        double itemPrice = in.nextDouble();


        if (itemPrice >= 100) {
            finalCost = itemPrice;
            System.out.println("Great, your shipping is free. Your final cost is: $" + finalCost + " " + "And your shipping cost was: $" + shippingCost);

        } else if (itemPrice <= 100) {
            shippingCost = itemPrice * shipRate;
            finalCost = itemPrice + shippingCost;
            System.out.println("With a ship rate of " + shipRate + ", your shipping cost is: $" + shippingCost + " And your final cost is: $" + finalCost);

        } else {
            System.out.println("Please enter a valid item price.");
        }




    }
}