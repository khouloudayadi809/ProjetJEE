package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Enseignant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEn;
	private String nomEn;
	private String prenomEn;
	@OneToOne
	@JoinColumn(name = "cat_id")
	private Categorie cat;
	public Enseignant(int idEn, String nomEn, String prenomEn, Categorie cat) {
		super();
		this.idEn = idEn;
		this.nomEn = nomEn;
		this.prenomEn = prenomEn;
		this.cat = cat;
	}
	public Enseignant() {
		super();
	}
	public int getIdEn() {
		return idEn;
	}
	public void setIdEn(int idEn) {
		this.idEn = idEn;
	}
	public String getNomEn() {
		return nomEn;
	}
	public void setNomEn(String nomEn) {
		this.nomEn = nomEn;
	}
	public String getPrenomEn() {
		return prenomEn;
	}
	public void setPrenomEn(String prenomEn) {
		this.prenomEn = prenomEn;
	}
	public Categorie getCat() {
		return cat;
	}
	public void setCat(Categorie cat) {
		this.cat = cat;
	}

}