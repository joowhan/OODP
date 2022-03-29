public class Trouble {
    private int number; //trouble number
    public Trouble(int number) { // create trouble number
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public String toString() {
        return "[Trouble " + number + "]";
    }
}