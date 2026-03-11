package Day_nine;

public class EnumUse {
    public static void main(String[] args){
        Weekend day =  Weekend.SUN;
        if(day == Weekend.SAT || day == Weekend.SUN){
            System.out.println("Work at home");
        }else{
            System.out.println("Work at office");
        }
    }
}
enum Weekend{
    SUN,MON,TUE,WED,THU,FRI,SAT;
}