import java.util.*;
public class Main {
    public void createObject(){
        MySingleton ms1 = MySingleton.createMySingleton();
        MySingleton ms2 = MySingleton.createMySingleton();
    }
    public static void main(String args[]){
        new Main().createObject();
        MySingleton ms3 = MySingleton.createMySingleton();// only one object
    }
}
