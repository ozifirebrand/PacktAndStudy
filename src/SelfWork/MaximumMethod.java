package SelfWork;
import java.util.Scanner;

public class MaximumMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by space:  ");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();

        double result = maximum(secondNumber, firstNumber, thirdNumber);
        System.out.println("Maximum value is " + result);
    }
    public static double maximum(double firstNumber, double secondNumber,
    double thirdNumber){

        double maximumValue = firstNumber;
        if ( secondNumber> maximumValue ){
            maximumValue = secondNumber;
        }
        if ( thirdNumber >maximumValue ){
            maximumValue = thirdNumber;
        }

        return maximumValue;
    }
}
