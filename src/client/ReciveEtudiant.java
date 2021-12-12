package client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ReciveEtudiant extends Thread {
	private DatagramSocket socket;
	public ReciveEtudiant(DatagramSocket socket){
		this.socket = socket;
	}
	public void run(){
		while (true){
			DatagramPacket p = new DatagramPacket(new byte[1024],1024);
			try {
				this.socket.receive(p);
				String msg = new String(p.getData(),0,p.getLength());
				System.out.println(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
