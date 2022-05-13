
public class CloudyObserver implements Observer {
    private HeatingBulb rebulb;
    public void update(NumberGenerator generator) {
        int modenum = generator.getNumber();
        String mode="Cloudy";
        String passedMode = generator.getMode();
        System.out.println("Cloudy Observer received new state:" + passedMode);
        if(mode.equals(passedMode)){
            System.out.println(">> "+ mode + " Mode Starts...");
            System.out.println("Farm devices for cloudy weather starts working");
            System.out.println("Decreasing Cooling system power undertemp. control");
            BulbFactory fac = BulbFactory.getInstance();
            rebulb = fac.getHeatingBulbs("heatingbulb");
        }
        else{
            System.out.println("System Moving to Cloudy Mode... ");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}