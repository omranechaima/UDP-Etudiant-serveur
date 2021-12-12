package client;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


import model.*;
public class client {
	
	    

	public static void main(String[] args)throws Exception  {
		DatagramSocket socket=new DatagramSocket();
		etudiant e=new etudiant("test", InetAddress.getByName("127.0.0.1"), 3000);
		String msg;
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("entrer login");
		 do{
			 msg =in.readLine();}
			 while(!msg.startsWith("#") );
		DatagramPacket p = new DatagramPacket (msg.getBytes(), msg.length() ,3000);
		socket.send(p);		 
			 
		 
			

		SendEtudiant se=new SendEtudiant(socket,e);
		ReciveEtudiant re = new ReciveEtudiant(socket);
		se.start();
		re.start();
		}
	
	       
   
	

	
}
