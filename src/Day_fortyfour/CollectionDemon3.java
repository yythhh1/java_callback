package Day_fortyfour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemon3 {
    public static void main(String[] args){
        /**
        //创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("hello");
        coll.add("world");
        coll.add("and");
        coll.add("hello");
        coll.add("java");

        //获取迭代器对象
        Iterator<String> it = coll.iterator();

        //利用迭代器获取对象
        while(it.hasNext()){
            String e = it.next();
            System.out.print(e + " ");
        }
        //此时迭代器的指针指向结合尾部，如果我们继续使用next方法。会产生NoSuchElementException的异常
        //String e = it.next();

        //迭代器遍历完毕之后，指针不会复位
        System.out.println(it.hasNext());//false

        //迭代器循环中只能使用一次next方法,主要原因是前一次的next方法会在最后一次调用时将指针移到集合的末尾，第二个next方法就会报错
        Iterator<String> it2 = coll.iterator();
        while(it2.hasNext()){
            System.out.print(it2.next() + " ");
            //System.out.print(it2.next() + " ");
        }

        System.out.println();
*/
        //迭代器遍历时，不能使用集合的方法进行增加或删除
        Collection<String> coll1 = new ArrayList();
        coll1.add("aaa");
        coll1.add("bbb");
        coll1.add("ccc");
        coll1.add("ddd");
        coll1.add("eee");
        Iterator<String> it3 = coll1.iterator();
        while(it3.hasNext()){
            String  str = it3.next();
                if("bbb".equals(str)){
                    //coll1.remove("bbb");
                }
        }
        System.out.println(coll1);
    }
}
