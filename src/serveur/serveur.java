package serveur;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class serveur {
	static List<etudiant> listEtudiant;
	 
	public static void main(String[] args) throws Exception {



	listEtudiant=new ArrayList<etudiant>();
	DatagramSocket socket=new DatagramSocket(6501);




	while (true) {

	byte[] dataRcv=new byte[1024];
	DatagramPacket pkRcv=new DatagramPacket(dataRcv,dataRcv.length);
	socket.receive(pkRcv);
	String reciveMessage=new String(pkRcv.getData());
	System.out.println("hello");
	System.out.println(reciveMessage);
	int port=pkRcv.getPort();
	InetAddress ip=pkRcv.getAddress();

	if (reciveMessage.startsWith("##")) {
	etudiant e= new etudiant(reciveMessage.substring(2), ip, port);
	if (listEtudiant.contains(e)) {
	String reponse="welcome"+reciveMessage.substring(2);
	DatagramPacket pkSend=new DatagramPacket(reponse.getBytes(), reponse.length(), ip,port);
	socket.send(pkSend);
	}
	else {
	String reponse="sorry";
	DatagramPacket pkSend=new DatagramPacket(reponse.getBytes(), reponse.length(), ip,port);
	socket.send(pkSend);
	}
	}
	else if  (reciveMessage.startsWith("#LIST")) {
	for (etudiant e : listEtudiant) {
	DatagramPacket pkSend=new DatagramPacket(e.getLogin().getBytes(), e.getLogin().length(), ip,port);
	socket.send(pkSend);
	}
	}
	else if  (reciveMessage.contains("@#")) {
	String[] l=reciveMessage.split("@#");
	for (etudiant e : listEtudiant) {
	if (e.getLogin().equals(l[1])) {
	DatagramPacket pkSend=new DatagramPacket(l[2].getBytes(), l[2].length(), ip,port);
	socket.send(pkSend);

	}
	}
	}
	}
	
	}}
