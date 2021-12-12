package model;

import java.util.List;

public class GroupeDisc {
	private String titre;
	private List<etudiant> listEtudiant;
	private List<Message> ListMessage;
	public GroupeDisc(String titre, List<etudiant> listEtudiant, List<Message> listMessage) {
	super();
	this.titre = titre;
	this.listEtudiant = listEtudiant;
	ListMessage = listMessage;
	}
	public String getTitre() {
	return titre;
	}
	public void setTitre(String titre) {
	this.titre = titre;
	}
	public List<etudiant> getListEtudiant() {
	return listEtudiant;
	}
	public void setListEtudiant(List<etudiant> listEtudiant) {
	this.listEtudiant = listEtudiant;
	}
	public List<Message> getListMessage() {
	return ListMessage;
	}
	public void setListMessage(List<Message> listMessage) {
	ListMessage = listMessage;
	}

}
