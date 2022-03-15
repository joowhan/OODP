public class RememberPrev {
    private int number;
    public RememberPrev(int number){
        this.number = number;
    }
    public int getPrev() {
        return number;
    }
    public int setPrev(int number){
        this.number = number;
        return number;
    }
}
