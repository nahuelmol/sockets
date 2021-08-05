package com;

interface Message {
    void Content(String c);
    void Destiny(String d);
    void Sender(String s);
}

class AlertMessage implements Message {

    String Cont;
    String Dest;
    String Send;

    @Override
    public void Content(String newContent){
        Cont = newContent
    };

    @Override
    public void Destiny(String newDestiny){
        Dest = newDestiny;
    };

    @Override
    public void Sender(String newSender){
        Send = newSender;
    };

    public void printModel(){
        System.out.println("content: " + Cont);
    }
}

public class messages {
	public static void FirstContact(){
	    AlertMessage alert = new AlerMessage();
            alert.Content("saludando");
            alert.Sender("soy Lukas");
            alert.Destiny("hola mama");

            System.out.println("Entire message: ");
            alert.printModel();
	}
}
