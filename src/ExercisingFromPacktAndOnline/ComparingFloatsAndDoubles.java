package ExercisingFromPacktAndOnline;

public class ComparingFloatsAndDoubles {
    public static void  main (String []args){
    double a = .6 + .6 + .6 + .6 + .6 + .6;
    double b = .6 * 6;
        System.out.println("A is " + a +" and B is " + b);
    if ( a != b){
        System.out.println("A is not equal to B");}
    if (Math.abs(a - b) < .001){
        System.out.println("A is close enough to B");
    }


    }
}
