import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Hello extends Remote {

    void printMsg() throws RemoteException;

    String speak(String msg) throws RemoteException;

    ArrayList<String> getText() throws RemoteException;

    void setText(ArrayList<String> text) throws RemoteException;
}
