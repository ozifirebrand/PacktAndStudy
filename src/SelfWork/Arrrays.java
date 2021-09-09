package SelfWork;

public class Arrrays {
    private static StringBuilder arrays(){
        String[] arrayGDSAJUList = {"E", "S", "P","J"};
        StringBuilder finalAnswer= new StringBuilder();
        for (String letter : arrayGDSAJUList ){
            finalAnswer.append(letter);
        }
        return finalAnswer;
    }

    public static void main(String[] args) {
        System.out.println(arrays());
    }
}
