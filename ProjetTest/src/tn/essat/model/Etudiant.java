package tn.essat.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEt;
	private String nomEt;
	private String prenomEt;
	@OneToOne
	@JoinColumn(name ="cat_id")
	private Categorie cat;
	public Etudiant(int idEt, String nomEt, String prenomEt, Categorie cat) {
		super();
		this.idEt = idEt;
		this.nomEt = nomEt;
		this.prenomEt = prenomEt;
		this.cat = cat;
	}
	public Etudiant() {
		super();
	}
	public int getIdEt() {
		return idEt;
	}
	public void setIdEt(int idEt) {
		this.idEt = idEt;
	}
	public String getNomEt() {
		return nomEt;
	}
	public void setNomEt(String nomEt) {
		this.nomEt = nomEt;
	}
	public String getPrenomEt() {
		return prenomEt;
	}
	public void setPrenomEt(String prenomEt) {
		this.prenomEt = prenomEt;
	}
	public Categorie getCat() {
		return cat;
	}
	public void setCat(Categorie cat) {
		this.cat = cat;
	}

}