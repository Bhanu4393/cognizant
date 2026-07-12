import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server Started");

            Socket socket = serverSocket.accept();

            InputStream input = socket.getInputStream();
            OutputStream output = socket.getOutputStream();

            byte[] data = new byte[100];

            int length = input.read(data);

            String message = new String(data, 0, length);

            System.out.println("Client: " + message);

            output.write("Hello Client".getBytes());

            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}