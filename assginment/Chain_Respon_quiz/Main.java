import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Support slipperyTer     = new SnowSupport("slippery Road", 1);
        Support sandTer     = new SandSupport("sand and Soft Road", 2);
        Support pebbleTer   = new PebbleSupport("Pebble or Uneven Road", 3);

        slipperyTer.setNext(sandTer).setNext(pebbleTer);
        Random rand = new Random();
        int caseNum = 3;
        for (int i = 0; i < 10; i += 1) {
            //generate random number
            slipperyTer.support(new Trouble(rand.nextInt(caseNum)+1));
            System.out.println("=======\n");
        }
    }
}