package BinaryNumberRecursion;

public class DecimalToBinary {
    //Convert decimal to binary number
    public static String convertToBinary(int number) {
        //return an empty string if number is 0
        if (number == 0) {
            return "";
        }
        //Divide the number by 2 and add the remainder
        return convertToBinary(number / 2) + (number % 2);
    }

    public static void main(String[] args) {
        System.out.println("Binary of 7: " + (convertToBinary(7).isEmpty() ? "0" : convertToBinary(7)));
        System.out.println("Binary of 15: " + (convertToBinary(15).isEmpty() ? "0" : convertToBinary(15)));
        System.out.println("Binary of 25: " + (convertToBinary(25).isEmpty() ? "0" : convertToBinary(25)));
    }
}
