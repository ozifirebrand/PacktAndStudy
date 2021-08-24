package SelfWork;

import java.util.Scanner;

/*User sends input of two numbers in
The quadrant is determined with first input as x and second input as y
if first number is greater than 0 and between 0 and 10
    and second value is between 0 and 10 and greater than 0;
    then the coordinate is in the first quadrant. Display I
If the first number is lesser than 0, between 0 and -10 and second number
    is greater than 0, and is between 0 and 10, then it is second quadrant
    Display II
If the first input is lesser than 0 and between 0 and -10 and second number
    is lesser than 0 and between 0 and -10; then it is the third quadrant.
    Display III
If tne first number is greater than 0 and between 0 and 10 and the second
    number is lesser than 0 and between 0 and -0, then it is the fourth
    quadrant. Display IV
If any of the nos is zero, display "One of the coordinates is equal to zero"

 */
public class CoordinatesLocation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();
        boolean firstQuadrantIsTrue = firstValue >0 && secondValue >0;
        boolean secondQuadrantIsTrue = firstValue<0 && secondValue>0;
        boolean thirdQuadrantIsTrue = firstValue<0 && secondValue<0;
        boolean fourthQuadrantIsTrue = firstValue>0 && secondValue<0;
        boolean isOnTheCoordinate = firstValue==0 || secondValue ==0;

        if ( firstQuadrantIsTrue ) System.out.println("I");
        if ( secondQuadrantIsTrue ) System.out.println("II");
        if ( thirdQuadrantIsTrue ) System.out.println("IiI");
        if ( fourthQuadrantIsTrue ) System.out.println("IV");
        if ( isOnTheCoordinate ) System.out.println("One of the coordinates is equal to zero.");
    }
}
