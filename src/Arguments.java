public class Arguments {
    public static void main(String[] args) {
        if(args.length>0){
            int integerValue = Integer.parseInt(args[0]);
            System.out.println(integerValue);
        }
        if ( args.length>0){
        double doubleValue = Double.parseDouble(args[1]);
            System.out.println(doubleValue);
        }
    }
}