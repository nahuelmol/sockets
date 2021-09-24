package frontside;

import java.io.*;  
import java.net.*; 
import java.util.Date;

public class Client {  

	public static void main(String[] args) {  
		int num_client = 1;
        String arg;

    	try{      
        	Socket s=new Socket("localhost",3333);  
        	DataOutputStream dout=new DataOutputStream(s.getOutputStream());  

            Console cnsl = System.console();
            if(cnsl == null){
                System.out.println("There is not console available\n");
            }

            try {
                arg = cnsl.readLine("Enter some value: \n");
                dout.writeUTF(arg);  
                dout.flush();  
                dout.close();  
            }
            finally{
                s.close();  
            }

    		}catch(Exception e){System.out.println(e);}  
		}  
}

