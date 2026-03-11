package Day_seven;

public class StringBuliderUse {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("yyt");
        sb.append(" and ");
        sb.append("who");
        System.out.println(sb);

        StringBuilder s = new StringBuilder();
        for(int i = 0;i < 1000;i++){
            if(i > 0){
                s.append(',');
            }
            s.append(i);
        }
        String s1 = s.toString();
        System.out.println(s1);
    }
}
