import java.util.Random;
import framework.*;
import java.util.HashMap;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    Manager manager = new Manager();
    PanelBattery panel = new PanelBattery("Sunny");
    //Battery p1 = manager.create("battery");
    private int number;
    public int getNumber() {
        return number;
    }
    public String getMode(){
        if(number<10) return "Sunny";
        else if(number>=10 && number<20) return "Cloudy";
        else return "Rainy";
    }
    public Manager getManager(){
        manager.register("sunny", panel);
        return manager;
    }
    public void execute() {
        for (int i = 0; i < 10; i++) {
            number = random.nextInt(30); //0~29
            notifyObservers();
        }
    }
    public void turnonCooling(){
        System.out.println("Start Cooling System");
    }
    public void turnoffCooling(){
        System.out.println("Stop Cooling System under temp. control.");
    }
}