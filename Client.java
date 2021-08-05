import java.io.*;  
import java.net.*; 

public class Client {  

	

	public static void main(String[] args) {  
		int num_client = 1;

    	try{      
        	Socket s=new Socket("localhost",3333);  
        	DataOutputStream dout=new DataOutputStream(s.getOutputStream());  

        	dout.writeUTF("1 client");  

        	dout.flush();  
        	dout.close();  
        	s.close();  
    		}catch(Exception e){System.out.println(e);}  
		}  
}

