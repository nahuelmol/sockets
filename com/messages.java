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

    @Sender
    public voud Sender(String newSender){
        Send = newSender;
    };
}

public class messages {
	public static void FirstContact(){
		System.out.println("Hello");
	}
}
