package SelfWork;

public class ForLoops {
    public static void main(String[] args) {
//        for(int counter = 20; counter >=2; counter-=2){
//            System.out.println(counter);



            double amountAfterNthYear = 0;
            double principal =1000;
            double rate = 0.05;
            int noOfYears = 0;
            while (noOfYears<10) {
                amountAfterNthYear = (principal * Math.pow((1 + rate), noOfYears));
                //principal = amountAfterNthYear;
            noOfYears++;
                System.out.printf("After %d years, amount is $%.2f.%n" ,noOfYears, amountAfterNthYear);}
        }
    }
