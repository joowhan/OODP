
import java.util.Random;
public class CloudyObserver implements Observer {
    private HeatingBulb rebulb;
    private Random random = new Random();
    private int number;
    public void update(NumberGenerator generator) {
        int modenum = generator.getNumber();
        String mode="Cloudy";
        String passedMode = generator.getMode();
        number = random.nextInt(4);
        System.out.println("Cloudy Observer received new state:" + passedMode);
        if(mode.equals(passedMode)){
            System.out.println(">> "+ mode + " Mode Starts...");
            System.out.println("Farm devices for cloudy weather starts working");
            System.out.println("Decreasing Cooling system power undertemp. control");
            BulbFactory fac = BulbFactory.getInstance();
            if(number==0){
                rebulb = fac.getHeatingBulbs("bulb1");
                System.out.println("bulb1 for blue");
            }
                
            else if(number==1){
                rebulb = fac.getHeatingBulbs("bulb2");
                System.out.println("bulb2 for green");
            }

            else if(number==2){
                rebulb = fac.getHeatingBulbs("bulb3");
                System.out.println("bulb3 for white");
            }
            else{
                rebulb = fac.getHeatingBulbs("bulb4");
                System.out.println("bulb4 for yellow");
            }
                
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}