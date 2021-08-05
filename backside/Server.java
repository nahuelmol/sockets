package backside;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(){

        final Integer port = 3333;
        System.out.println("Running socket server-side in port: "+port.toString());

        try {
            ServerSocket ss = new ServerSocket(port);
            Socket s = ss.accept();
        
            DataInputStream din = new DataInputStream(s.getInputStream());
        
            String  str=(String)din.readUTF();  
            System.out.println(str + " connected");  

            ss.close();

        } catch(Exception e){
            System.out.println("In class Server: "+ e);
        }
        
    }
}