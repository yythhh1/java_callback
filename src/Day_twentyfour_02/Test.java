package Day_twentyfour_02;

public class Test {
    public static void main(String[] args){
        Manager m = new Manager("001", "张三", 10000, 2000);
        System.out.println(m.getId() + "," + m.getName() + "," + m.getSalary() + "," + m.getBonue());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("002");
        c.setName("李四");
        c.setSalary(8000);
        System.out.println(c.getId() + "," + c.getName() + "," + c.getSalary());
        c.work();
        c.eat();
    }
}
