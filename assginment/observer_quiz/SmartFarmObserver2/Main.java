import framework.*;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new CloudyObserver();
        Observer observer2 = new SunnyObserver();
        Observer observer3 = new RainyObserver();
        //Manager manager = new Manager();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        System.out.println("Smart Farm Working");

        generator.execute();
    }
}