package Day_thirtyseven;

public class RegeDemo3 {
    public static void main(String[] args){
        //表示手机号只能以1开头，第二位是3-9之间的数字，后面只有9位数字
        String regex1= "1[3-9]\\d{9}";
        System.out.println("15871845193".matches(regex1));
    }
}
