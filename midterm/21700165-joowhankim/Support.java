//To solve the problem of trouble
import java.util.Random;
import java.util.function.IntFunction;
public abstract class Support {
    private String name; // name of problem solver
    private Support next; // name of next person
    public Support(String name) {
        this.name = name;
    }
    public Support setNext(Support next) { // set next person
        this.next = next;
        return next;
    }
    // call resolve method. If return value is false,
    //shift trouble to next person
    public final void support(Trouble trouble, int ran) {
        if (resolve(trouble)) {
            done(trouble);
            System.out.println(">> Checking Component for "+this.name+"Mode");
            batteryCheck();
            if(ran ==1){
                SlipperyCheck();
            }
            else if(ran==2){
                SandCheck();
            }
            else if(ran ==3){
                PebbleCheck();
            }
        } else if (next != null) { //driving mode changed
            //System.out.println(".....Driving Mode changed to "+ this.next);
            next.support(trouble, ran);
        } else {
            fail(trouble);
        }
    }
    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);
    abstract void batteryCheck();
    abstract void SlipperyCheck();
    abstract void PebbleCheck();
    abstract void SandCheck();
    protected void done(Trouble trouble) {
        System.out.println("Terrain Sensor : " + this.name + " Road.");
        // if(getNumber() == trouble.getPrevNumber()){
        //     System.out.println("No Mode Change ---");
        // }
        
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}