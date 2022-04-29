import java.util.*;
public class MySingleton {
    private static MySingleton obj;
    private MySingleton(){
    
    }   
    
    public static MySingleton getSingletonObj(){
        if(obj ==null){
            obj = new MySingleton();
        }
        return obj;
    }

    public static MySingleton createMySingleton() {
        return null;
    }
}
