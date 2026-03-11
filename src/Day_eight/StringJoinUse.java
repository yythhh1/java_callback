package Day_eight;

public class StringJoinUse {
    public static void main(String[] args){
        String[] names = new String[]{"Bob","Alice","Grace"};
        //String[] names = {"Bob","Alice","Grace"};
        String s = String.join(",",names);
        System.out.println(s);
    }
}
