
package week4.CH13N1;

import java.util.Scanner;

/**
 * Testing Triangle's inheritance of GeometricObject
 * @author JeffreyMiller
 */
public class TriangleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1,side2,side3;
        String color;
        boolean filled;
        System.out.println("Triangle from GeometricObject program");
        System.out.println("");
        System.out.print("Enter side 1 of Triangle: ");
        side1 = sc.nextDouble();
        System.out.print("Enter side 2 of Triangle: ");
        side2 = sc.nextDouble();
        System.out.print("Enter side 3 of Triangle: ");
        side3 = sc.nextDouble();
        sc.nextLine(); //clear buffer
        System.out.print("Enter color of Triangle: ");
        color = sc.nextLine();
        System.out.println("Is Triangle filled?(y/n): ");
        String filledChoice = sc.nextLine();
        if(filledChoice.equalsIgnoreCase("y")){
            filled = true;
        }
        else{
            filled = false;
        }
        
        GeometricObject tri = new Triangle(side1, side2, side3, color, filled);
        System.out.println("Area: " + tri.getArea());
        System.out.println("Perimeter: " + tri.getPerimeter());
        System.out.println("Color: " + tri.getColor());
        System.out.println("Filled: " + tri.isFilled());
    }
}
