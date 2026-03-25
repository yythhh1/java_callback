package c01JiHecase;

import java.util.ArrayList;
import java.util.Iterator;

public class ArralistDemo {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

/*        list.remove("java");

        list.add(1,"happy");

        list.remove(0);

        list.set(0,"hi");
        String tf = list.get(0);
        int len = list.size();
        System.out.println(list);
        System.out.println("第一个元素:"+tf);
        System.out.println("len:"+len);*/

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

    }
}
