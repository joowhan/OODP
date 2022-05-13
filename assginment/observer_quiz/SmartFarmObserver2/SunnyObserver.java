import framework.*;
public class SunnyObserver implements Observer {
    public void update(NumberGenerator generator) {
        int modenum = generator.getNumber();
        String mode="Sunny";
        String passedMode = generator.getMode();
        System.out.println("Sunny Observer received new state:" + passedMode);
        if(mode.equals(passedMode)){
            System.out.println(">> "+ mode + " Mode Starts...");
            Manager manager = generator.getManager();
            Battery bat = manager.create("sunny");
            bat.use();

        }
        else{
            System.out.println("System Moving to Sunny Mode... ");
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}