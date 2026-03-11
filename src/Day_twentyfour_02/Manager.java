package Day_twentyfour_02;

public class Manager extends Employee {
    private double bonue;

    public Manager(){

    }

    public Manager(String id,String name,double salary,double bonus){
        super(id,name,salary);
        this.bonue = bonus;
    }

    public double getBonue() {
        return bonue;
    }

    public void setBonue(double bonue) {
        this.bonue = bonue;
    }

    @Override
    public void work(){
        System.out.println("经理的工作是管理员工");
    }
}
