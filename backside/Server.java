package backside;

import java.net.*;
import java.io.*;
import java.util.Date;
import backside.Precio;

public class Server {

    public static void main(String[] args){

        final Integer port = 3333;
        System.out.println("Running socket server-side in port: "+port.toString());
        String line;
        try {

            Precio p;
            ServerSocket ss = new ServerSocket(port);
            try {
                p = new Precio();
                while(true){
                    Socket s = ss.accept();
                    InputStream value = s.getInputStream();

                    //BufferedReader br = new BufferedReader(new InputStreamReader(value));
                    DataInputStream din = new DataInputStream(value);
                    try {
                        String received = (String)din.readUTF();  
                        int to_int      = Integer.parseInt(received);
                        //String result   = br.readLine();
                        
                        System.out.println("number received: "+ to_int);

                        //br.close();
                        if(received != null){
                            p.pone(to_int);
                            System.out.println("It matches: " + p.da());
                        }else{
                            System.out.println("Received is null");
                            }
                        }
                    catch(Exception e){
                        System.out.println("Error in while: "+e);
                        }
                    finally {
                        s.close();
                    }
                }
            }finally {
                ss.close();
            }

        }catch(Exception e){
            System.out.println("In class Server: "+ e);
        }

    }
}