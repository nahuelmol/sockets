import java.net.*;
import java.io.*;

public class server {
    public static void main(String args[]){
        try {
            ServerSocket ss = new ServerSocket(3333);
            Socket s = ss.accept();
        
            DataInputStream din = new DataInputStream(s.getInputStream());
        
            String  str=(String)din.readUTF();  
            System.out.println("message= " + str);  
            ss.close();
        } catch(Exception e){
            System.out.println(e);
        }
        
    }
}