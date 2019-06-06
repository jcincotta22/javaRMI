import java.rmi.RemoteException;
import java.util.ArrayList;

public class ImplHello implements Hello {

    private ArrayList<String> text;

    @Override
    public void printMsg() throws RuntimeException {
        System.err.println("Hello from the implementation");
    }

    @Override
    public String speak(String msg) throws RemoteException {
        System.err.println("returning " + msg);
        return msg + " has been returned";
    }

    public ArrayList<String> getText() throws RemoteException {
        return text;
    }

    public void setText(ArrayList<String> text) throws RemoteException {
        this.text = text;
    }
}
