package ExercisingFromPacktAndOnline;
import java.util.Scanner;
public class Circle {

    private double radius;
    private double diameter;
    private double circumference;
    private double area;

    public void findRadius(double number) {
        radius = number;
    }

    public double getRadius() {
    return radius;
    }

    public void findDiameter() {
        diameter = 2 * radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void findArea() {
        area = 3.14 * radius * radius;
    }

    public double getArea() {
    return area;
    }

    public void findCircumference() {
        circumference = 2 * 3.14 * radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public static void main(String[]args){

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter a number --> ");
        double number = scannerObject.nextDouble();

Circle circle = new Circle();

    circle.findRadius(number);
        System.out.println("Radius is " + circle.getRadius());

        circle.findDiameter();
        System.out.println("Diameter is " + circle.getDiameter());

        circle.findArea();
        System.out.println("Area is " +circle.getArea());

        circle.findCircumference();
        System.out.println("Circumference is " +circle.getCircumference());
    }

}
