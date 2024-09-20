package Arrays;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        //Input from the user
        Scanner scanner = new Scanner(System.in);

        //Array to hold 5 temperatures
        double[] temperatures = new double[5];

        //Prompt user to enter all 5 temperature values
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        //The average temperature
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        double averageTemperature = sum / 5;

        //Number of temperatures above the average
        int daysAboveAverage = 0;
        for (double temp : temperatures) {
            if (temp > averageTemperature) {
                daysAboveAverage++;
            }
        }

        //Results
        System.out.println("The average temperature is: " + averageTemperature);
        System.out.println("Number of days above the average temperature: " + daysAboveAverage);
        scanner.close();
    }
}

