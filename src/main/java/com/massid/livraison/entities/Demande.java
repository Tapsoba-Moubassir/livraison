package com.massid.livraison.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demandetab")
public class Demande {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom_prenom;
	private String infos_colis;
	private String lieu_pickup;
	private String lieu_livraison;
	private String statut;
	private String date_operation;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom_prenom() {
		return nom_prenom;
	}
	public void setNom_prenom(String nom_prenom) {
		this.nom_prenom = nom_prenom;
	}
	public String getInfos_colis() {
		return infos_colis;
	}
	public void setInfos_colis(String infos_colis) {
		this.infos_colis = infos_colis;
	}
	public String getLieu_pickup() {
		return lieu_pickup;
	}
	public void setLieu_pickup(String lieu_pickup) {
		this.lieu_pickup = lieu_pickup;
	}
	public String getLieu_livraison() {
		return lieu_livraison;
	}
	public void setLieu_livraison(String lieu_livraison) {
		this.lieu_livraison = lieu_livraison;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getDate_operation() {
		return date_operation;
	}
	public void setDate_operation(String date_operation) {
		this.date_operation = date_operation;
	}
	
	
	
	
	
}
