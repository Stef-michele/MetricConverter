import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        //import scanner
        Scanner in = new Scanner(System.in);
        //defining variables
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        boolean validInput = false;
        String trash = "";
        //gather data and bulletproof
        do {
            System.out.print("Enter a measurement in meters: ");
            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                in.nextLine();  // Clears the newline from the buffer
                validInput = true;  // Valid input, end the loop
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid measurement: " + trash);
                System.out.println("Please enter a valid numeric measurement in meters.");
            }
        } while (!validInput); //this holds place until a valid input turns it true and it finishes

        // Convert meters to miles, feet, and inches
         miles = meters * 0.000621371;
         feet = meters * 3.28084;
         inches = meters * 39.3701;

        // Print the converted measurements
        System.out.println("Metric to Standard Conversion:");
        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}