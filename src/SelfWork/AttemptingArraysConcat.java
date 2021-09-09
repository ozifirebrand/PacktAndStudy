package SelfWork;

public class AttemptingArraysConcat {
    private static StringBuilder arrays(){
        String[] personalityTypeLetters = {"E", "S", "P","J"};
        StringBuilder finalAnswer= new StringBuilder();
        for (String letter : personalityTypeLetters ){
            finalAnswer.append(letter);
        }
        return finalAnswer;
    }

    public static void main(String[] args) {
        System.out.println(arrays());
    }
}
