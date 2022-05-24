import game.Memento;
import game.Gamer;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 40; i++) {
            System.out.println("==== " + i);
            System.out.println("Current Status:" + gamer);

            gamer.bet();

            System.out.println("Current Cache: " + gamer.getMoney() + " After Betting");

            // Memento Handling
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    (Store current status.)");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    (Restore to Previous Status Because of Short Cache)");
                gamer.restoreMemento(memento);
            }


            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }
}

