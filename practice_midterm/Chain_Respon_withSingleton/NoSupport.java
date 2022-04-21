public class NoSupport extends Support {
    public NoSupport(String name, int number) {
        super(name);
    }
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}