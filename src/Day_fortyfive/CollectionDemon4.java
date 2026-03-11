package Day_fortyfive;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemon4 {
    public static void main(String[] args){
        Collection<String> coll = new ArrayList();
        coll.add("hello");
        coll.add("world");
        coll.add("and");
        coll.add("hello");
        coll.add("java");
        for(String str : coll){
            System.out.println(str + " ");
        }
    }
}
