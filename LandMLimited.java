package com.mycompany.landmlimited;

/**
 *
 * @author user 2022
 */
  import java.util.Scanner;

public class LandMLimited {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate product, sum, and maximum
        int product = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        int max = Math.max(num1, Math.max(num2, num3));

        // Display the results in a tabular format
        System.out.println("Product\tSum\tMaximum");
        System.out.printf("%d\t%d\t%d%n", product, sum, max);

        scanner.close();
    }
}