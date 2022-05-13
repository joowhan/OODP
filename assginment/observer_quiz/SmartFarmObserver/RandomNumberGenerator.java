import java.util.Random;
import framework.*;
import java.util.HashMap;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    Manager manager = new Manager();
    PanelBattery panelA = new PanelBattery("typeA");
    PanelBattery panelB = new PanelBattery("typeB");
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
        manager.register("typeA", panelA);
        manager.register("typeB", panelB);
        return manager;
    }
    public void execute() {
        System.out.println("Original Prototypes Battery");
        System.out.println("TypeA Battery");
        System.out.println("TypeB Battery");
        System.out.println("");
        System.out.println("Bulbs stored in HashMap"); //I will put bulbs another class
        for(int i =0;i<4;i++){
            System.out.println("Bulb"+(i+1));
        }
        System.out.println("");

        for (int i = 0; i < 6; i++) {
            number = random.nextInt(30); //0~29
            notifyObservers();
        }
    }

}
