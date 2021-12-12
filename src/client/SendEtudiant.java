package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import model.*;

public class SendEtudiant extends Thread {
	private DatagramSocket socket;
	private etudiant e;


	public SendEtudiant(DatagramSocket socket, etudiant e) {
	super();
	this.socket = socket;
	this.e = e;
	}


	public void run(){
	while(true){
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        try {
	        	
	       String msg=in.readLine();
	       msg="@"+e.getLogin()+"@"+msg ;
	       DatagramPacket p =new DatagramPacket(msg.getBytes(), msg.length() ,e.getPort());
	       socket.send(p);


	        	} catch (Exception e) {
	
	}
	}
	}

}
