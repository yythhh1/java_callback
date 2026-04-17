package day_1;

public class Teacher {
    private String name;
    private double salary;

    public Teacher(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public Teacher(){

    }

    public void teach(){
        System.out.println("好好教学，天天向上");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
