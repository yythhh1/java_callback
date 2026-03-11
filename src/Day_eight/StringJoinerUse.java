package Day_eight;

import java.util.StringJoiner;

public class StringJoinerUse {
    public static void main(String[] args){
     String[] names = new String[3];
     names[0] = "John";
     names[1] = "Jane";
     names[2] = "Doe";
     StringJoiner sj = new StringJoiner(",","Hello,","!");
     for(String name : names){
         sj.add(name);
     }
     String result = sj.toString();
     System.out.println(result);
    }
}
