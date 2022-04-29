import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Support defaultMode = new NoSupport("turn on the mode",0);
        Support slipperyTer = new SnowSupport("Slippery", 1);
        Support sandTer     = new SandSupport("Sand and Soft", 2);
        Support pebbleTer   = new PebbleSupport("Pebble or Uneven", 3);

        defaultMode.setNext(slipperyTer).setNext(sandTer).setNext(pebbleTer);
        Random rand = new Random();
        int caseNum = 3;
        int ran  = 0;
        int prev = 0;
        for (int i = 0; i < 10; i += 1) {
            //generate random number
            ran = rand.nextInt(caseNum)+1;
            //trouble, 2 parameter
            defaultMode.support(new Trouble(ran), ran);
            
            ModeTracking modeTracking = ModeTracking.createModeTracking();
            modeTracking.checkModeTracking(ran,prev);
            prev = ran;
            System.out.println("=======");
        }
    }
}