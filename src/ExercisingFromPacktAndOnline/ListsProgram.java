package ExercisingFromPacktAndOnline;

import java.util.*;
public class ListsProgram {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(35);
        list.add(19);
        list.add(11);
        list.add(83);
        list.add(7);
        System.out.println(list);
        int index = list.indexOf(11);
        System.out.println("Find 11 at: " +index);
        System.out.println("Component: " +list.get(index));

    }

}
