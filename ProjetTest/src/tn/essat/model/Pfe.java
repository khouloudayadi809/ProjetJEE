package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import tn.essat.model.Categorie;
import tn.essat.model.Enseignant;
import tn.essat.model.Etudiant;


@Entity
public class Pfe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPfe;
	
	private String titrePfe;
	
	@OneToOne
	@JoinColumn(name = "et_id")
	private Etudiant Et;
	
	@OneToOne
	@JoinColumn(name = "en_id")
	private Enseignant En;
	
	@OneToOne
	@JoinColumn(name = "cat_id")
	private Categorie cat;
	
	public Pfe(int idPfe, String titrePfe, Etudiant et, Enseignant en, Categorie cat) {
		this.idPfe = idPfe;
		this.titrePfe = titrePfe;
		this.Et = et;
		this.En= en;
		this.cat = cat;
	}
	
	public Pfe(String titre, int et, int en, int cat) {
		
	
	}
	
	public Pfe() {
		super();
	}
	public int getIdPfe() {
		return idPfe;
	}
	public void setIdPfe(int idPfe) {
		this.idPfe = idPfe;
	}
	public String getTitrePfe() {
		return titrePfe;
	}
	public void setTitrePfe(String titrePfe) {
		this.titrePfe = titrePfe;
	}
	public Etudiant getEt() {
		return Et;
	}
	public void setEt(Etudiant et) {
		Et = et;
	}
	public Enseignant getEn() {
		return En;
	}
	public void setEn(Enseignant en) {
		En = en;
	}
	public Categorie getCat() {
		return cat;
	}
	public void setCat(Categorie cat) {
		this.cat = cat;
	}
	
	

}