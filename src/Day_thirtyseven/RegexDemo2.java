package Day_thirtyseven;

public class RegexDemo2 {
    public static void main(String[] args){
        //必须是数字，字母或下划线至少六位
        System.out.println("2442fsfs".matches("\\w{6,}"));
        System.out.println("2442fsfs".matches("\\w{6}"));

        //必须是数字和字符，必须是4位
        System.out.println("23df".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23_F".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23df".matches("[\\w&&[^_]]{4}"));
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));
    }
}
