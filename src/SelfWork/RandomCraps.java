package SelfWork;
import java.security.SecureRandom;
import java.util.*;
public class RandomCraps {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        for (int i = 1; i <= 20; i++) {
            int randomValue = 1 + random.nextInt(6);
            System.out.print(" "+randomValue);

            if ( i%5==0 ){
                System.out.println();
            }
        }
    }
}