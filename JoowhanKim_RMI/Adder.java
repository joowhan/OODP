import java.rmi.*;

public interface Adder extends Remote {

    public int add(int x, int y) throws RemoteException;
    public int minus(int x, int y) throws RemoteException;
}
