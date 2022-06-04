import javax.swing.RowFilter.Entry;

public class Engine{
    private String name;
    Observer observer1;
    public Engine(String name, Observer observer1) {
        this.name = name;
        this.observer1 = observer1;
    }
    public String getName() {
        return name;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
    public String toString(){
        return "Gasoline Engine";
    }
    public void notifyObserver(String status){
        observer1.update(status);
    }
    public void notifyObserver_sr(String status){
        observer1.update_sr(status);
    }
    public void notifyObserver_sw(String status){
        observer1.update_sw(status);
    }
    public String getStatus(){
        return observer1.getLog();
    }
}
