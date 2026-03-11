package Day_five;

//重写Objiect中的toString(),equals(),hashCode();
//toString()：把instance输出为String；
//equals()：判断两个instance是否逻辑相等；
//hashCode()：计算一个instance的哈希值。
public class Override_object {
    public static void main(String[] args){

    }
}

class Person{
    String name;
    @Override
    public String toString(){
        return "Person:name=" + name;
    }

    @Override
    public boolean equals(Object o){
        //判断类型是否相同
        if(o instanceof Person){
            Person p = (Person) o;
            return this.name.equals(p.name);
        }
        return false;
    }
}