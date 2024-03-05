import java.lang.Math;
import java.util.Scanner;

/**
 * My program calculates the volume of a sphere.
 *
 * @author  Kent Gatera
 * @version 1.0
 * @since   2024-March-4
 */

public final class Microwave {

    /**
    * Pleases the style checker.
    *
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */

    private Microwave() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is where the main code will be.
     *
     * @param args
     *
     */
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("This is the microwave time calculator.");
        // Getting input
        // Initializing food choices
        final String[] foodList = {"Soup", "Pizza", "Sub"};
        final int listSize = foodList.length;
        // Init soup time.
        final double subTime = 1;
        final double soupTime = 1.75;
        final double pizzaTime = 0.75;
        // food printer
        for (int counter = 0; counter < listSize; counter++) {
            System.out.print(counter + 1 + ". " + foodList[counter] + "\n");
        }
        System.out.print("What dish are you warming?: ");
        final String foodChoice = in.nextLine();
        // case checking the food choice.
        if (foodChoice.equalsIgnoreCase("pizza")) {
            try {
                // Asking the amount
                System.out.print("How many pizzas?: ");
                final int pizzaAmount = in.nextInt();
                // Calculating the time needed and displaying it.
                if (pizzaAmount > 0 && pizzaAmount <= 3) {
                    final double heatingTime = pizzaTime * (
                        1 + 0.5 * (pizzaAmount - 1));
                        System.out.println(
                            "It will take " + heatingTime + " minutes.");
                } else {
                    // Just in case the user enters an out of range food amount.
                    System.out.println("Food amount must be 1-3.");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid integer amount.\n");
            }
        } else if (foodChoice.equalsIgnoreCase("sub")) {
            try {
                System.out.print("How many subs?: ");
                final int subAmount = in.nextInt();
                // Calculating the time needed and displaying it.
                if (subAmount > 0 && subAmount <= 3) {
                    final double heatingTime = subTime * (
                        1 + 0.5 * (subAmount - 1));
                    System.out.println(
                            "It will take " + heatingTime + " minutes.");
                } else {
                    // Just in case the user enters an out of range food amount.
                    System.out.println("Food amount must be 1-3.");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid integer amount.\n");
            }
        } else if (foodChoice.equalsIgnoreCase("soup")) {
            try {
                // Asking the amount
                System.out.print("How many soups?: ");
                final int soupAmount = in.nextInt();
                // Calculating the time needed and displaying it.
                if (soupAmount > 0 && soupAmount <= 3) {
                    final double heatingTime = soupTime * (
                        1 + 0.5 * (soupAmount - 1));
                    System.out.println(
                        "It will take " + heatingTime + " minutes.");
                // Just in case the user enters an out of range food amount.
                } else {
                    System.out.println("Food amount must be 1-3.");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid integer amount.\n");
            }
        } else {
            System.out.println(foodChoice + " is not a valid option.");
        }
        // Closing to save resources.
        in.close();
    }
}
