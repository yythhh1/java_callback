package c05JiHecase;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_bianli_demo {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");

        //遍历集合
/*        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String,String> entry : entries){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }*/
        //遍历集合
        Set<String> strings = map.keySet();
        for(String key : strings){
            System.out.println(key + " = " + map.get(key));
        }
    }
}
