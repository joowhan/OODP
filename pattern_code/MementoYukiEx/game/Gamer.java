package game;
import java.util.*;

public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitsname = {
        "apple", "grape", "banana", "orange",
    };
    public Gamer(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("Cache Increased.");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("Cache Decreased to Half");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("Fruit (" + f + ") Obtained");
            fruits.add(f);
        } else {
            System.out.println("No Change");
        }
    }
    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String)it.next();
            if (f.startsWith("delicious ")) {
                m.addFruit(f);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "delicious ";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}

