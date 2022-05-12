public class SunnyObserver implements Observer {
    public void update(NumberGenerator generator) {
        int modenum = generator.getNumber();
        System.out.println("Sunny Observer received new state:" + generator.getMode());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}