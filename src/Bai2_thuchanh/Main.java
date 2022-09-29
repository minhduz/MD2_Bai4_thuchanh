package Bai2_thuchanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle: \n"+rectangle.display());
        System.out.println("Perimeter: "+rectangle.getPerimeter());
        System.out.println("Area: "+rectangle.getArea());
    }
}
