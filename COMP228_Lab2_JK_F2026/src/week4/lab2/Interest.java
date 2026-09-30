package week4.lab2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Interest {
    private BigDecimal principal;
    private BigDecimal rate;
    private int time;

    /*
     * Add the logic of validation.. for validating principal, rate and time..
     *   // validate hour, minute and second
     *   
     *   Validation--- dont permit negative values..
     *   don't permit integer values for principal , and rate.
     *   dont' permit String 
     */

    // Default Constructor
    public Interest() {}

    // Constructor with input validation
    public Interest(BigDecimal principal, BigDecimal rate, int time) {
        validateInputs(principal, rate, time);
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    // Input Validation Logic
    public static void validateInputs(BigDecimal principal, BigDecimal rate, int time) {
        if (principal == null || principal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Error: Principal must be greater than 0.");
        }
        if (rate == null || rate.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Error: Rate cannot be negative.");
        }
        if (time <= 0) {
            throw new IllegalArgumentException("Error: Time must be greater than 0.");
        }
    }

    public static void validateInputs(double principal, double rate, int time) {
        if (principal <= 0) {
            throw new IllegalArgumentException("Error: Principal must be greater than 0.");
        }
        if (rate < 0) {
            throw new IllegalArgumentException("Error: Rate cannot be negative.");
        }
        if (time <= 0) {
            throw new IllegalArgumentException("Error: Time must be greater than 0.");
        }
    }

    // 1. Simple Interest - BigDecimal
    public BigDecimal calculateSimpleInterest(BigDecimal principal, BigDecimal rate, int time) {
        validateInputs(principal, rate, time);
        return principal.multiply(rate)
                        .multiply(BigDecimal.valueOf(time))
                        .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }

    // 1-1. Simple Interest - double (Method Overloading)
    public double calculateSimpleInterest(double principal, double rate, int time) {
        validateInputs(principal, rate, time);
        return (principal * rate * time) / 100.0;
    }

    // 2. Compound Interest - BigDecimal
    public BigDecimal calculateCompoundInterest(BigDecimal principal, BigDecimal rate, int time) {
        validateInputs(principal, rate, time);
        BigDecimal rateFactor = BigDecimal.ONE.add(rate.divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP));
        BigDecimal amount = principal.multiply(rateFactor.pow(time));
        return amount.subtract(principal).setScale(2, RoundingMode.HALF_UP);
    }

    // 2-1. Compound Interest - double (Method Overloading)
    public double calculateCompoundInterest(double principal, double rate, int time) {
        validateInputs(principal, rate, time);
        return principal * Math.pow(1 + (rate / 100.0), time) - principal;
    }

    // Getters & Setters
    public BigDecimal getPrincipal() { return principal; }
    public BigDecimal getRate() { return rate; }
    public int getTime() { return time; }
}