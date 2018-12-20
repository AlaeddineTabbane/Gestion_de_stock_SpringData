package tn.alaeddine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String dateAjoute;
	private String description;
	private float prixAchat;
	private float prixVente;
	private int quantite;
	@ManyToOne
	@JoinColumn(name="magasin_id")
	private Magasin magasin;
	public Produit(Integer id, String dateAjoute, String description, float prixAchat, float prixVente, int quantite,
			Magasin magasin) {
		super();
		this.id = id;
		this.dateAjoute = dateAjoute;
		this.description = description;
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
		this.quantite = quantite;
		this.magasin = magasin;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDateAjoute() {
		return dateAjoute;
	}
	public void setDateAjoute(String dateAjoute) {
		this.dateAjoute = dateAjoute;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}
	public float getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Magasin getMagasin() {
		return magasin;
	}
	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}
	
	
}
