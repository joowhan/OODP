public class RegenerativeBrake{
    private String name;
    Observer observer3;
    public RegenerativeBrake(String name, Observer observer3) {
        this.name = name;
        this.observer3 = observer3;
    }
    public String getName() {
        return name;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
    public String toString(){
        return "Regenerative Brake";
    }
    public void notifyObserver(String status){
        observer3.update(status);
    }
    public void notifyObserver_sr(String status){
        observer3.update_sr(status);
    }
    public void notifyObserver_sw(String status){
        observer3.update_sw(status);
    }
}

