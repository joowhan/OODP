public class RainyObserver implements Observer {
    public void update(NumberGenerator generator) {
        int modenum = generator.getNumber();
        String mode="Rainy";
        String passedMode = generator.getMode();
        //System.out.println("Rainy Observer received new state:" + passedMode);
        if(mode.equals(passedMode)){
            System.out.println(">> "+ mode + " Mode Starts...");
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}