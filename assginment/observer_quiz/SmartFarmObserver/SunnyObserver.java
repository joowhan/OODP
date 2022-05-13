import framework.*;
import java.util.Random;
public class SunnyObserver implements Observer {
    private Random random = new Random();
    private int number;
    public void update(NumberGenerator generator) {
        int modenum = generator.getNumber();
        String mode="Sunny";
        String passedMode = generator.getMode();
        number = random.nextInt(30);
        System.out.println("Sunny Observer received new state:" + passedMode);
        if(mode.equals(passedMode)){
            System.out.println(">> "+ mode + " Mode Starts...");
            Manager manager = generator.getManager();
            if(number<10){
                Battery bat = manager.create("typeA");
                bat.use();
            }
            else if(number>=10 && number<20){
                Battery bat = manager.create("typeB");
                bat.use();
            }
            else{
                System.out.println("Farm devices for sunny weather starts working");
            }


        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}