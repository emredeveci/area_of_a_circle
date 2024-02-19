import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double radius, angle, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        radius = input.nextDouble();

        System.out.println("Please enter the central angle in degrees: ");
        angle = input.nextDouble();

        System.out.print("The sector area is: " + (pi * (radius * radius) * angle) / 360);
    }
}