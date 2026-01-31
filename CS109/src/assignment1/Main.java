/* CS109 - Introduction to Programming

Part 1: Determining Perfect Numbers
    - Create a nested loop in the Main java class to determine perfect numbers between 1 and 200

Part 2: Allow User to Choose
    - Take user input of integer type
    - This value is the upper limit of the search for perfect numbers
    - Change the data type to allow larger numbers
*/

package assignment1;

// import scanner class for user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating scanner object for user input
        Scanner input = new Scanner(System.in);

        // prompt user for upper limit
        System.out.println("Enter an upper limit to search for perfect numbers:");

        // store user input as long data type
        long userInput = input.nextLong();

        // displaying perfect numbers found
        System.out.println("Perfect numbers between 1 and " + userInput + " are:");

        // loop through numbers from 1 to userInput
        for (int i = 1; i <= userInput; i++) {
            // variable to store sum of divisors
            int sum = 0;

            // nested loop to find divisors of i
            for (int j = 1; j < i; j++) {

                // if j is a divisor of i, add to sum
                if (i % j == 0) {
                    sum = sum + j;
                }
            }

            // if sum (of divisors) equals i, i is a perfect number
            if (sum == i) {
                System.out.println(i);
            }

        }

        // closing input scanner
        input.close();
    }
}
