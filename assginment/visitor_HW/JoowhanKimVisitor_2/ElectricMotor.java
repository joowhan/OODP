import java.util.Iterator;
import java.util.ArrayList;

public class ElectricMotor {
    private String name;
    Observer observer2;
    //private ArrayList dir = new ArrayList();
    public ElectricMotor(String name, Observer observer2) {
        this.name = name;
        this.observer2 = observer2;
    }
    public String getName() {
        return name;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
    public String toString(){
        return "Electric Motor";
    }
    public void notifyObserver(String status){
        observer2.update(status);
    }
    public void notifyObserver_sr(String status){
        observer2.update_sr(status);
    }
    public void notifyObserver_sw(String status){
        observer2.update_sw(status);
    }
}

