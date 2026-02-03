import java.util.Scanner;

/**
 * Utility class to find the largest of three numbers.
 */
public class LargestOfThree {
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Finds and displays the largest of three user-input numbers.
     */
    public static void findLargestNumber() {
        System.out.println("=== Largest of Three Numbers ===");
        System.out.println();

        int firstNumber = getValidInput("Enter first number: ");
        int secondNumber = getValidInput("Enter second number: ");
        int thirdNumber = getValidInput("Enter third number: ");

        int largest = findLargest(firstNumber, secondNumber, thirdNumber);

        System.out.println();
        System.out.println("The largest among " + firstNumber + ", " + secondNumber +
                ", and " + thirdNumber + " is: " + largest);
    }

    /**
     * Gets a valid integer input from the user.
     * 
     * @param prompt the prompt to display
     * @return a valid integer input
     */
    private static int getValidInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                if (SCANNER.hasNextInt()) {
                    return SCANNER.nextInt();
                } else {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    SCANNER.nextLine(); // discard invalid input
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                SCANNER.nextLine();
            }
        }
    }

    /**
     * Finds the largest of three numbers.
     * 
     * @param a first number
     * @param b second number
     * @param c third number
     * @return the largest number
     */
    public static int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
