import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    public int getNumber() {
        return number;
    }
    public String getMode(){
        if(number<10) return "Sunny";
        else if(number>=10 && number<20) return "Cloudy";
        else return "Rainy";
    }
    public void execute() {
        for (int i = 0; i < 10; i++) {
            number = random.nextInt(30); //0~29
            notifyObservers();
        }
    }
}