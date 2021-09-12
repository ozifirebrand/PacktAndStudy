public class CommandLineArgumentProgram2 {
    public static void main(String[] args) {
        if(args.length > 0){
            for (String arg : args) {
                System.out.print(Integer.parseInt(arg) + " ");
            }
        }
    }
}
