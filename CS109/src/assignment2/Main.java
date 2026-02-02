/* CS109 - Introduction to Software Engineering - Assignment 2

Part 1: Creating The Class and Method
    - Create a class for Rectangle and the appropriate method to calculate area
    - Prompt the user to enter the dimensions, call the method and return a valid value
    - Check for input/output errors

Part 2: Add Volume
    - Add appropriate method(s) for calculating volume for containers.
    - Include a cylinder, cube, and sphere
    - Create the appropriate classes for each
    - Create the methods for each
    - Prompt users to enter values to calculate volume for at least one of the shapes.

Sources:

    Gibbs, M. (2023, August 23) Switch Statement in Java: Example & Syntax. Study.com. 
        https://study.com/academy/lesson/switch-statement-in-java-example-syntax.html

    Zandbergen, P. (2024, June 20) Object-Oriented Programming: Objects, Classes & Methods. Study.com.
        https://study.com/academy/lesson/oop-object-oriented-programming-objects-classes-interfaces.html

    Gibbs, M. (2023, August 24) What is Instantiation in Java? - Definition & Example. Study.com. 
        https://study.com/academy/lesson/what-is-instantiation-in-java-definition-example.html
*/

package assignment2;

import java.util.Scanner;

public class Main {

    // Rectangle class
    public class Rectangle {
        int length;
        int width;

        public int calculateArea() {
            return length * width;
        }
    }

    // Cylinder class
    public class Cylinder {
        // Using double because pi is a decimal value
        double radius;
        double height;

        public double calculateVolume() {
            return Math.PI * Math.pow(radius, 2) * height;
        }
    }

    // Cube class
    public class Cube {
        double side;

        public double calculateVolume() {
            return Math.pow(side, 3);
        }
    }

    // Spehere class
    public class Sphere {
        double radius;

        public double calculateVolume() {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
    }

    public static void main(String[] args) {

        // creating scanner object for user input
        Scanner input = new Scanner(System.in);

        /*
         * Commenting out rectangle area calculation for part 2
         * 
         * // instance of Rectangle class
         * Rectangle rectangle = new Main().new Rectangle();
         * 
         * // prompt user for rectangle dimensions
         * System.out.println("Enter the length of the rectangle:");
         * int length = input.nextInt();
         * 
         * System.out.println("Enter the width of the rectangle:");
         * int width = input.nextInt();
         * 
         * // set rectangle dimensions
         * rectangle.length = length;
         * rectangle.width = width;
         * 
         * // calculate and print area result
         * int area = rectangle.calculateArea();
         * System.out.println("The area of the rectangle is: " + area);
         */

        // prompt user for which shape to calculate volume
        System.out.println("\nChoose a shape to calculate volume:");
        System.out.println("1. Cylinder");
        System.out.println("2. Cube");
        System.out.println("3. Sphere");
        int choice = input.nextInt();

        /*
         * switch case for shape choice
         * each option will prompt user for dimensions and calculate volume
         */
        switch (choice) {
            case 1:
                Cylinder cylinder = new Main().new Cylinder();
                System.out.println("Enter radius:");
                cylinder.radius = input.nextDouble();
                System.out.println("Enter height:");
                cylinder.height = input.nextDouble();
                System.out.println("Volume: " + cylinder.calculateVolume());
                break;
            case 2:
                Cube cube = new Main().new Cube();
                System.out.println("Enter side length:");
                cube.side = input.nextDouble();
                System.out.println("Volume: " + cube.calculateVolume());
                break;
            case 3:
                Sphere sphere = new Main().new Sphere();
                System.out.println("Enter radius:");
                sphere.radius = input.nextDouble();
                System.out.println("Volume: " + sphere.calculateVolume());
                break;
        }

        // closing input scanner
        input.close();
    }
}
