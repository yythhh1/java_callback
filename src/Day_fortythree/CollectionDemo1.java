package Day_fortythree;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args){
        //用多态的方式创建对象
        Collection<String> coll = new ArrayList<>();
        coll.add("hello");
        coll.add("world");
        coll.add("java");
        System.out.println(coll);
        coll.clear();
        System.out.println(coll);
        //判断元素是否为空
        boolean empty = coll.isEmpty();
        System.out.println("集合是否为空: " + empty);
        System.out.println("-------------------");
        //删除remove
        coll.add("hello");
        coll.add("world");
        System.out.println(coll);
        coll.remove("hello");
        System.out.println(coll);
        //判断是否包含
        boolean b = coll.contains("world");
        boolean b1 = coll.contains("java");
        System.out.printf("集合中是否包含world: %b%n",b);
        System.out.printf("集合中是否包含java: %b%n",b1);
        //获取集合的长度
        int size = coll.size();
        System.out.println("集合的长度为: " + size);
        coll.add("world");
        size = coll.size();
        System.out.println(size);
    }
}
