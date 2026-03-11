package Day_thirtyfour;

import java.util.StringJoiner;

public class Gamer implements Cloneable {
    //如果一个接口里面没有抽象方法
    //表示当前接口是一个标记接口
    //现在Cloneable表示一旦实现，那么当前类的对象就可以被克隆
    //如果没有实现Cloneable接口，那么在调用clone方法时会抛出CloneNotSupportedException异常
    private int id;
    private String name;
    private String password;
    private String path;
    private int[] data;

    public Gamer(){

    }

    public Gamer(int id, String name, String password, String path, int[] data) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return "角色编号为: " + id + "\n" +
               "角色名称为: " + name + "\n" +
               "角色密码为: " + password + "\n" +
               "游戏图片为: " + path + "\n" +
               "进度为: " + java.util.Arrays.toString(data) + "\n";
    }

    public String arrToString(int[] arr){
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i : arr) {
            sj.add(String.valueOf(i));
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        //调用父类中的clone方法
        //相当于Java帮我们克隆一个对象，并把克隆之后的对象返回出去

        //将浅克隆变成深克隆
        //先把被克隆对象中的数组获取出来
        int[] data = this.data;
        //创建新的数组
        int[] newData = new int[data.length];
        //将原数组中的数据复制到新地址中
        for(int i = 0; i < data.length;i++){
            newData[i] = data[i];
        }
        //调用父类中的方法克隆对象
        Gamer g = (Gamer)super.clone();
        //因为父类中的克隆方法是浅克隆，替换克隆出来对象中的数组地址值
        g.data = newData;

        return g;

        //以后写深克隆不用自己写，可以用Gson等工具类来实现
    }
}
