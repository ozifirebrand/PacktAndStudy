package ExercisingFromPacktAndOnline;

public class ConditionalStatementsTernary {
public static void main(String[]args){
    int heightOfRollerCoaster = 150;
    int minHeightForRollerCoaster = 121;
    String resultDisplayed;
    //ternary Operator works like this;
    // x = (x > min or max) ? (This is the true block)
    // min or max : (This is the false block) x;

    resultDisplayed = (heightOfRollerCoaster > minHeightForRollerCoaster)
            ? "You are permitted on ride" : "You are not eligible";
    System.out.println(resultDisplayed);
}
}
