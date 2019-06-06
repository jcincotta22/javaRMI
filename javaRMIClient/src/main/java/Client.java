import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class Client {
    private Client() {}
    public static void main(String[] args) {
        try {
            // Getting the registry

            Registry registry = LocateRegistry.getRegistry(1099);
            Hello server = (Hello) registry
                    .lookup("Hello");
            server.printMsg();

            String msg = server.speak("my message");
            System.err.println("received: " + server.getText());

            System.err.println(msg);

            // System.out.println("Remote method invoked");
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }

    }
}
