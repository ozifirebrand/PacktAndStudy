package ExercisingFromPacktAndOnline;

import java.util.Arrays;

public class ArraysCopyOfRange {
    public static void main(String[] args) {
        int [] intArray = new int[5];
        Arrays.fill(intArray, 2);
        System.out.println(Arrays.toString(intArray));
        int [] shortNumbers = Arrays.copyOfRange(intArray, 0, 2);
        System.out.println(Arrays.toString(shortNumbers));
        int [] longNumbers = Arrays.copyOf(intArray, 10);
        System.out.println(Arrays.toString(longNumbers));
        Arrays.fill(longNumbers, 5, 10, 3);
        System.out.println(Arrays.toString(longNumbers));

        System.out.println();
        System.out.println("Finding the number of occurrence of 'so' in the\n" +
                "statement 'So many books, so little time'");
        String [] text = {"So", "many", "books", "so", "little", "time"};
        String text1 = "so";
        int countForSo = 0;
        for (int index = 0; index<text.length; index++) {
            int comparison = text[index].compareToIgnoreCase(text1);
            if ( comparison == 0 ){
                countForSo++;
                System.out.println("Found occurrence at: " +index);
            }
        }
        System.out.println("Total number of occurrences: "+ countForSo);
    }
}