package Day_twentysix_04;

public abstract class Coach extends Person{
    public Coach(){

    }

    public Coach(String name,int age){
        super(name,age);
    }

    public abstract void teach();
}
