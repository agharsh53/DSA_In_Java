package Hashmaps;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        //Creation
        HashSet<Integer> set = new HashSet<>();

        //INSERT
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);//list.add(el);

        //Size
        System.out.println("Size of set is "+set.size());

        System.out.println(set);
//        //Search -contains
//        if(set.contains(1)){
//            System.out.println("Set contains 1");
//        }
//        if(!set.contains(6)){
//            System.out.println("Set does not contain 6");
//        }
//
//        //remove
//        set.remove(1);
//        if(!set.contains(1)){
//            System.out.println("Set does not contain 1 - we deleted 1");
//        }

        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
