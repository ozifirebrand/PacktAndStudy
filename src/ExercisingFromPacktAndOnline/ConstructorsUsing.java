package ExercisingFromPacktAndOnline;

public class ConstructorsUsing {

    int firstArgument;
    int secondArgument;
    int sumOfFirstAndSecondNumber;

    public int display(){
        System.out.print("My code is working");
        sumOfFirstAndSecondNumber = firstArgument + secondArgument;
        System.out.printf("%nLol lol lol %nSum of 15 and 12 is %d", sumOfFirstAndSecondNumber);
        return sumOfFirstAndSecondNumber;
    }


    ConstructorsUsing(int firstArgument, int secondArgument){

        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;


    }


    public static void main(String[]args){
        ConstructorsUsing newConstructor = new ConstructorsUsing(12, 15);
        newConstructor.display();


    }
}