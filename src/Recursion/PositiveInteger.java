package Recursion;

public class PositiveInteger {
    //Recursive function to calculate the sum of a positive Integer
    public static int positiveInteger(int number) {
        //Base condition: if the number is a single digit, return the number itself
        if (number < 10) {
            return number;
        }

        //Recursive flow: add the sum of the last digit with the result of the remaining digits
        return (number % 10) + positiveInteger(number / 10);
    }

    public static void main(String[] args) {
        System.out.println("Sum of positive integer of 10: " + positiveInteger(10));
        System.out.println("Sum of positive integer of 12: " + positiveInteger(12));
        System.out.println("Sum of positive integer of 110: " + positiveInteger(110));
        System.out.println("Sum of positive integer of 112: " + positiveInteger(112));
    }
}
