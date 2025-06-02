package assignment;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt and read input
        System.out.println("Enter a number: ");

        double number = sc.nextDouble();

        // Calculate powers
        double square = Math.pow(number,2);
        double cube   = Math.pow(number,3);
        double fourthPower = Math.pow(number,4);

        // Display results
        System.out.println("Number: " + number);
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("FourthPower: " + fourthPower);

        sc.close();

    }
}
