import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            InputStream input = socket.getInputStream();
            OutputStream output = socket.getOutputStream();

            output.write("Hello Server".getBytes());

            byte[] data = new byte[100];

            int length = input.read(data);

            String message = new String(data, 0, length);

            System.out.println("Server: " + message);

            socket.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}