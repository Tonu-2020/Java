import java.io.*;
import java.util.Scanner;

public class OverloadShapeArea{
    void CalculateArea(float x)
    {
        System.out.println("Area of the square: " +x*x+ "sq units");
    }
    void CalculateArea(float x,float y)
    {
        System.out.println("Area of the rectangle: " +x*y+ "sq units");
    }
    void calculateArea(double r)    
    {
        double area = 3.14*r*r;
    System.out.println("Area of circle:"+area+"sq units");
    }
public static void main(String args[]){
OverloadShapeArea obj = new OverloadShapeArea();
System.out.println("Enter the side of the Square:");
Scanner sc = new Scanner(System.in);
float side = sc.nextFloat();
obj.calculateArea(side);
System.out.println("Enter the sides of Rectangle:");
float side1 = sc.nextFloat();
float side2 = sc.nextFloat();
obj.CalculateArea(side1,side2);
System.out.println("Enter the radius of the circle:");
double rad = sc.nextDouble();
obj.calculateArea(rad);
}  
}
         
