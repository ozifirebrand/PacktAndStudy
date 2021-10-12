package ExercisingFromPacktAndOnline;

import java.util.*;

public class IteratingThroughCollections2 {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(2);
        array.add(37);
        Iterator<Integer> iterator = array.listIterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.print(i + " ");
        }
//
//        Set<String> textSet = new HashSet<>();
//        textSet.addAll(text);
//        Iterator iterator1 = textSet.iterator();
//
//        while (iterator1.hasNext()) {
//            String s = (String) iterator1.next();
//            int freq = Collections.frequency(text, s);
//            System.out.println(s + " appears " +freq +" times.");
//        }
    }
}
