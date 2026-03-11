package Day_fortyfive;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo5 {
    public static void main(String[] args){
        Collection<String> coll = new ArrayList<String>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");

        /*coll.forEach(new Consumer<String>(){
            @Override
            //s是依次表示集合中的每一个元素
             //底层原理
             //其实也会自己遍历集合，依次得到每一个元素
             //把得到的每一个元素传递给accept方法
            public void accept(String s){
                System.out.println(s);
            }
        });*/
        //lambda表达式
        coll.forEach((String s) -> {
            System.out.printf(s + " ");
        }
        );
    }
}
