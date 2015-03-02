package Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DaytimeTCPClient {
    public static void main(String[] args) throws IOException {
 
        Socket socket = new Socket("localhost", 12345);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String time = reader.readLine();
        System.out.println(time);
    }
}
