package ExercisingFromPacktAndOnline;

import java.util.Scanner;

public class BloodPressureRangeProgram {
    public static int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void evaluateSystolic(){
        int input = input();
        boolean isSystolic = 90 <= input && input <= 120;
        boolean isAboveSystolic = input > 120;
        if ( isSystolic ){
            System.out.println("Perfect!");
        }
        else if ( isAboveSystolic) System.out.println("Above");
        else {
            System.out.println("Below");}
    }

    public static void main(String[] args) {
        evaluateSystolic();
    }
}