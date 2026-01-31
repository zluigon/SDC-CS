/* CS109 - Introduction to Programming

Part 1: Determining Perfect Numbers
    - Create a nested loop in the Main java class to determine perfect numbers between 1 and 200

Part 2: Allow User to Choose
    - Take user input of integer type
    - This value is the upper limit of the search for perfect numbers
    - Change the data type to allow larger numbers
*/

public class Main {
    public static void main(String[] args) {

        // loop through numbers from 1 to 200
        for (int i = 1; i <= 200; i++) {
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
                System.out.println(i + " is a perfect number.");
            }

        }
    }
}