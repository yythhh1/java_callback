package Day_twentysix_04;

public class PingpongCoach extends Coach implements English {

    public PingpongCoach() {
        // Default constructor
    }
    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speechEnglish() {
        System.out.println("I am a pingpong coach, and I can speak English.");
    }

    public void teach() {
        System.out.println("Teaching pingpong techniques.");
    }
}
