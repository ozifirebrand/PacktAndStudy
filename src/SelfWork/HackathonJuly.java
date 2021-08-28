package SelfWork;
/*Write a program that takes in two arguments
One is an array, the other is an integer such that the sum of two numbers
in the array is equal to the second argument
The program returns the indices of the numbers in the array that sum up
to the second argument.
How?
    Our program goes through the array and checks each number
    We subtract the number from the integer.
    The subtracted value is then checked all through the array if it is existent
    This value is saved as anInteger.
    The array is checked if it contains anInteger.
        If yes, display the index of the number and the index of anInteger
 */
public class HackathonJuly {
    public static void main(String[] args) {
        argsMethod(9, 2,2, 4,7,3);
    }
    public static void argsMethod(int twoSumNumber, int ... twoSumArray){
        for (int index = 0; index<twoSumArray.length; index++){
            int anInteger = twoSumNumber - twoSumArray[index];
            for (int index2 = 0 ; index2< twoSumArray.length && index2!=index; index2++){
                if( twoSumArray[index2] == anInteger){
                    System.out.print(index2+" "+ index);
                    break;
                }
            }
        }
    }
}
