package Day_thirtyseven;

public class RegexDemo1 {
    public static void main(String[] args){
        String qq = "12345678a9";

        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }
}
