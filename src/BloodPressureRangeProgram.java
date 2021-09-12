import java.util.Scanner;

public class BloodPressureRangeProgram {
/*The program checks the blood pressure values of a patient and determines if
they are within the medically acceptable range
These values are passed as command line arguments.
The first value is the systolic value which is between the ranges of 90 and 120
The second value is the diastolic range which is between 60 and 80
Any value beyond these ranges is considered above or below normal

 */
    public static void main(String[] args) {
        if ( args.length != 2 ){
            System.err.println("Invalid inputs");}
        else {
        boolean isSystolic = 90 <= Integer.parseInt(args[0]) &&
                Integer.parseInt(args[0]) <= 120;
        boolean isAboveSystolic = Integer.parseInt(args[0]) > 120;

        boolean isBelowSystolic = Integer.parseInt(args[0]) < 90;
        boolean isDiastolic = 60 <= Integer.parseInt(args[1]) &&
                Integer.parseInt(args[1]) <= 80;
        boolean isAboveDiastolic = Integer.parseInt(args[1]) > 80;
        boolean isBelowDiastolic = Integer.parseInt(args[1]) < 60;

            if ( isSystolic ) {
                System.out.println("Normal!");
            } else if ( isAboveSystolic ) System.out.println("Above normal");
            else if ( isBelowSystolic ) {
                System.out.println("Below normal");
            }
            if ( isDiastolic ) {
                System.out.println("Normal!");
            } else if ( isAboveDiastolic ) System.out.println("Above normal");
            else if ( isBelowDiastolic ) {
                System.out.println("Below normal");
            }
        }
    }
}