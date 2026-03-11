package Day_two;

public class Reload_function {
    public static void main(String[] args){
        String s = "Test string";
        int n1 = s.indexOf('t');
        int n2 = s.indexOf("st");
        int n3 = s.indexOf("st",4);//根据字符串查找但指定起始位置
        System.out.println(n1 + " " + n2 + " " + n3);
    }
}
