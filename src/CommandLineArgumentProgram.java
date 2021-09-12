import java.util.Scanner;

public class CommandLineArgumentProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (String arg : args) {
            total += Integer.parseInt(arg);
        }
        System.out.println("Total is " +total);
    }
}
