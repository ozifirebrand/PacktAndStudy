package ExercisingFromPacktAndOnline;

public class ConditionalStatementsIf {
    public static void main(String[]args) {

        int speed = 75;
        int maxSpeed = 60;
        int speedForFine = 70;

        if (speed > maxSpeed){
            System.out.println("Speed has exceeded max limit");
        } else if (speed < maxSpeed) {
            System.out.println("Speed is lesser than limit");
        } else {
            System.out.println("Your speed is equal to max speed limit");
        }
        if (speed >= maxSpeed) {
            System.out.println("You are over speeding");

            if (speed >= speedForFine) {
                System.out.println("You are fined!");
            }
        }

        boolean happy = false;
        boolean sad  = false;

        if (sad){
            System.out.println("They are sad");
            System.out.println("It is well");}

        if (happy){
            System.out.println("I am happy");}

        if (!happy){
            System.out.println("Happiness is key");
        }

        int maxDistance = 10;
        int distanceToHome = 11;

        if (distanceToHome > maxDistance) {
            System.out.println("Distance from store to home is ");
            System.out.println("more than  " + maxDistance + "km away");
            System.out.println("That is too far for free delivery.");
        }

        boolean blue = true;
        boolean red = false;

        if (red || blue){
            System.out.println("Yes");
        }

        if (!red){
            System.out.println("True");
        }

        int age = 60;
        int bpm = 150;

        if (age == 30){
            if ((bpm >= 95 && bpm <= 162)){
                System.out.println("Heart rate is normal.");
            } else if (bpm < 95){
                System.out.println("Heart rate is very low.");
            } else {
                System.out.println("Heart rate is very high.");
            }
        }else if (age == 60){
            if ((bpm >= 80) && (bpm <= 136)){
                System.out.println("Heart rate is normal.");
            }else if(bpm < 80) {
                System.out.println("Heart rate is very low");
            } else {
                System.out.println("Heart rate is very high");
            }
        }

        int x = 2;
        int y = 1;

        if ((x+y)< 5){
            System.out.println("X plus Y is less than 5");
        }

    }
}