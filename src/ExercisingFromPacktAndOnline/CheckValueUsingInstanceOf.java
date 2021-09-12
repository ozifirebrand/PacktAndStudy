package ExercisingFromPacktAndOnline;

public class CheckValueUsingInstanceOf {
    public static void checkNumber(Number val){
        if ( val instanceof Integer ){
            System.out.println("It is an integer!");
        }
        if ( val instanceof Double ){
            System.out.println("It is a Double!");
        }
    }

    public static void main(String[] args) {
        int val1=5; double val2 = 4.6;
        checkNumber(val1); checkNumber(val2);
    }
}
