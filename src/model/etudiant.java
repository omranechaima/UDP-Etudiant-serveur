package model;

import java.net.InetAddress;

public class etudiant {
	private String login;
	private InetAddress addIP;
	private int port;
	public etudiant(String login, InetAddress addIP, int port) {
	super();
	this.login = login;
	this.addIP = addIP;
	this.port = port;
	}
	public String getLogin() {
	return login;
	}
	public void setLogin(String login) {
	this.login = login;
	}
	public InetAddress getAddIP() {
	return addIP;
	}
	public void setAddIP(InetAddress addIP) {
	this.addIP = addIP;
	}
	public int getPort() {
	return port;
	}
	public void setPort(int port) {
	this.port = port;
	}

	}




