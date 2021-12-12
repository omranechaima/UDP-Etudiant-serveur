package model;

public class Message {
	private etudiant sender;
	private etudiant reciver;
	private String message;
	public etudiant getSender() {
	return sender;
	}
	public void setSender(etudiant sender) {
	this.sender = sender;
	}
	public etudiant getReciver() {
	return reciver;
	}
	public void setReciver(etudiant reciver) {
	this.reciver = reciver;
	}
	public String getMessage() {
	return message;
	}
	public void setMessage(String message) {
	this.message = message;
	}
	public Message(etudiant sender, etudiant reciver, String message) {
	super();
	this.sender = sender;
	this.reciver = reciver;
	this.message = message;
	}

}
