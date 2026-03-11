package Day_eighteen;

import java.util.StringJoiner;

public class StringJoinerUse {
    public static void main(String[] args){
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("1").add("2").add("3").add("4").add("5").add("6");
        System.out.println(sj);
        System.out.println(sj.length());
        String str = new String("abc");
        System.out.println(str.toString());
    }
}
