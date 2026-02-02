/* CS109 - Introduction to Programming

Part 1: Determining Perfect Numbers
    - Create a nested loop in the Main java class to determine perfect numbers between 1 and 200

Part 2: Allow User to Choose
    - Take user input of integer type
    - This value is the upper limit of the search for perfect numbers
    - Change the data type to allow larger numbers

Sources:    

    Fulton, R. (2021, December 30) Comments in Java: Syntax & Example. Study.com. 
        https://study.com/academy/lesson/comments-in-java-syntax-example.html
    
    Meinecke, L. (2023, August 23) Java: If Statements. Study.com. 
        https://study.com/academy/lesson/java-if-statements.html
        
    Gibbs, M. (2023, August 23) Nested For Loops in Java. Study.com. 
        https://study.com/academy/lesson/nested-for-loops-in-java.html

    Gibbs, M. (2023, June 3) Java Data Types: Short, Int & Long. Study.com. 
        https://study.com/academy/lesson/java-data-types-short-int-long.html

    Nieradko, M. (2024, June 30) Standard Input Methods in Java. Study.com. 
        https://study.com/academy/lesson/using-stdin-for-standard-input-in-java.html

    GeeksforGeeks. (2016, February 9). Scanner Class in Java. GeeksforGeeks. 
        https://www.geeksforgeeks.org/java/scanner-class-in-java/
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
        for (long i = 1; i <= userInput; i++) {
            // variable to store sum of divisors
            long sum = 1; // 1 is always a divisor (except for 1 itself)

            // skip 1 as it's not a perfect number
            if (i == 1)
                continue;

            // optimized loop: only check divisors up to sqrt(i)
            for (long j = 2; j * j <= i; j++) {

                // if j is a divisor of i, add both j and i/j to sum
                if (i % j == 0) {
                    sum = sum + j;
                    // add the paired divisor if it's different from j
                    if (j != i / j) {
                        sum = sum + (i / j);
                    }
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
