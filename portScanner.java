import java.net.*;

public class portScanner {
    public static void main(String[] args) {
        String host = "localhost"; // The address to scan
        int timeout = 1000; // Timeout for connection attempts (in milliseconds)

        // Iterate over all possible ports in the range from 1 to 65535
        for (int port = 1; port <= 65535; port++) {
            try {
                // Attempt to establish a connection to the specified port on the given address
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(host, port), timeout);
                socket.close();

                // If the connection is successful, print information about the open port
                System.out.println("Port " + port + " is open");
            } catch (Exception ex) {
                // If the connection fails, the port is considered closed
                // We may not print any information about closed ports, but for our example, we won't do that
            }
        }
    }
}
