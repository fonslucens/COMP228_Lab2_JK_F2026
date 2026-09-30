package week4.lab2;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 5 Objects Creation Loop (Case 1 ~ Case 5)
        for (int i = 1; i <= 5; i++) {
            System.out.println("=== Case " + i + " ===");

            double principalDouble = 0;
            double rateDouble = 0;
            int timeInt = 0;

            // 1. Principal Validation (Decimal only, Integer & String blocked, <=0 blocked)
            while (true) {
                System.out.print("Enter Principal (decimal only): ");
                if (scanner.hasNextInt()) {
                    System.err.println("Invalid input. Principal must be decimal only.");
                    scanner.next();
                    continue;
                }
                if (!scanner.hasNextDouble()) {
                    System.err.println("Invalid input. String not allowed.");
                    scanner.next();
                    continue;
                }
                principalDouble = scanner.nextDouble();
                if (principalDouble <= 0) {
                    System.err.println("Invalid input. Principal must be > 0.");
                    continue;
                }
                break;
            }

            // 2. Rate Validation (Decimal only, Integer & String blocked, <0 blocked)
            while (true) {
                System.out.print("Enter Rate (decimal only): ");
                if (scanner.hasNextInt()) {
                    System.err.println("Invalid input. Rate must be decimal only.");
                    scanner.next();
                    continue;
                }
                if (!scanner.hasNextDouble()) {
                    System.err.println("Invalid input. String not allowed.");
                    scanner.next();
                    continue;
                }
                rateDouble = scanner.nextDouble();
                if (rateDouble < 0) {
                    System.err.println("Invalid input. Rate cannot be negative.");
                    continue;
                }
                break;
            }

            // 3. Time Validation (Integer only, Decimal & String blocked, <=0 blocked)
            while (true) {
                System.out.print("Enter Time in years (integer only): ");
                if (!scanner.hasNextInt()) {
                    System.err.println("Invalid input. Time must be integer only.");
                    scanner.next();
                    continue;
                }
                timeInt = scanner.nextInt();
                if (timeInt <= 0) {
                    System.err.println("Invalid input. Time must be > 0.");
                    continue;
                }
                break;
            }

            // Object Creation
            BigDecimal principalBD = BigDecimal.valueOf(principalDouble);
            BigDecimal rateBD = BigDecimal.valueOf(rateDouble);

            Interest interest = new Interest(principalBD, rateBD, timeInt);

            // Output Display (Matching Professor's Format)
            System.out.println("Simple Interest (BigDecimal) : " + interest.calculateSimpleInterest(principalBD, rateBD, timeInt));
            System.out.println("Simple Interest (Double)     : " + interest.calculateSimpleInterest(principalDouble, rateDouble, timeInt));
            System.out.println("Compound Interest (BigDecimal) : " + interest.calculateCompoundInterest(principalBD, rateBD, timeInt));
            System.out.println("Compound Interest (Double)   : " + interest.calculateCompoundInterest(principalDouble, rateDouble, timeInt));
            System.out.println();
        }

        scanner.close();
    }
}