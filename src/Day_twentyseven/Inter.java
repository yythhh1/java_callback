package Day_twentyseven;

public interface Inter {
    public abstract void method1();

    public default void method2() {
        System.out.println("Default method2 in Inter");
    }
}
