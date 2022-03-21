import java.util.Scanner;

public class Q1 {   
       
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        input.close();
        Circle circle = new Circle();
        circle.setRadius(radius);
        System.out.print("The area for the circle of radius " + circle.getRadius() + " is " + circle.getArea());
    }   
} 
