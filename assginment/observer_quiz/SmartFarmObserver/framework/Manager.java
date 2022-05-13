package framework;
import java.util.*;

public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Battery proto) {
        showcase.put(name, proto);
    }
    public Battery create(String protoname) {
        Battery p = (Battery)showcase.get(protoname);
        return p.createClone();
    }
    public void batteryUse(){
        System.out.println("Supply system power from charged batteries");
    }
}
