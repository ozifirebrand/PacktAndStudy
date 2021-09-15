package ExercisingFromPacktAndOnline;

import java.util.*;

public class CollectionsSet {
    public static void main(String[] args) {
//        String [] myArray = new String[]{"3", "25", "2", "79", "2"};
//        Set<String> mySet = new HashSet<>();
//        Collections.addAll(mySet, myArray);
//        System.out.println(mySet);
//        /*Set collection removes any repeated value*/
//
//        Integer [] myIntArray = new Integer[]{3, 25, 2, 79, 2};
//        Set<Integer> myIntSet = new HashSet<>();
//        Collections.addAll(myIntSet, myIntArray);
//        System.out.println(myIntSet);

        //Declaration and initialisation of Arrays
        Integer[] numbers1 = new Integer[]{3, 25, 2, 79, 2};
        Integer[] numbers2 = new Integer[]{7, 12, 14, 79};

        //Declaration and initialisation of Sets
        Set<Integer> mySetInt1 = new HashSet<>();
        Set<Integer> mySetInt2 = new HashSet<>();

        //Filling sets up
        Collections.addAll(mySetInt1, numbers1);
        Collections.addAll(mySetInt2, numbers2);

        //Printing
        System.out.println(mySetInt1);
        System.out.println(mySetInt2);

        //Adding Sets and printing
        mySetInt1.addAll(mySetInt2);
        System.out.println(mySetInt1);

    }
}