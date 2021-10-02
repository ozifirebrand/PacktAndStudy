package SelfWork;

public class OOPClassWorkPractice {
    int [] [] screen ;
    public void clear(){screen = new int[5][4];}
    public int [] [] getScreen(){return screen;}
    public void writeOnA(){screen[0][0] = screen[0][1] = screen[0][2] = screen[0][3] = 1;}
    public void writeOnB(){screen[0][3]= screen[1][3] = screen[2][3] = 1;}
    public void writeOnC(){screen[2][3] = screen[3][3] = screen[4][3] = 1;}
    public void writeOnD(){screen[4][0] = screen[4][1] = screen[4][2] = screen[4][3] = 1;}
    public void writeOnE(){screen[0][2] = screen[0][3] = screen[0][4] = 1; }
    public void writeOnF(){screen[0][0] = screen[0][1] = screen[0][2] = 1; }
    private void writeOnG() {screen[2][0] = screen[2][1] = screen[2][2] = screen[2][3] = 1;}
    public void setScreen(String numbersInBits){
        if ( numbersInBits.length() > 8 ){ throw new IllegalArgumentException("Too much characters!");}
        for (char numberBit : numbersInBits.toCharArray()){ if ( numberBit != '1'&& numberBit != '0' ){throw new IllegalArgumentException("Invalid input!");}}
        for ( int index = 0; index < numbersInBits.length(); index++){
            if ( numbersInBits.charAt(numbersInBits.length() - 1) == '1'){
            if ( numbersInBits.charAt(0) == '1' ){ writeOnA();}
            if ( numbersInBits.charAt(1) == '1' ){ writeOnB();}
            if ( numbersInBits.charAt(2) == '1' ){ writeOnC();}
            if ( numbersInBits.charAt(3) == '1' ){ writeOnD();}
            if ( numbersInBits.charAt(4) == '1' ){ writeOnE();}
            if ( numbersInBits.charAt(5) == '1' ){ writeOnF();}
            if ( numbersInBits.charAt(6) == '1' ){ writeOnG();}
        } else { clear();}
    }
}
}