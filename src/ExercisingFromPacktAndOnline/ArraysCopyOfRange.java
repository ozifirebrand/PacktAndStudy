package ExercisingFromPacktAndOnline;

import java.util.Arrays;

public class ArraysCopyOfRange {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        Arrays.fill(numbers, 1);
        System.out.println(Arrays.toString(numbers));
        int [] shortNumbers = Arrays.copyOfRange(numbers, 0, 3);
        System.out.println(Arrays.toString(shortNumbers));
        int [] longNumbers = Arrays.copyOf(numbers, 6);
        System.out.println(Arrays.toString(longNumbers));
    }
    }