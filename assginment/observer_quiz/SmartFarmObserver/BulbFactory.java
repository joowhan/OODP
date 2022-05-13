import java.util.HashMap;

public class BulbFactory {
    private HashMap pool = new HashMap();
    private static BulbFactory singleton = new BulbFactory();
    private BulbFactory(){}
    public static BulbFactory getInstance(){
        return singleton;
    }
    public synchronized HeatingBulb getHeatingBulbs(String bulb){
        HeatingBulb hb = (HeatingBulb)pool.get(""+bulb);
        if(hb==null){
            hb = new HeatingBulb();
            hb.TurnOnBulb();
            pool.put(""+bulb, hb);
        }
        else{
            hb.TurnOnBulb();
            System.out.println("--> One bulb is replaced with a Flyweight...");
            System.out.println("A bulb is reused from a Flyweight pool");
        }
        return hb;
    }
}
