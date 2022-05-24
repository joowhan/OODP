//To solve the problem of trouble
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
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }
    public String toString() {
        return "[" + name + "]";
    }
    protected abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}